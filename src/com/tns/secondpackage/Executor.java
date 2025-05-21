package com.tns.secondpackage;

import com.tns.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		Base b1= new Base();
		//outside package outside class access
		b1.privateVar=50;
		b1.protectedVar=90;
		b1.defaultVar=80;
		b1.publicVar=70;
		
		b1.methodPublic();
		b1.methodPrivate();
		b1.methodDefault();
		b1.methodProtected();
	}

}
