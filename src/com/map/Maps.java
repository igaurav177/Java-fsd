package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implementation of HashMap
		HashMap<String,Integer> hm = new HashMap();
		hm.put("Oranges",2);
		hm.put("Apples",3);
		hm.put("Mango",5);

		System.out.println("The elements of Hashmap are :");  
		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());  
		}

		// Implementation of HashTable   
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  

		ht.put(1,"Gaurav");  
		ht.put(2,"Deva");  
		ht.put(3,"Komal");  

		System.out.println("\nThe elements of HashTable are : ");  
		for(Map.Entry n:ht.entrySet()){    
			System.out.println(n.getKey()+" "+n.getValue());    
		}

		// Implementation of TreeMap
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();    
		tm.put(1,"Gaurav");  
		tm.put(2,"Deva");  
		tm.put(3,"Komal");     

		System.out.println("\nThe elements of TreeMap are : ");  
		for(Map.Entry l:tm.entrySet()){    
			System.out.println(l.getKey()+" "+l.getValue());    
		}    





	}

}
