package org.example.codecontainer;

public class CodeContainer {

    public CodeContainer(String content) {
    }

    public String getFileName() {
        return "";
    }

    public String getPackageName() {
        return "";
    }
}

class ClassNameNotFoundException extends Exception {
    public ClassNameNotFoundException(String message) {
        super(message);
    }
}
