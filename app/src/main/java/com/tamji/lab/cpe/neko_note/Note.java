package com.tamji.lab.cpe.neko_note;

import java.util.Date;

public class Note {
    int noteId;
    String title;
    String author;
    String context;
    String createDate;

    void getSummary(){
        System.out.println("# " + title + "\n" + context + "\nCreated on " + createDate);
    }

}
