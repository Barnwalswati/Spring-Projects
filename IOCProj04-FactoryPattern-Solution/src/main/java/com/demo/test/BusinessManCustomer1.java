package com.demo.test;

import com.demo.comp.Car;
import com.demo.comp.LuxuryCar;
import com.demo.factory.CarFactory;

public class BusinessManCustomer1 {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("luxory", "UP6876"); 
		car.drive();
	}

}
