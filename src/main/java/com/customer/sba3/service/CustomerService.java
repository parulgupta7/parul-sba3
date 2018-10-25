package com.customer.sba3.service;

import java.util.List;

import com.customer.sba3.model.Customer;



public interface CustomerService {
	Customer addCustomer(Customer cust);
	List<Customer> getAllCustomers();

}
