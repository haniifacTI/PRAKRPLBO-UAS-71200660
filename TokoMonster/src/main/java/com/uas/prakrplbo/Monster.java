package com.uas.prakrplbo;

public abstract class Monster implements Monsterinterface{
    private String nama;

    public Monster(String nama){
        this.nama = nama;
    }

    public abstract String bersuara();

    public void getInfo(){
        //tampil nama : , suara : , gerak :
        System.out.println("Nama: "+getNama());
        System.out.println("Suara: "+bersuara());
        System.out.println("Gerak: " + this.getNama() + " " + bergerak());
    }

    public String getNama(){
        return this.nama;
    }
}
