package com.tamji.lab.cpe.neko_note;

import java.util.Date;

public abstract class Note {
    public Date createdDate;
    int noteId;
    String title;
    String author;
    String createDate;

    public Note(String title) {}

    abstract String getSummary();
    /*{
        System.out.println("# " + title + "\n" + content + "\nCreated on " + createDate);
    }*/

}
