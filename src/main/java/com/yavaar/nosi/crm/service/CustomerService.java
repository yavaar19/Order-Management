package com.yavaar.nosi.crm.service;

import com.yavaar.nosi.crm.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Optional<Customer> findCustomerById(long id);
    Customer saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomerById(long id);
    List<Customer> findAllCustomers();
    Customer findCustomerByIdJoinFetchAddress(long id);
    boolean checkIfCustomerIsNull(long i);
    Customer findCustomerByIdJoinFetchOrder(long id);

}
