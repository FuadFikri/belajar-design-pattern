package com.syamsudin.repository;

import com.syamsudin.objectpool.DatabasePool;

public class Main {
    public static void main(String[] args) {
//        repository dulu namanya DAO (Data Access Object)


        Product product = new Product();
        product.setId("01");
        product.setName("ipone");
        product.setPrice(10000000);

        //      TANPA REPOSITORY Pattern
//        DatabasePool.getConnection().sql("insert into product(id, name, price) values (?,?,?)");


//        repository
        ProductRepository repository = new ProductRepository();
        repository.save(product);
    }
}
