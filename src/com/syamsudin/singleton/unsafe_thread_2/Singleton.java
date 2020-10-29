package com.syamsudin.singleton.unsafe_thread_2;

public final class Singleton {
    private static Singleton singleton;
    private String value;

    //change constructor to private
    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String data){
        if (singleton==null){
            return new Singleton(data);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
