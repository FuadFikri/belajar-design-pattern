package com.syamsudin.bridge.tanpa;

public class Cacing implements Hewan {
    @Override
    public String getName() {
        return "Chacing";
    }

    @Override
    public boolean hidupDiAir() {
        return false;
    }

    @Override
    public boolean hidupDiDarat() {
        return true;
    }
}
