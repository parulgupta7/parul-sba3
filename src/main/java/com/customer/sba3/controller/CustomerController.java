package com.customer.sba3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.sba3.model.Customer;
import com.customer.sba3.service.CustomerService;



@RestController
@RequestMapping(value="/")
public class CustomerController {

	@Autowired
	private CustomerService cs;
	
	@GetMapping("/list")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		
		ResponseEntity<List<Customer>> resp = null;
		
		List<Customer> cust = cs.getAllCustomers();
		
		if(cust!=null)
			resp = new ResponseEntity<List<Customer>>(cust, HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
		return resp;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addEmployee(@RequestBody Customer cust){
		
		ResponseEntity<Customer> resp = null;
		
		resp = new ResponseEntity<>(cs.addCustomer(cust), HttpStatus.OK);
		
		return resp;
		
	}
	
}