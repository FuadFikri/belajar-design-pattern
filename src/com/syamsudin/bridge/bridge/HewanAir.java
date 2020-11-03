package com.syamsudin.bridge.bridge;

//ini bridge
public abstract class HewanAir implements Hewan {


    @Override
    public boolean hidupDiAir() {
        return true;
    }

    @Override
    public boolean hidupDiDarat() {
        return false;
    }
}
