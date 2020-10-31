package com.syamsudin.factory;

import com.syamsudin.factory.Animal;

public class Tiger implements Animal {

    @Override
    public void speak() {
        System.out.println("roarr");
    }
}
