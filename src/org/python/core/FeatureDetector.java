package org.python.core;

/**
 * This class scans a program's source code and tries to determine whether it uses `print` as a function or as a
 * statement, and whether it uses `repeat` for loops.
 */
public class FeatureDetector {

    private final String source;
    private boolean print_statement = false;
    private boolean repeat_loop = false;

    public FeatureDetector(String source) {
        this.source = source;
        scanSource();
    }

    public boolean getPrintStatement() {
        return print_statement;
    }

    public boolean getRepeatLoop() {
        return repeat_loop;
    }

    private int skipSpaces(int i) {
        int len = source.length();
        while (i < len && Character.isSpaceChar(source.charAt(i)))
            i++;
        return i;
    }

    private int skipString(int i) {
        int len = source.length();
        char delim = source.charAt(i++);
        if (i+2 < len && source.charAt(i) == delim && source.charAt(i+1) == delim) {
            i += 2;
            while (i+2 < len) {
                char ch = source.charAt(i++);
                if (ch == delim && source.charAt(i) == delim && source.charAt(i+1) == delim) {
                    return i + 2;
                } else if (ch == '\\')
                    i++;
            }
        } else {
            while (i < len && source.charAt(i) != delim) {
                if (source.charAt(i) == '\\')
                    i += 2;
                else
                    i += 1;
            }
        }
        return i + 1;
    }

    private int posToLine(int i) {
        int result = 1;
        while (i-- > 0) {
            if (source.charAt(i) == '\n')
                result++;
        }
        return result;
    }

    protected void scanSource() {
        int len = source.length();
        int i = 0;
        while (i < len) {
            while (i < len && source.charAt(i) <= ' ')
                i++;
            if (i >= len)
                break;
            char ch = source.charAt(i);
            if (ch == 'p' && i + 6 < len && !print_statement && source.startsWith("print", i) &&
                    !Character.isLetterOrDigit(source.charAt(i + 5)) && source.charAt(i + 5) != '_') {
                i = skipSpaces(i + 5);
                ch = (i < len) ? source.charAt(i) : '\n';
                if (ch != '(' && ch != ')' && ch != ',' && ch != ']' && ch != '}' && ch != ';' && ch != '.') {
                    print_statement = true;
                    if (repeat_loop)
                        return;
                }
            } else if (ch == 'r' && i + 7 < len && !repeat_loop && source.startsWith("repeat", i) &&
                    !Character.isLetterOrDigit(source.charAt(i + 6)) && source.charAt(i + 6) != '_') {
                i = skipSpaces(i + 6);
                ch = (i < len) ? source.charAt(i) : '\n';
                if (ch == ':' || Character.isLetterOrDigit(ch)) {
                    repeat_loop = true;
                    if (print_statement)
                        return;
                } else if (ch == '(') {
                    int level = 1;
                    i++;
                    while (i < len && level > 0) {
                        ch = source.charAt(i++);
                        if (ch == '(')
                            level++;
                        else if (ch == ')')
                            level--;
                        else if (ch == '\'' || ch == '\"')
                            i = skipString(i);
                        else if (ch == '#') {
                            while (i < len && source.charAt(i++) >= ' ') ;
                        }
                    }
                    i = skipSpaces(i);
                    ch = (i < len) ? source.charAt(i) : '\n';
                    if (ch > ' ' && ch != ';' && ch != '.' && ch != ',') {
                        repeat_loop = true;
                        if (print_statement)
                            return;
                    }
                }
            }
            while (i < len) {
                ch = source.charAt(i);
                if (ch == '\'' || ch == '\"')
                    i = skipString(i);
                else if (ch == '#') {
                    while (i < len && source.charAt(i) >= ' ')
                        i++;
                    while (i < len && source.charAt(i) < ' ')
                        i++;
                    break;
                }
                else if (ch == '\n' || ch == '\r')
                    break;
                else
                    i++;
            }
        }
    }
}
