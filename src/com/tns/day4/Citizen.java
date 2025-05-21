package com.tns.day4;

public class Citizen 
{
private String name;
private String address;
private int phno;
private int aadharNo;

public Citizen()
{
	System.out.println("default constructor");
}

public Citizen(String name, String address, int phno, int aadharNo) {
	
	this.name = name;
	this.address = address;
	this.phno = phno;
	this.aadharNo = aadharNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getPhno() {
	return phno;
}

public void setPhno(int phno) {
	this.phno = phno;
}

public int getAadharNo() {
	return aadharNo;
}

public void setAadharNo(int aadharNo) {
	this.aadharNo = aadharNo;
}

@Override
public String toString() {
	return "Citizen [name=" + name + ", address=" + address + ", phno=" + phno + ", aadharNo=" + aadharNo + "]";
}


}
