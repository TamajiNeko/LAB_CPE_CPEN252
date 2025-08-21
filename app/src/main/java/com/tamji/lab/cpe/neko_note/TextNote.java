package com.tamji.lab.cpe.neko_note;

public class TextNote extends Note{
    private String content;

    public TextNote() {
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
