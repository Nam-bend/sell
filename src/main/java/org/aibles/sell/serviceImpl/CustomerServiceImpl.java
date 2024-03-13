package org.aibles.sell.serviceImpl;

import org.aibles.sell.entity.Customer;
import org.aibles.sell.repository.CustomerRepository;
import org.aibles.sell.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getHighValueCustomers() {
        List<Customer> highValueCustomer = new ArrayList<>();
        for (Customer customer : customerRepository.findAll()) {
            if (customer.getLoaiKhachHang().equals("1") && customer.getDoanhSo() > 1000000) {
                highValueCustomer.add(customer);
            }
        }
        return highValueCustomer;
    }
    /*@Override
public List<Customer> getHighValueCustomers() {
    return customerRepository.findAll().stream()
            .filter(customer -> "1".equals(customer.getLoaiKhachHang()) && customer.getDoanhSo() > 1000000)
            .collect(Collectors.toList());
}
*/
}
