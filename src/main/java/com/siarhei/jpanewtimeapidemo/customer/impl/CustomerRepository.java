package com.siarhei.jpanewtimeapidemo.customer.impl;

import com.siarhei.jpanewtimeapidemo.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
