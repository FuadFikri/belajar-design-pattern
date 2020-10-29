package com.syamsudin.singleton.unsafe_thread_2;

public class SingletonApp {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("hellow");
        System.out.println(singleton.getValue());
    }
}
