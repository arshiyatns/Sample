package com.tns.day2;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='y';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+"x is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x +"x is a digit");
			default: System.out.println("nothing matches");
			break;
			
		}
		

	}

}
