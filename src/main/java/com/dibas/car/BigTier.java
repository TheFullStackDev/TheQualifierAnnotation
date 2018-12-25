package com.dibas.car;

import org.springframework.stereotype.Component;

import com.dibas.annot.AnotherDemoAnnotation;

//@Component
@AnotherDemoAnnotation
public class BigTier implements Tier{

	private String diameter = "22 inch Diameter";
	
	public String getTierDiameter() {
		return diameter;
	}

	public String roll() {
		// TODO Auto-generated method stub
		return null;
	}

}