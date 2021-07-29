package org.python.core.util;

import java.io.InputStream;

public interface CustomModuleFinder {

    String find_module(String name, String moduleName);

    InputStream provide_module_code(String name, String moduleName);

}
