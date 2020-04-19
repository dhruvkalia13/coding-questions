package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A statement is given, which consist of words, you need to find the words
		 * which occurs the most.
		 */
		String str = "How do you do ?";
		String[] words = str.split(" ");
		List<String> wordsList = Arrays.asList(words);
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		wordsList.forEach((item) -> {
				if(hm.containsKey(item)) {
					int value = hm.get(item);
					hm.put(item, ++value);
				} else {
					hm.put(item, 1);
				}
			});
		hm.forEach((item,value) -> {System.out.println(item + " " + value);});
	}

}
