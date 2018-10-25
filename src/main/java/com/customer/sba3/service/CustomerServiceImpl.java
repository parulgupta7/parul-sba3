package com.customer.sba3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.sba3.dao.CustomerDao;
import com.customer.sba3.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao cdao;

	@Override
	public Customer addCustomer(Customer cust) {
		return cdao.save(cust);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return cdao.findAll();
	}

}
