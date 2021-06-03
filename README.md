# Jython: Python for the Java Platform (TigerJython Edition)

This is the _TigerJython_ version of [Jython](https://github.com/jython/jython)
that includes some (non-standard) modifications.  In particular, these modifications
include:

- **Emulation of Python 3 syntax and behaviour:**
  This emulation of Python 3 behaviour is rather limited and superficial.  This is
  _not_ Jython 3!  However, TigerJython is an educational environment, and our aim
  is to backport enough of Python 3 so that beginners can start with current syntax
  until a full Jython 3 version becomes ready.
  
  * Internally, strings are mostly unicode—although we did not replace all occurrences
    of `PyString` by `PyUnicode`.  Hopefully, this will also finally solve the old 
    issue of running Jython on systems where paths can comprise unicode characters.
  * Likewise, `long`s are output without the trailing `L` and identify as `int`s.
  * Some builtin functions are replaced, i.e. `range` is the same as `xrange` in
    Jython.
  
- **Added fields and properties:**
  Sequences have additional properties `.head` and `.tail` to easily access the first
  element of a sequence or the remainder, respectively.  Additionally, `list`s also
  support fully writable properties `.first` and `.last` to access (and change) the
  first or last element of the list, respectively.  `.first` and `.head` are synonyms,
  of course, except that `.head` is read-only whereas `del mylist.first` will work.
  
- **Additional/Modified builtins:**
  Besides the modifications that are indicated by Python 3-emulation (see above), we
  also added some builtin functions and types.  Most prominently, `input()` behaves
  differently in that it is somewhere inbetween Python 2 and Python 3 behaviour: if
  the entered string is a number, the returned type is an `int` or `float`, 
  respectively, whereas other strings are returned as `str`.
  
- **Repeat-loop:**
  There is an additional loop construct using the keyword `repeat`.  You enable it by
  using `from __future__ import repeat_loop`.  It then allows you to say
  `repeat n: suite`, where `n` is the number of desired iterations.
  
- **print/repeat detection:**
  Before properly parsing your program, it will be scanned to detect whether you are
  using `print` as a statement or as a function.  Likewise, it will also try to discover
  the use of `repeat`.  This is not a failsafe method, but aimed at TigerJython's use case
  where most programs use `print` as a function and use `repeat` as a loop.  At the same
  time we need to fully support the entire existing library, which does neither.
  
- **Roadmap/Plans for future extensions:**
  Switching to the new Python 3 parser, bringing full support for Python 3 syntax.
  This will also allow for type annotations (although they will be ignored by the
  compiler/interpreter).


## Original Readme

This is the development repository of Jython,
the implementation of Python in Java.
Only version 2.7 of Python can be supported at present
(but watch this space for a 3.x version).

Along with good (not perfect!) language
and runtime compatibility with CPython 2.7,
Jython 2.7 provides substantial support of the Python ecosystem.
This includes built-in support of *pip/setuptools*
(you can use `bin/pip` if the targets do not include `C` extensions)
and a native launcher for Windows (`bin/jython.exe`)
that works essentially as the `python` command.

Jim Baker presented a talk at PyCon 2015 about Jython 2.7,
including demos of new features: https://www.youtube.com/watch?v=hLm3garVQFo

See [ACKNOWLEDGMENTS](ACKNOWLEDGMENTS) for details about Jython's copyright,
license, contributors, and mailing lists.
Consult [NEWS](NEWS) for detailed release notes, including bugs fixed,
backwards breaking changes, and new features.
We sincerely thank all who contribute to Jython, by bug reports, patches,
pull requests, documentation changes and e-mail discussions.

## How to build Jython

The project uses Git for version-control,
and the master repository is at https://github.com/jython/jython,
You should clone this repository to create a buildable copy of the latest state
of the Jython source.
The previously authoritative repository at https://hg.python.org/jython is not now in use,
remaining frozen at v2.7.2.

### Build using `ant` for development

Jython is normally built using `ant`.
It is necessary to have Ant and at least a Java 8 SDK on the path.
To build Jython in development, we generally use the command:
```
ant
```
This leaves an executable in `dist/bin`
that you may run from the check-out root with:
```
dist/bin/jython
```
Other `ant` targets exist, notably `clean`, and `jar`.

You can test your build of Jython (by running the regression tests),
with the command:
```
dist/bin/jython -m test.regrtest -e -m regrtest_memo.txt
```

### Build an installer using `ant`

If you want to install a snapshot build of Jython, use the command:
```
ant installer
```
This will leave you with a snapshot installer JAR in `dist`,
that you can run with:
```
java -jar jython-installer.jar
```
for the graphical installer, or:
```
java -jar jython-installer.jar --console
```
For the console version. (A `--help` option gives you the full story.)

### Build a JAR using Gradle

Experimentally, we have a Gradle build that results in a family of JARs,
and a POM.
This is intended to provide the Jython core in a form that Gradle and Maven
users can consume as a dependency.
Invoke this with:
```
PS> .\gradlew publish
```
and a JAR and POM are delivered to ` .build2\repo` 

Whereas the JARs delivered by the installer are somewhat "fat",
embedding certain dependencies in shaded (renamed) form,
the JAR from the Gradle build is "spare"
and cites its dependencies externally through a POM.
The project would like to know if this is being done suitably
for downstream use.
