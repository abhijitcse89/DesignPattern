package com.abhijit.j2se.designpattern.factory;

import javax.swing.SwingUtilities;

public class FactoryMain{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new MainFrame();
			}
		});
		
	}
}
/**
 FactoryDesignPattern factory = new FactoryDesignPattern();
		OS obj = factory.show("closed");
		obj.specification();
 */
