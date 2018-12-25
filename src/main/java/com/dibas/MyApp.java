package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dibas.car.FamilyCar;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		FamilyCar myfamilyCar = (FamilyCar) appContext.getBean("familyCar");
		System.out.println(myfamilyCar.getCarDescription());

		((FileSystemXmlApplicationContext) appContext).close();

	}

}
