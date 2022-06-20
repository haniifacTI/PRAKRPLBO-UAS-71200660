package com.uas.prakrplbo;

public class Cerberus extends Monster{
    public Cerberus(String nama) {
        super(nama);
    }

    @Override
    public String bersuara() {
//        Rawrrawr
        return "Rawrrawr";
    }

    public String bergerak(){
//        Berlari
        return "Berlari";
    }
}
