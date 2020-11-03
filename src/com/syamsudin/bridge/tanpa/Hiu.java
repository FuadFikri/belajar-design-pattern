package com.syamsudin.bridge.tanpa;

public class Hiu implements Hewan {
    @Override
    public String getName() {
        return "HIu";
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
