package com.syamsudin.facade.repository;

import com.syamsudin.facade.entity.Customer;
import com.syamsudin.objectpool.DatabasePool;

public class CustomerRepository {
    public void save(Customer customer) {
        DatabasePool.getConnection().sql("insert into bla bla bla");
    }

}
