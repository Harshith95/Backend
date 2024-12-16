package edu.learn.usermgmt.model;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L; // Recommended for version control

	private Long id;
	private String name;
	private String email;
	private int age;
	private Address address;

	// Nested Address Class
	public static class Address implements Serializable {
		private static final long serialVersionUID = 1L;

		private String street;
		private String city;
		private String state;
		private String zip;

		// Getters and Setters
		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		// toString method
		@Override
		public String toString() {
			return "Address{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\''
					+ ", zip='" + zip + '\'' + '}';
		}
	}

	// Getters and Setters for User Class
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// toString method for User Class
	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", age=" + age
				+ ", address=" + address + '}';
	}
}
