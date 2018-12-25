package com.dibas.car;

import org.springframework.stereotype.Component;

@Component("fourCyl")
public class FourCylinderEngine implements Engine {

	public int getNumberOfCylinder() {

		return 4;
	}

	public String drive() {

		return "Driving efficiently with 4 cylinders.";
	}

}
