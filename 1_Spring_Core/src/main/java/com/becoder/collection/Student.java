package com.becoder.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;

	private List<String> address;

	private Set<String> phno;

	private Map<String, String> course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getPhno() {
		return phno;
	}

	public void setPhno(Set<String> phno) {
		this.phno = phno;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phno=" + phno + ", course=" + course + "]";
	}

}
