package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyElement {
	static int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an unsorted list of repeated elements in an array, Find the element
		 * with maximum frequency.
		 */
		
		Integer[] a = {2,3,3,2,4,4,4};
		List<Integer> l = Arrays.asList(a);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		Set<Integer> s = hm.keySet();

		l.forEach((item) ->{
			if(hm.containsKey(item)) {
				int value = hm.get(item);
				hm.put(item, ++value);
				if(max < value) {
					max = value;
				}
			} else {
				hm.put(item, 1);	
			}
			
			
		});
		Iterator i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry m = (Map.Entry)i.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
//		hm.forEach((key,value) -> {System.out.println(key + " " + value);});
		System.out.println(max);
	}

}
