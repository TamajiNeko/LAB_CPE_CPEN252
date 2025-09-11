package com.tamji.lab.cpe.neko_note;

import java.util.Date;

public class TextNote extends Note{
    private String content;

    public TextNote(String title, Date createdDate, String content) {
        super(null);
    }


    public String setContent(String newTitle, String newContent, String newDate, String author){
        this.title = newTitle;
        this.content = newContent;
        this.createDate = newDate;
        this.author = author;
        return newContent;
    }

    public String getContent(){
        return content;
    }

    String getSummary(){
        return "[Title] " + title + "\n[Create on] " + createDate + "\n" + "[Content] " + content + "\n[Author] " + author;
    }
}
