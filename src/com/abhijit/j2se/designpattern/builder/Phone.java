package com.abhijit.j2se.designpattern.builder;

public class Phone {

	private String brand;
	private String model;
	private double screenSize;
	private int ramSize;
	private double price;
	public Phone(String brand, String model, double screenSize, int ramSize, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.screenSize = screenSize;
		this.ramSize = ramSize;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + ", screenSize=" + screenSize + ", ramSize=" + ramSize
				+ ", price=" + price + "]";
	}

	
}
