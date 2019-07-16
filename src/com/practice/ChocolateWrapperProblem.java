package com.practice;

public class ChocolateWrapperProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 15;
		int price = 1;
		int wrap = 3;
		
		int choc = money/price;
		int count = choc + (choc-1) / (wrap-1);
		
		System.out.println(count);
		
	}

}
