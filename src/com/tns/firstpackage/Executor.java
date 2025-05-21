package com.tns.firstpackage;

public class Executor {

	public static void main(String[] args) {
		Base b1 = new Base();//created object of base class
		//b1.privateVar=21;
		b1.defaultVar=30;
		b1.protectedVar=40;
		b1.publicVar=50;
		
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//b1.methodPrivate();

	}

}
