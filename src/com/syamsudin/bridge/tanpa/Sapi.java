package com.syamsudin.bridge.tanpa;

public class Sapi implements Hewan {
    @Override
    public String getName() {
        return "Sapi";
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
