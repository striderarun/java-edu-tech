package com.codelearner.helper;

import java.io.File;
import java.util.List;

public interface FileOperations {

    /**
     * Create a Java source file from problem code
     *
     * @param codeLines
     * @param className
     * @param language
     * @return
     */
    File createFile(List<String> codeLines, String className, String language);

    /**
     * Compile and check for errors
     *
     * @param file
     * @return
     */
    List<String> syntaxChecker(String file);
}
