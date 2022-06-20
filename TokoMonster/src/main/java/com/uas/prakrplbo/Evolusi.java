package com.uas.prakrplbo;

public class Evolusi extends Monster{
    private Monster monster1;
    private Monster monster2;

    public Evolusi(Monster monster1, Monster monster2){
        super(monster1.getNama() + " " + monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    @Override
    public String bersuara() {
        StringBuilder out = new StringBuilder();
        char[] s1 = monster1.bersuara().toCharArray();
        char[] s2 = monster2.bersuara().toCharArray();

        for (int i = 0; i < s1.length; i++) {
            if(i%2 != 0){
                out.append(s1[i]);
            }else{
                out.append(s2[i]);
            }
        }

        return out.toString();
    }

    public String bergerak(){
        return monster2.bergerak();
    }
}
