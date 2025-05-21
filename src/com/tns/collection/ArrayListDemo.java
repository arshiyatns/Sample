package com.tns.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list=new ArrayList();
		System.out.println("the size is"+list.size());
		System.out.println("is it empty"+list.isEmpty());
		list.add(1);
		list.add(20);
		list.add(true);
		list.add("hello");
		list.add(20);
		System.out.println(list);
		
		//homogenous
		List<String> list1=new ArrayList<String>();
		list1.add("hello");
		list1.add("world");
		//list1.add(20);
		System.out.println(list1);

	}

}
