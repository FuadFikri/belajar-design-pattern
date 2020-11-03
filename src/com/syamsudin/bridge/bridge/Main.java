package com.syamsudin.bridge.bridge;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hewan> hewans = Arrays.asList(
                new Kucing(),
                new Sapi(),
                new Cacing(),
                new Lele(),
                new Hiu()

        );

        hewans.forEach(hewan -> {
            if (hewan instanceof HewanAir){
                HewanAir hewanAir = (HewanAir) hewan;
                System.out.println(hewanAir.getName() + " hidup di air");
            }else if( hewan instanceof  HewanDarat){
                HewanDarat hewanDarat = (HewanDarat) hewan;
                System.out.println(hewanDarat.getName() + " hidup di darat dengan kaki " + hewanDarat.getJumlahKaki());
            }
        });

        /*
        * kunci: kategori / groupping
        * */


    }
}
