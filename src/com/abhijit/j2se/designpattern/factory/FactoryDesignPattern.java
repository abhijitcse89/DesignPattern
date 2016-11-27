package com.abhijit.j2se.designpattern.factory;

public class FactoryDesignPattern {

	public OS show(String str){
		if(str.equalsIgnoreCase("closed"))
			return new IOS();
		
		else if(str.equalsIgnoreCase("open"))
			return new Android();
		
		else
			return new Windows();
	}
}
