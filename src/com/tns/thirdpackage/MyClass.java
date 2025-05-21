package com.tns.thirdpackage;

public class MyClass 
{
private int id;
public static MyClass obj = new MyClass();

//private constructor
private MyClass()
{
	System.out.println("iam a private constructor");
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public static MyClass getObject()// factory method
{
	return obj;
}

@Override
public String toString() {
	return "MyClass [id=" + id + "]";
}

}
