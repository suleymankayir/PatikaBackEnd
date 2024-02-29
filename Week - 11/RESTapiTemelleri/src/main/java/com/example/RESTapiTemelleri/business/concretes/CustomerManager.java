package com.example.RESTapiTemelleri.business.concretes;

import com.example.RESTapiTemelleri.business.abstracts.ICustomerService;
import com.example.RESTapiTemelleri.dao.CustomerRepo;
import com.example.RESTapiTemelleri.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements ICustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer getById(int id) {
        return this.customerRepo.findById(id).orElseThrow() ;
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
       return this.customerRepo.save(customer);
    }

    @Override
    public void delete(int id) {
       this.customerRepo.delete(this.getById(id));
    }

    @Override
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }
}
