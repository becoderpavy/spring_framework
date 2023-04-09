package com.becoder.config;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private Address add;

	public Address getAddress() {
		return add;
	}

	public void setAddress(Address address) {
		System.out.println("Setter call");
		this.add = address;
	}

}
