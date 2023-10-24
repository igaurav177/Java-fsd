package com.collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;


public class CollectionImplementation {

	public static void main(String[] args) {

		// Implementation of Arraylist
		System.out.println("Implementation of ArrayList : ");
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(100);
		arr.add(200);
		arr.add(500);
		System.out.println(arr);

		// Implementation of LinkedList
		System.out.println("Implementation of LinkedList : ");
		LinkedList<Integer> num= new LinkedList<>();
		num.add(3);
		num.add(4);
		num.add(1);
		System.out.println(num);

		// Implementation of Vector
		System.out.println("Implementation of Vector : ");
		Vector<Integer> element = new Vector<>();
		element.add(300);
		element.add(340);
		element.add(120);
		System.out.println(element);


		// Implementation of HashSet
		System.out.println("Implementation of HashSet : ");
		HashSet<Integer> set=new HashSet<Integer>();  
		set.add(101);  
		set.add(103);  
		set.add(102);
		System.out.println(set);


		// Implementation of LinkedHashSet
		System.out.println("Implementation of LinkedHashSet : ");
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		set2.add(1);  
		set2.add(5);  
		set2.add(2);	       
		System.out.println(set2);
	} 





}


