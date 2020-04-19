package com.practice;

public class FrequencySubstring {
/*
 * Given a input string and a substring. Find the frequency of occurrences of substring in given string.
 * 
 * Input : man (pattern)
        dhimanman (string)
Output : 2

Input : aa (pattern)
        aaaaa (String)
Output : 4

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aa";
		String input = "banana";
		
		int count = 0;
		int lengthStr = str.length();
		for(int i = 0; i <= input.length() - lengthStr; i++) {
			if((input.substring(i, i+lengthStr)).equals(str)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
