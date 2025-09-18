package com.tamji.lab.cpe.neko_note;

import com.google.gson.Gson;

public class NoteMapper {

    static Gson gson = new Gson();

    // OOP -> Entity
    public static NoteEntity toEntity(TextNote note) {
        if (note instanceof TextNote) {
            return new NoteEntity(note.title, "text", null, ((TextNote) note).getContent(), note.createdDate);
/*        } else if (note instanceof CheckList) {
            String jsonItems = gson.toJson(((CheckList) note).getClass());
            return new NoteEntity(note.title, "checklist", jsonItems, null, note.createdDate);*/
        }
        return null;
    }

    // Entity -> OOP
    public static Note fromEntity(NoteEntity entity) {
        if (entity.type.equals("text")) {
            return new TextNote(entity.title, entity.createdDate, entity.content) {
            };
/*        } else if (entity.type.equals("checklist")) {
            List<String> items = gson.fromJson(entity.checklistItemsJson, new TypeToken<List<String>>(){}.getType());
            return new CheckList(entity.title, entity.createdDate, items);*/
        }
        return null;
    }
}