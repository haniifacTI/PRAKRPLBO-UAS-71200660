package com.uas.simplenotes;

import java.util.ArrayList;
import java.util.List;

public class ListNotes extends Notes{
    private ArrayList<String> listNotes = new ArrayList<String>();

    public ListNotes(String name){
        super(name);
    }

    public void showNotes(){
        for (int i = 0; i < listNotes.size(); i++) {
            System.out.println(i+1 + ". " + listNotes.get(i));
        }
    }

    public List<String> findNotes(String keyword) throws NotesException {
        List<String> listFound = new ArrayList<String>();

        if(keyword.equals("")){
            throw new NotesException("Keyword tidak boleh kosong");
        }else{
            for (int i = 0; i < listNotes.size(); i++) {
                String listText = listNotes.get(i);
                if(listText.indexOf(keyword) != -1){
                    listFound.add(listText);
                }
            }

            return listFound;
        }
    }

    public void addNotes(String noteItems) throws NotesException {
        if(noteItems == null || noteItems.equals("")){
            throw new NotesException("Note tidak boleh kosong");
        }else{
            this.listNotes.add(noteItems);
        }
    }
}
