package com.yycccloud.clipboard.entity;

public class Clipboard {
    int id;
    String content;
    long date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Clipboard(int id, String content, long date) {
        this.id = id;
        this.content = content;
        this.date = date;
    }
}
