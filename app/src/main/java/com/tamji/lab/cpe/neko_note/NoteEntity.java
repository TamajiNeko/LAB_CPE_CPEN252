package com.tamji.lab.cpe.neko_note;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "notes")
public class NoteEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    public String title;

    @NonNull
    public String type;

    public String checklistItemsJson;
    public String content;

    public String createdDate;
    public String author;

    public NoteEntity(@NonNull String title, @NonNull String type, String checklistItemsJson, String content, String createdDate, String author) {
        this.title = title;
        this.type = type;
        this.checklistItemsJson = checklistItemsJson;
        this.content = content;
        this.createdDate = createdDate;
        this.author = author;
    }
}
