package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addr")
public class Address {
	@Id
	private int aid;
	private String city;
	private String country;
	private int zip;
	public Address() {}
	public Address(int aid, String city, String country, int zip) {
		super();
		this.aid = aid;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
