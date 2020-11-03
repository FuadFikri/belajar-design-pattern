package com.syamsudin.bridge.tanpa;

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
            if (hewan.hidupDiAir()){
                System.out.println(hewan.getName() + " hidup di air");
            }else if (hewan.hidupDiDarat()){
                if (hewan instanceof Kucing){
                    Kucing kucing = (Kucing) hewan;
                    System.out.println(kucing.getName() + " hidup didarat dgn kaki " + kucing.getJumlahKaki());
                }else if( hewan instanceof Sapi){
                    Sapi sapi = (Sapi) hewan;
                    System.out.println(sapi.getName() + " hidup didarat dgn kaki " + sapi.getJumlahKaki());
                }else if( hewan instanceof Cacing){
                    Cacing cacing = (Cacing) hewan;
                    System.out.println(cacing.getName() + " hidup didarat  ");
                }

            }
        });


    }
}
