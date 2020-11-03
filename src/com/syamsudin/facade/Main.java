package com.syamsudin.facade;

import com.syamsudin.facade.entity.Address;
import com.syamsudin.facade.entity.Customer;

public class Main {
    public static void main(String[] args) {
        /*
        * facade pattern penerapannya yaitu service seperti pada spring boot
        * yaotu menyembunyikan bussiness logic dari program utama atau controller jika pada web
        * */

        Customer customer = new Customer("01","jooko");
        Address address = new Address("jalan kaliurang", "Sleman");
        Address address2 = new Address("jalan kaliurang", "Sleman");

        customer.getAddresses().add(address);
        customer.getAddresses().add(address2);
        CustomerFacade facade = new CustomerFacade();
        facade.saveCustomer(customer);
    }
}
