package com.syamsudin.factory;

public class AnimalFactory {
    public static Animal create(String type) {
        if (type == "tiger"){
            return new Tiger();
        }else{
            return new Cow();
        }

    }
}
/*
* kalau misal kelas TIger udah ga dipake atau deprecated, dan mau diganti
* dari pada ganti diseluruh client
* kalau pakai factory kayak gini tinggal diganti di factory nya aja
* tinggal ganti return new TigerBaru()  misalnya
* */