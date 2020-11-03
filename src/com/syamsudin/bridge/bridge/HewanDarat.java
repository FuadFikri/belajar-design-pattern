package com.syamsudin.bridge.bridge;

//?ini bridge
public abstract class HewanDarat implements Hewan {

    @Override
    public boolean hidupDiAir() {
        return false;
    }

    @Override
    public boolean hidupDiDarat() {
        return true;
    }

    public abstract Integer getJumlahKaki();
}
