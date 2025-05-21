package com.tns.daythree;

public class EncapsulationDemo {

	public static void main(String[] args) {
		EncapsulationEx obj = new EncapsulationEx();
		//obj.serialNum;
		obj.setSerialNum(10);
		obj.getSerialNum();
		obj.setName("anika");
		obj.getName();
		obj.setAge(20);
		obj.getAge();
		
		System.out.println(obj);

	}

}
