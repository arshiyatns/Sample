package com.tns.firstpackage;

public class Base 
{
int defaultVar=10;
private int privateVar=20;
protected int protectedVar=30;
public int publicVar=40;

void methodDefault()
{
	System.out.println("iam a default variable");
	System.out.println("access default data"+defaultVar);
}

public void methodPublic()
{
	System.out.println("iam a public variable");
	System.out.println("access default data"+publicVar);
}

private void methodPrivate()
{
	System.out.println("iam a private variable");
	System.out.println("access default data"+privateVar);
}

protected void methodProtected()
{
	System.out.println("iam a protected variable");
	System.out.println("access default data"+protectedVar);	
}
}
