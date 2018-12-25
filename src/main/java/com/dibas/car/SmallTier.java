package com.dibas.car;

import org.springframework.stereotype.Component;

import com.dibas.annot.RandomDemoAnnotation;

//@Component
@RandomDemoAnnotation
public class SmallTier implements Tier{

	private String tierDiameter = "12 inch Diameter";
	
	public String getTierDiameter() {
		return tierDiameter;
	}

	public String roll() {
		// TODO Auto-generated method stub
		return null;
	}

}
