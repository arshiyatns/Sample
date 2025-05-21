package com.tns.day7.methodoverriding;

public class OverrridingDemo {

	public static void main(String[] args) {
		RBI rbi;
		rbi=new HDFC();
		System.out.println(rbi);
		rbi=new RBI();
		System.out.println(rbi);
		rbi = new ICICI();
		System.out.println(rbi);

	}

}
