import java.util.*;
public class RunLengthEncoding
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String input = "wwwwaaadexxxxxxywww";
		for(int i = 0; i < input.length(); i++){
		    int count = 1;
		    while(i < input.length()-1 && input.charAt(i) == input.charAt(i+1)){
		        count++;
		        i++;
		    }    
		    System.out.print(input.charAt(i));
		    System.out.print(count);
		}
		
	}
}
