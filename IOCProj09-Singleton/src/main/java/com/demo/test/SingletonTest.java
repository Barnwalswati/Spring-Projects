package com.demo.test;

import com.demo.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2 "+(p1==p2));
	}

}
