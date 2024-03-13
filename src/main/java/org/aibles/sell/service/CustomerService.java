package org.aibles.sell.service;

import org.aibles.sell.entity.Customer;
import org.aibles.sell.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();

    List<Customer> getHighValueCustomers();


}

