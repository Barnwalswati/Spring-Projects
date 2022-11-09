package com.demo.comp;

//Dependent class
public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart: 0-param constructor");
	}
	public String deliver(int oid) {
		return oid+" order id ordr is delivered";
	}
}
