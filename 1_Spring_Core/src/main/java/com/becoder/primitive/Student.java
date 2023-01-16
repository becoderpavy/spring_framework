package com.becoder.primitive;

public class Student {

	private int id;

	private String name;

	private String address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		System.out.println("setter injection : id");

		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		System.out.println("setter injection : name");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {

		System.out.println("setter injection : Address");
		this.address = address;
	}

}
