package com.demo.comp;

//Dependent class
public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC: 0-param constructor");
	}
	public String deliver(int oid) {
		return oid+" order id ordr delivered by DTDC";
	}

}
