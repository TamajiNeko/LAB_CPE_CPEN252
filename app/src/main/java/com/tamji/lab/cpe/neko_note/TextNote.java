package com.tamji.lab.cpe.neko_note;

import java.util.Date;

public class TextNote extends Note{
    private String content;
    private String body;

    public TextNote(String title, String createdDate, String content, String author) {
        super(title, String.valueOf(createdDate));
        this.title = title;
        this.createdDate = createdDate;
        this.content = content;
        this.author = author;
    }

    public void setContent(String newTitle, String newContent, String newDate, String author){
        this.title = newTitle;
        this.content = newContent;
        this.createdDate = newDate;
        this.author = author;
    }

    public String getTitle(){ return this.title; }
    public String getTextContent(){ return this.body; }

    public String getContent(){
        return content;
    }

    public String getSummary(){
        if (content.isEmpty()) {
            return title + " - By " + author + " (" + createdDate + ")\nNo content (´。＿。｀)\n\n";
        }
        return title + " - By " + author + " (" + createdDate + ")\n" + content + "\n\n";
    }
}
