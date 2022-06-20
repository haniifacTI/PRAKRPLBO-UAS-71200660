package com.uas.prakrplbo;

public class Manticore extends Monster{
    public Manticore(String nama) {
        super(nama);
    }

    @Override
    public String bersuara() {
//        Roarroar
        return "Roarroar";
    }

    public String bergerak(){
//        Terbang
        return "Terbang";
    }
}
