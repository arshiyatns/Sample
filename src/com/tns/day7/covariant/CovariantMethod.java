package com.tns.day7.covariant;
//base class
class Color
{
protected static Color	getColor()
	{
		Color s = new Color();
		return s;
		
	}

}

class Red extends Color
{
	public static  Red getColor()
	{
		Red s = new Red();
		return s;
	}
}
public class CovariantMethod 
{
	public static void main(String[] args) 
	{
//		Color c1 = new Color();
//	Color c2= c1.getColor();
//	System.out.println(c2);
//
//	Red r1 = new Red();
//	Red r2 = Red.getColor();
//	System.out.println(r2);
		System.out.println(Color.getColor());
	
	}
	}

