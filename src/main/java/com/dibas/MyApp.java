package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dibas.car.BigTier;
import com.dibas.car.FamilyCar;
import com.dibas.car.SmallTier;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		//FamilyCar myfamilyCar = (FamilyCar) appContext.getBean("familyCar");
		//System.out.println(myfamilyCar.getCarDescription());
		SmallTier smallTier = (SmallTier) appContext.getBean("smallTier");
		System.out.println("Small Tier Diameter :"+smallTier.getTierDiameter());

		BigTier bigTier = (BigTier) appContext.getBean("bigTier");
		System.out.println("Big Tier Diameter :"+bigTier.getTierDiameter());
		
		
		
		((FileSystemXmlApplicationContext) appContext).close();

	}

}
