package model.entities;

public class Person {
	private String name;
	private String cpf;
	private String address;
	private String email;
	private String phoneNumber;

	public Person() {
	}
	

	public Person(String name, String cpf, String address, String email, String phoneNumber) {
		this.name = name;
		this.cpf = cpf;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

}
