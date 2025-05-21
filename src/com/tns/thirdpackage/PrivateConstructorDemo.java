package com.tns.thirdpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		//MyClass obj = new MyClass();
		 MyClass m=MyClass.getObject();
		 m.setId(12);
		 System.out.println(m);

	}

}
