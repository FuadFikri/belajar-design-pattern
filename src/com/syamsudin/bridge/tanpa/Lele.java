package com.syamsudin.bridge.tanpa;

public class Lele implements Hewan {
    @Override
    public String getName() {
        return "lele";
    }

    @Override
    public boolean hidupDiAir() {
        return true;
    }

    @Override
    public boolean hidupDiDarat() {
        return false;
    }
}
