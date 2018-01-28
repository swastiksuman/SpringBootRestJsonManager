package com.jsonmaker.restjsonconverter.models;

import java.util.List;

public class InputData {
	private int id;
	private String name;
	private List<AddressData> addressData;

	public InputData() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AddressData> getAddressData() {
		return addressData;
	}

	public void setAddressData(List<AddressData> addressData) {
		this.addressData = addressData;
	}

	@Override
	public String toString() {
		return "InputData [id=" + id + ", name=" + name + ", addressData="
				+ addressData + "]";
	}
	
	
}
