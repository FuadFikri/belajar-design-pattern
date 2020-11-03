package com.syamsudin.facade.repository;

import com.syamsudin.facade.entity.Address;
import com.syamsudin.objectpool.DatabasePool;

public class AddressRepository {
    public void save(Address address) {
        DatabasePool.getConnection().sql("insert into bla bla bla");
    }
}
