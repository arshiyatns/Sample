package com.tns.day4;

public class Student extends Citizen
{
private int rollNo;
private String collegeName;

//public Student()
//{
//	super();
//}

public Student(String name, String address, int phno, int aadharNo, int rollNo,String collegeName) {
	super(name, address, phno, aadharNo);
	this.rollNo=rollNo;
	this.collegeName=collegeName;
	
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName() + ", getAddress()="
			+ getAddress() + ", getPhno()=" + getPhno() + ", getAadharNo()=" + getAadharNo() + "]";
}


}
