package com.demo.test;

import com.demo.comp.BudgetCar;
import com.demo.comp.Car;
import com.demo.factory.CarFactory;

public class ProfessionalCustomer1 {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("budget", "UP2723");
		car.drive();
	}

}
