package com.becoder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Shyam {

	private int id;

	private String shName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShName() {
		return shName;
	}

	public void setShName(String shName) {
		this.shName = shName;
	}

	@Override
	public String toString() {
		return "Shyam [id=" + id + ", shName=" + shName + "]";
	}

	/*
	 * public Shyam() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public void doEat() { System.out.println("Shyam is Eating"); }
	 * 
	 * public void doRead() { System.out.println("Shyam is Reading"); }
	 * 
	 * @PostConstruct public void init() { System.out.println("inti"); }
	 * 
	 * 
	 * @PreDestroy public void destroy() { System.out.println("destroy"); }
	 */
}
