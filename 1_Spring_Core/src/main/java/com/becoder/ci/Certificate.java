package com.becoder.ci;

public class Certificate {

	private int id;

	private String certificateName;

	public Certificate(int id, String certificateName) {
		super();
		this.id = id;
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", certificateName=" + certificateName + "]";
	}

}
