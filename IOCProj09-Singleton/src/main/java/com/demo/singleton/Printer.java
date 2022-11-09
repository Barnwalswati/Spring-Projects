package com.demo.singleton;

public class Printer {
	private static Printer INSTANCE;
	
	private Printer() {
	 System.out.println("Printer.Printer().0-param constructor");
	}
	
	//static Factory methods
	public static Printer getInstance(){
		//singleton logic
		if(INSTANCE==null)
			INSTANCE = new Printer();
		return INSTANCE;		
	}
	
	//b.method
	public void print(String msg) {
		System.out.println(msg);
	}
}
