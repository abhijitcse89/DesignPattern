package com.abhijit.j2se.designpattern.builder;

public class SmaprtphoneShop {

	public static void main(String[] args) {
//		Phone ph = new Phone("Apple","5s",4.7,2,40000);
//		System.out.println(ph);
		Phone ph = new PhoneBuilder().setBrand("Apple").setModel("5s").setPrice(20000).getPhone();
		System.out.println(ph);
	}
}
