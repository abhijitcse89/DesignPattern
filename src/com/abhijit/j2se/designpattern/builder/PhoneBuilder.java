package com.abhijit.j2se.designpattern.builder;

public class PhoneBuilder {

	private String brand;
	private String model;
	private double screenSize;
	private int ramSize;
	private double price;
	
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}
	public PhoneBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(brand, model, screenSize, ramSize, price);
	}
}
