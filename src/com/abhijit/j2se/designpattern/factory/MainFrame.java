package com.abhijit.j2se.designpattern.factory;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{

	private JTextField searchFiled;
	private JButton searchButton;
	
	MainFrame(){
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		///////////////////////////////////////////////////
		searchFiled = new JTextField(15);
		searchButton = new JButton("Search");
		setLayout(new BorderLayout());
		
		add(new JLabel("Search String: "),BorderLayout.NORTH);
		add(searchFiled,BorderLayout.NORTH);
		add(searchButton,BorderLayout.SOUTH);
		//////////////////////////////////////////////////
		searchButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String input = searchFiled.getText();
				factoryMethod(input);
			}
		});
		
		
	}
	void factoryMethod(String input){
		FactoryDesignPattern factory = new FactoryDesignPattern();
		OS obj = factory.show(input);
		obj.specification();
	}
}
