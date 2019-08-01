package com.siarhei.jpanewtimeapidemo.customer;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface CustomerService {

    Customer createCustomer(Customer customer);

    Customer getCustomerById(Long id);

    List<Customer> getCustomers();

    void deleteCustomerById(Long id);

}
