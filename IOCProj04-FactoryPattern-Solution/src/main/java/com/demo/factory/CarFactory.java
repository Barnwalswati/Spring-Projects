package com.demo.factory;

import com.demo.comp.BudgetCar;
import com.demo.comp.Car;
import com.demo.comp.LuxuryCar;
import com.demo.comp.SportsCar;

public class CarFactory {
	//factor method having factory pattern(create and return one of several related classes obj)
	public static Car createCar(String type, String regNo) {
		if(type.equalsIgnoreCase("sports"))
			return new SportsCar(regNo);
		else if(type.equalsIgnoreCase("budget"))
			return new BudgetCar(regNo);
		else if(type.equalsIgnoreCase("luxory"))
			return new LuxuryCar(regNo);
		else
			throw new IllegalArgumentException("Invalid car type");
	}
}
