package com.syamsudin.singleton.unsafe_thread_1;

public class OrderService {

    public void save(String data){
        DatabaseHelper.getConnection().sql("insert into x "+ data);
    }
}
