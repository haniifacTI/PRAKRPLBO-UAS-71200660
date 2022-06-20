package com.uas.prakrplbo;

public class Cyclops extends Monster{
    public Cyclops(String nama){
        super(nama);
    }

    @Override
    public String bersuara() {
//        Hohohoho
        return "Hohohoho";
    }

    public String bergerak(){
        //Berjalan
        return "Berjalan";
    }
}
