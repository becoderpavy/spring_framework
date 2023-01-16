package com.becoder.model;

public class Student {

	private int id;

	private String name;

	private String addres;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addres=" + addres + "]";
	}

}
