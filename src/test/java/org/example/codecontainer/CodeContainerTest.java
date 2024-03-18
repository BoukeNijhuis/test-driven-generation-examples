package org.example.codecontainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeContainerTest {

    @Test
    void fileNameExtraction() throws RuntimeException {
        testFileNameExtraction("class HappyFlow{}", "HappyFlow.java");
        testFileNameExtraction("   class HappyFlow{}", "HappyFlow.java");
        testFileNameExtraction("public class HappyFlow{}", "HappyFlow.java");
        testFileNameExtraction(" public class HappyFlow{}", "HappyFlow.java");
        testFileNameExtraction("public class HappyFlow    {}", "HappyFlow.java");
        testFileNameExtraction("public     class HappyFlow{}", "HappyFlow.java");
        testFileNameExtraction("public class    HappyFlow{}", "HappyFlow.java");
    }

    private void testFileNameExtraction(String content, String expectedFileName) throws RuntimeException {
        CodeContainer co = new CodeContainer(content);
        assertEquals(expectedFileName, co.getFileName());
    }

    @Test
    void packageNameExtraction() throws RuntimeException {
        testPackageNameExtraction("package happyflow; class C{}", "happyflow");
        testPackageNameExtraction("   package happyflow; class C{}", "happyflow");
        testPackageNameExtraction("package    happyflow; class C{}", "happyflow");
        testPackageNameExtraction("package nl.happyflow; class C{}", "nl.happyflow");
        testPackageNameExtraction("package happyflow   ; class C{}", "happyflow");
        testPackageNameExtraction("class C{}", "");
    }

    private void testPackageNameExtraction(String content, String expectedPackageName) {
        CodeContainer co = new CodeContainer(content);
        assertEquals(expectedPackageName, co.getPackageName());
    }

}