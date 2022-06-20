package com.uas.simplenotes;

public class TextNotes extends Notes{
    private StringBuilder notes = new StringBuilder();

    public TextNotes(String name){
        super(name);
    }

    public void showNotes(){
        System.out.println(notes.toString());
    }

    public int findNotes(String keyword) throws NotesException{

        if(keyword.equals("")){
            throw new NotesException("Note tidak boleh kosong");
        }else{
            return notes.toString().indexOf(keyword);
        }
    }

    public void addNotes(String noteText) throws NotesException{
        if(noteText.equals("")){
            throw new NotesException("Note tidak boleh kosong");
        }else if(noteText == null){
            throw new NotesException("Note tidak boleh null");
        }else{
            this.notes.append(noteText);
        }
    }
}
