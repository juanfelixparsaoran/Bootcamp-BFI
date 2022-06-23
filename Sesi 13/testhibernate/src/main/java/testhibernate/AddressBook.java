package testhibernate;

import javax.persistence.Entity;

@Entity
public class AddressBook {
	int id;
	String name;
	String address;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
