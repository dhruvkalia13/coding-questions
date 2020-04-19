package com.practice;

import java.util.Arrays;
import java.util.List;

public class AdditionalElement {

	static int sum1 = 0;
	static int sum2 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Two arrays are given . Second array is exactly similar as the first one,
		 * except one additional element . We need to find that additional element.
		 */
		
		Integer[] first = {4,3,5,7};
		Integer[] second = {1,3,5,6,7};
		List<Integer> a = Arrays.asList(first);
		List<Integer> b = Arrays.asList(second);

		a.forEach((item) -> {sum1 += item;});
		b.forEach((item) -> {sum2 += item;});
		
		System.out.println(String.valueOf(Math.abs(sum1-sum2)));
		Arrays.sort(first);
		
		System.out.println(first[0] +" " +  first[1] + first[2]);
	}

}
