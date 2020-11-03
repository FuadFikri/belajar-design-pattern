package com.syamsudin.repository;

import com.syamsudin.objectpool.DatabasePool;

public class ProductRepository {

    public void save(Product product){
        DatabasePool.getConnection().sql("insert into bla bla bla");
    }

    public void update(Product product){
        DatabasePool.getConnection().sql("update product bla bla bla");
    }

    public void delete(String id){
        DatabasePool.getConnection().sql("delete product bla bla bla");
    }

    public void selectAll(){
        DatabasePool.getConnection().sql("select *  product bla bla bla");
    }
}
