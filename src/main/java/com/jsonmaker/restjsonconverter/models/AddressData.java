package com.jsonmaker.restjsonconverter.models;

public class AddressData {
	private String city;

	public AddressData() {
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "AddressData [city=" + city + "]";
	}

	public AddressData(String city) {
		super();
		this.city = city;
	}
}
