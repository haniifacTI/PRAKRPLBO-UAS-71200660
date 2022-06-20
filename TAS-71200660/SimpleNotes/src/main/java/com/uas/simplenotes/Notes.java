package com.uas.simplenotes;

public abstract class Notes {
    private String notesName;

    public Notes(String notesName) {
        this.notesName = notesName;
    }

    public abstract void addNotes(String text);

    public abstract void showNotes();

    public static Notes loadNotes(String notesName){

    }

    public void saveNotes(){

    }

}
