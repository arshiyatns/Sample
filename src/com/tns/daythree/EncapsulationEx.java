package com.tns.daythree;

public class EncapsulationEx 
{
private int serialNum;
private String name;
private int age;
//getter and setter
public int getSerialNum() {
	return serialNum;
}
public void setSerialNum(int serialNum) {
	this.serialNum = serialNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
//tostring method
@Override
public String toString() {
	return "EncapsulationEx [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
}




}
