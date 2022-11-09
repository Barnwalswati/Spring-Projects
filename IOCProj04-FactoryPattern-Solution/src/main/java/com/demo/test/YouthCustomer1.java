package com.demo.test;

import com.demo.comp.Car;
import com.demo.comp.SportsCar;
import com.demo.factory.CarFactory;

public class YouthCustomer1 {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("sports", "UP08 EN 668");
		car.drive();
	}

}
