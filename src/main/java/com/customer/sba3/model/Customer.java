package com.customer.sba3.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	

			@Id
			private long id;
			
			private String name;
			private String date;
			private String city;
			private int number;
			
			

			public Customer() {
				super();
			}

			public Customer(long id, String name, String date, String city, int number) {
				super();
				this.id = id;
				this.name = name;
				this.date = date;
				this.city = city;
				this.number = number;
			}

			public String getDate() {
				return date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public int getNumber() {
				return number;
			}

			public void setNumber(int number) {
				this.number = number;
			}

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

				

}