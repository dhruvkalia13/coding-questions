package com.practice;
public class RunLengthEncoding
{
	public static void main(String[] args) {
		String input = "wwwwaaadexxxxxxywww";
		String output = "";
		for(int i = 0; i < input.length(); i++){
		    int count = 1;
		    while(i < input.length()-1 && input.charAt(i) == input.charAt(i+1)){
		        count++;
		        i++;
		    }    
		    output = output.concat(String.valueOf(input.charAt(i)));
		    
		    output = output.concat(String.valueOf(count));
		 
		}
		   System.out.print(output);
		
	}
}
