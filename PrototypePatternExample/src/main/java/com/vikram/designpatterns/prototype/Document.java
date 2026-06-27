package com.vikram.designpatterns.prototype;

public class Document implements Cloneable {
    private String title;
    private StringBuilder content;

    public Document(String title, StringBuilder content) {
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StringBuilder getContent() {
        return content;
    }

    @Override
    public Document clone() {
        return new Document(title, new StringBuilder(content.toString()));
    }

    @Override
    public String toString() {
        return title + " -> " + content;
    }
}
