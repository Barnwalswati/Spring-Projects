package com.demo.comp;
//Dependent class
public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL: 0-param constructor");
	}
	public String deliver(int oid) {
		return oid+" order id ordr is delivered by DHL";
	}
}
