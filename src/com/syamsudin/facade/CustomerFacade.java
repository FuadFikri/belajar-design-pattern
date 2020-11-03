package com.syamsudin.facade;

import com.syamsudin.facade.entity.Customer;
import com.syamsudin.facade.repository.AddressRepository;
import com.syamsudin.facade.repository.CustomerRepository;

public class CustomerFacade {
    private CustomerRepository customerRepository = new CustomerRepository();
    private AddressRepository addressRepository = new AddressRepository();

    public void saveCustomer(Customer customer){
        customerRepository.save(customer);

        customer.getAddresses().forEach(address -> {
            addressRepository.save(address);
        });
    }
}
