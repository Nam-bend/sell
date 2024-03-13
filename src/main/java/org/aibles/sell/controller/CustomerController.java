package org.aibles.sell.controller;

import org.aibles.sell.entity.Customer;
import org.aibles.sell.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/value_customer")
    ResponseEntity<List<Customer>> getHighValueCustomers(){
        List<Customer> highValueCustomers = customerService.getHighValueCustomers();
    if(highValueCustomers== null || highValueCustomers.isEmpty()){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }else{
        return new ResponseEntity<>(highValueCustomers, HttpStatus.OK);
    }

    }

}