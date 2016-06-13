package com.davekerr.projecteular;

public class largestPalindromeProduct {

	public static void main(String[] args) {
	
		int temp = 0;
		
		for(int i = 111; i < 999; i++)
			
			for(int j = 111; j < 999; j++){
				
				int x = i * j;
				
				if(checkPalindrome(Integer.toString(x)))
					if(temp < x)
						temp = x;
			}
		
		System.out.println(temp);
	}
	
	public static boolean checkPalindrome(String number){
		
		StringBuilder rebuiild = new StringBuilder(number);
		
		if(number.equals(rebuiild.reverse().toString()))
				return true;
		
		else
			return false;
	}
	
	
}