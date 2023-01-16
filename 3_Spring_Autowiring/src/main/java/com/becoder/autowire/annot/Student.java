package com.becoder.autowire.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	@Autowired
	@Qualifier("ad2")
	private Address address;

	/*
	 * public Student(Address address) { super(); this.address = address;
	 * System.out.println("constructor Injection"); }
	 */
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter Injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
