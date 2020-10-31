package com.syamsudin.factory;

import com.syamsudin.factory.Animal;

public class Cow implements Animal {

    @Override
    public void speak() {
        System.out.println("mooow");
    }
}
