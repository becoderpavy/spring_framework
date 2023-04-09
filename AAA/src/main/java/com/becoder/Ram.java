package com.becoder;

public class Ram {

	/*
	 * private int id;
	 * 
	 * private String name;
	 */

	private Shyam sh;

	public Ram(Shyam sh) {
		super();
		this.sh = sh;
	}

	public Shyam getSh() {
		return sh;
	}

	public void setSh(Shyam sh) {
		this.sh = sh;
	}

	@Override
	public String toString() {
		return "Ram [sh=" + sh + "]";
	}

	/*
	 * private String addressx;
	 * 
	 * private List<String> num;
	 * 
	 * private Set<String> address;
	 * 
	 * private Map<String, String> course;
	 * 
	 * 
	 * public Ram(String addressx, String name) { super(); this.addressx = addressx;
	 * this.name = name; }
	 * 
	 * 
	 * public Ram(String name,int id) { System.out.println("string,int");
	 * 
	 * this.id = id; this.name = name; }
	 * 
	 * public Ram(int id, String name) { System.out.println("int,string"); this.id =
	 * id; this.name = name; }
	 * 
	 * public Ram(int id, String name, List<String> num, Set<String> address,
	 * Map<String, String> course) { super(); this.id = id; this.name = name;
	 * this.num = num; this.address = address; this.course = course; }
	 * 
	 * @Override public String toString() { return "Ram [id=" + id + ", name=" +
	 * name + ", addressx=" + addressx + ", num=" + num + ", address=" + address +
	 * ", course=" + course + "]"; }
	 */

}
