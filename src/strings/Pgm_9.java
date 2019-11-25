package strings;

import java.util.Scanner;

public class Pgm_9 {

		       	    
		    public static void main(String[] args) {
		  
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the String = ");
		        String str = sc.nextLine();
		        sc.close();
		        
		        String[] strarr = str.split(" ");
		    	
		        StringBuilder sb = new StringBuilder();
	
		        for (String word : strarr) {
		            if (!word.equals(" ")) {
		            
		                StringBuilder sb1 = new StringBuilder(word);
		             
		                String reverseString = sb1.reverse().toString();
	
		                sb.append(reverseString + " ");
		            }
		        }
		    }
		
}
