package com.customer.sba3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.sba3.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long>{

}
