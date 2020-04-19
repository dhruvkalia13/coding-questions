package com.practice;

public class ChocolateWrapperProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 *how many chocolates can you eat? 
		 */
		int money = 15;	// money that you have
		int price = 1;  //price of each chocolate
		int wrap = 3;	// exchange of thiese many wrappers can get you one chocolate
		
		int choc = money/price;
		int count = choc + (choc-1) / (wrap-1);
		
		System.out.println(count);
		
	}

}
