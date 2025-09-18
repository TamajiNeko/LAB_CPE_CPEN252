package com.tamji.lab.cpe.neko_note;

import java.util.Date;

public abstract class Note {
    public String createdDate;
    public String title;
    public String author;

    public Note(String title, String createDate) {}


    abstract String getSummary();
    /*{
        System.out.println("# " + title + "\n" + content + "\nCreated on " + createDate);
    }*/

}
