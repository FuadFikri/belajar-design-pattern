package com.syamsudin.bridge.tanpa;

public class Kucing implements Hewan{
    @Override
    public String getName() {
        return "Kucheng";
    }

    @Override
    public boolean hidupDiAir() {
        return false;
    }

    @Override
    public boolean hidupDiDarat() {
        return true;
    }

    public Integer getJumlahKaki(){
        return 4;
    }
}
