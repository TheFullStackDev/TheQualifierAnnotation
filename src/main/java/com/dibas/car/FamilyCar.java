package com.dibas.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.*;

public class FamilyCar {

	@Resource(name="smallTier")
	//@Qualifier(value="sTier")
	private Tier frontLeft;
	@Resource(name="smallTier")
	//@Qualifier(value="sTier")
	private Tier frontRight;
	@Resource(name="bigTier")
	//@Qualifier(value="bTier")
	private Tier rearLeft;
	@Resource(name="bigTier")
	//@Qualifier(value="bTier")
	private Tier rearRight;
	@Resource(name="sixCyl")
	//@Qualifier("fourCyl")
	private Engine engineType;

	public Tier getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(Tier frontLeft) {
		this.frontLeft = frontLeft;
	}

	public Tier getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(Tier frontRight) {
		this.frontRight = frontRight;
	}

	public Tier getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(Tier rearLeft) {
		this.rearLeft = rearLeft;
	}

	public Tier getRearRight() {
		return rearRight;
	}

	public void setRearRight(Tier rearRight) {
		this.rearRight = rearRight;
	}

	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

	public String getDescription() {

		String desc = "";

		if (frontLeft != null) {
			desc += "\nFront Left tier: " + frontLeft.getTierDiameter();
		}
		if (frontRight != null) {
			desc += "\nFront Right tier: " + frontRight.getTierDiameter();
		}
		if (rearLeft != null) {
			desc += "\nRear Left tier: " + rearLeft.getTierDiameter();
		}
		if (rearRight != null) {
			desc += "\nRear Right tier: " + rearRight.getTierDiameter();
		}
		if (engineType != null) {
			desc += "\nEngine : " + engineType.getNumberOfCylinder() + "\n" + engineType.drive();
		}
		if (desc == null || desc == "") {
			desc += "not set yet";
		}

		return desc;
	}

}
