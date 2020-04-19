package com.practice;

import java.util.ArrayList;
import java.util.List;

public class JoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<String> l = new ArrayList<>();
		 * 
		 * l.add("Silver-col"); l.add("Green");
		 * 
		 * System.out.println(String.join(",",l));
		 */
		
		String s = "asd:";
		String[] a = s.split(":",-1);
		System.out.println(a[1]);
	}

}
