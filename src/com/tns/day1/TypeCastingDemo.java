package com.tns.day1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//widening
		byte b=10;// 1 byte of memory
		int i=b;// 2 bytes of memory
		
		System.out.println(i);
		
		//narrowing 
		
		float f1=52.4f;
		int f2=(int)f1;//conversion
		System.out.println(f2);

	}

}
