package org.python.core;

import org.python.expose.*;

import java.awt.Color;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Untraversable
@ExposedType(name = "color", base = PyObject.class, isBaseType = false, doc="color")
public class PyColor extends PyObject {

    public static final PyType TYPE = PyType.fromClass(PyColor.class);

    private final static Map<String, Integer> colorNames = new HashMap<>();
    static {
        colorNames.put("black",     0x000000);
        colorNames.put("white",     0xFFFFFF);
        colorNames.put("red",       0xFF0000);
        colorNames.put("lime",      0x00FF00);
        colorNames.put("blue",      0x0000FF);
        colorNames.put("cyan",      0x00FFFF);
        colorNames.put("magenta",   0xFF00FF);
        colorNames.put("yellow",    0xFFFF00);
        colorNames.put("maroon",    0x800000);
        colorNames.put("green",     0x008000);
        colorNames.put("navy",      0x000080);
        colorNames.put("teal",      0x008080);
        colorNames.put("purple",    0x800080);
        colorNames.put("olive",     0x808000);

        colorNames.put("orange",    0xFFA500);
        colorNames.put("brown",     0xA52A2A);
        colorNames.put("firebrick", 0xB22222);
        colorNames.put("coral",     0xFF7F50);
        colorNames.put("gold",      0xFFD700);
        colorNames.put("salmon",    0xFA8072);
        colorNames.put("crimson",   0xDC143C);
        colorNames.put("turquoise", 0x40E0D0);
        colorNames.put("indigo",    0x4B0082);
        colorNames.put("plum",      0xDDA0DD);
        colorNames.put("violet",    0xEE82EE);
        colorNames.put("orchid",    0xDA70D6);
        colorNames.put("pink",      0xFFC0CB);
        colorNames.put("sienna",    0xA0522D);
        colorNames.put("chocolate", 0xD2691E);
        colorNames.put("azure",     0xF0FFFF);
        colorNames.put("lavender",  0xE6E6FA);
        colorNames.put("beige",     0xF5F5DC);
        colorNames.put("linen",     0xFAF0E6);
        colorNames.put("wheat",     0xF5DEB3);
        colorNames.put("ivory",     0xFFFFF0);
        colorNames.put("grey",      0x808080);
        colorNames.put("gray",      0x808080);
        colorNames.put("silver",    0xC0C0C0);

        colorNames.put("goldenrod",   0xDAA520);
        colorNames.put("skyblue",     0x87CEEB);
        colorNames.put("forestgreen", 0x228B22);
        colorNames.put("darkred",     0x8B0000);
        colorNames.put("darkblue",    0x00008B);
        colorNames.put("seagreen",    0x2E8B57);
        colorNames.put("midnightblue",0x191970);
        colorNames.put("steelblue",   0x4682B4);
        colorNames.put("darkgreen",   0x006400);
        colorNames.put("lawngreen",   0x7CFC00);
        colorNames.put("saddlebrown", 0x8B4513);
        colorNames.put("sandybrown",  0xF4A460);
        colorNames.put("peachpuff",   0xFFDAB9);
        colorNames.put("navajowhite", 0xFFDEAD);
        colorNames.put("mistyrose",   0xFFE4E1);
        colorNames.put("oldlace",     0xFDF5E6);
        colorNames.put("slategray",   0x708090);
        colorNames.put("slategrey",   0x708090);
    }

    private static Integer singleColorValueFromString(String s) {
        if (s.charAt(0) == '#') {
            return Integer.parseInt(s.substring(1), 16);
        } else {
            return colorNames.get(s);
        }
    }

    public static Integer colorValueFromString(String s) {
        if (s == null || s.length() == 0)
            return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if ('a' <= ch && ch <= 'z')
                sb.append(ch);
            if ('0' <= ch && ch <= '9')
                sb.append(ch);
            if (ch == '#' && sb.length() == 0)
                sb.append(ch);
            if (ch == ',' || ch == ';' || ch == '|') {
                if (sb.length() > 0) {
                    Integer result = singleColorValueFromString(sb.toString());
                    if (result != null)
                        return result;
                    sb.delete(0, sb.length());
                }
            }
        }
        if (sb.length() > 0)
            return singleColorValueFromString(sb.toString());
        else
            return null;
    }

    private Color color;

    public PyColor() {
        this(TYPE, Color.BLACK);
    }

    public PyColor(Color color) {
        this(TYPE, color);
    }

    public PyColor(int value) {
        this(TYPE, new Color(value));
    }

    public PyColor(PyType subType, Color color) {
        super(subType);
        this.color = color;
    }

    @ExposedNew
    public static PyObject color___new__(PyNewWrapper new_, boolean init, PyType subtype,
                                   PyObject[] args, String[] keywords) {

        ArgParser ap = new ArgParser("color", args, keywords, new String[]{"color"}, 0);
        PyObject arg = ap.getPyObject(0, null);

        //if (new_.for_type == subtype) {
            if (arg != null) {
                if (arg instanceof PyColor) {
                    return new PyColor(((PyColor) arg).color);
                } else if (arg instanceof PyInteger) {
                    return new PyColor(((PyInteger) arg).getValue());
                } else if (arg instanceof PyString) {
                    String s = ((PyString)arg).asString();
                    Integer cValue = colorValueFromString(s);
                    if (cValue != null)
                        return new PyColor(cValue);
                    throw Py.ValueError("color: not a valid color '" + s + "'");
                } else {
                    throw Py.TypeError("color: can't convert to color value");
                }
            } else
                return new PyColor();
        //} else {    // Returned a 'derived'...
        //}
    }

    @ExposedGet(name = "red")
    public float getRed() {
        return (float)color.getRed() / 255.0f;
    }

    @ExposedSet(name = "red")
    public void setRed(float value) {
        int v = (int)(Math.max(Math.min(value, 1.0) * 255, 0));
        int cValue = color.getRGB() & ~0xFF0000;
        color = new Color(cValue | v << 16);
    }

    @ExposedGet(name = "green")
    public float getGreen() {
        return color.getGreen() / 255.0f;
    }

    @ExposedSet(name = "green")
    public void setGreen(float value) {
        int v = (int)(Math.max(Math.min(value, 1.0) * 255, 0));
        int cValue = color.getRGB() & ~0x00FF00;
        color = new Color(cValue | v << 8);
    }

    @ExposedGet(name = "blue")
    public float getBlue() {
        return color.getBlue() / 255.0f;
    }

    @ExposedSet(name = "blue")
    public void setBlue(float value) {
        int v = (int)(Math.max(Math.min(value, 1.0) * 255, 0));
        int cValue = color.getRGB() & ~0x0000FF;
        color = new Color(cValue | v);
    }

    public int getValue() {
        return color.getRGB();
    }

    @Override
    public String toString() {
        return color_toString();
    }

    @ExposedMethod(names = {"__str__", "__repr__"}, doc = BuiltinDocs.int___str___doc)
    final String color_toString() {
        float[] comps = color.getRGBColorComponents(null);
        return String.format("Color(r:%.2f%%, g:%.2f%%, b:%.2f%%)", comps[0] * 100, comps[1] * 100, comps[2] * 100);
    }

    @Override
    public int hashCode() {
        return color_hashCode();
    }

    @ExposedMethod(names = "__hash__", doc = BuiltinDocs.int___hash___doc)
    final int color_hashCode() {
        return color.hashCode();
    }

    @Override
    public Object __tojava__(Class<?> c) {
        if (c == Color.class) {
            return color;
        }

        if (c == Integer.TYPE || c == Number.class || c == Object.class || c == Integer.class
                || c == Serializable.class) {
            return color.getRGB();
        }

        return super.__tojava__(c);
    }

    @Override
    public PyObject __int__() {
        return color___int__();
    }

    @ExposedMethod
    final PyObject color___int__() {
        return Py.newInteger(Integer.toUnsignedLong(color.getRGB()));
    }

    @Override
    public int __cmp__(PyObject other) {
        return color___cmp__(other);
    }

    @ExposedMethod(type = MethodType.CMP)
    final int color___cmp__(PyObject other) {

        int thisValue = color.getRGB() & 0xFFFFFF;

        if (other instanceof PyColor) {
            return (thisValue == (((PyColor) other).color.getRGB() & 0xFFFFFF)) ? 0 : -2;
        } else if (other instanceof PyInteger) {
            int otherValue = ((PyInteger)other).getValue();
            if (Integer.toUnsignedLong(thisValue) == otherValue || thisValue == otherValue)
                return 0;
            return -2;
        } else if (other instanceof PyString) {
            Integer otherValue = colorValueFromString(((PyString)other).asString());
            if (otherValue != null) {
                if (thisValue == otherValue)
                    return 0;
            }
            return -2;
        }

        return -2;
    }
}
