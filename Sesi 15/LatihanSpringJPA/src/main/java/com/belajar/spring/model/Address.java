package com.belajar.spring.model;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private BigInteger id;

	@Column(nullable = false)
	private String city;

	@Column(nullable = false)
	private String country;

	@Column(nullable = false)
	private String state;

	@Column(nullable = false)
	private String street;

	@Column(nullable = false)
	private String zip_code;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public Address() {
	}

	public Address(String city, String country, String state, String street, String zip_code, User user) {
		this.city = city;
		this.country = country;
		this.state = state;
		this.street = street;
		this.zip_code = zip_code;
		this.user = user;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	@Override
	public String toString() {
		return "Address{" +
				"id=" + id +
				", city='" + city + '\'' + 
				", country='" + country + '\'' +
				", state='" + state + '\'' +
				", street='" + street + '\'' +
				", zip_code='" + zip_code + '\'' +
				", user='" + user.getName() + '\'' +
				'}';
	}
}
