package com.uas.simplenotes;

import java.io.*;
import java.io.Serializable;

public abstract class Notes implements Serializable {
    private String notesName;

    public Notes(String notesName) {
        this.notesName = notesName;
    }

    public abstract void addNotes(String text) throws NotesException;

    public abstract void showNotes() throws NotesException;

    public static Notes loadNotes(String notesName){
        Notes objectNotes = null;

        try{
            FileInputStream file = new FileInputStream(notesName+".ser");
            ObjectInputStream in = new ObjectInputStream(file);
            objectNotes = (Notes)in.readObject();
            in.close();
            file.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return objectNotes;
    }

    public void saveNotes() throws NotesException{
        try{
            FileOutputStream file = new FileOutputStream(this.notesName+".ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);
            out.close();
            file.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
