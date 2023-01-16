package com.becoder.Spring_App;

public class Ram implements Action {

	public Ram() {
		System.out.println("Ram call");
	}

	public void doEat() {
		System.out.println("Ram is Eating");
	}

	public void doRead() {
		System.out.println("Ram is Reading");
	}

}
