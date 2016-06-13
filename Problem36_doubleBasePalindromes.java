package com.davekerr.projecteular.solved;

public class Problem36_doubleBasePalindromes {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		long x = 0;
		
		for(int i = 0; i <= 1000000; i++){
			if(checkBasePalindrome(Integer.toString(i)))
				x += i;
		}
		
		System.out.println(x);
	
		System.out.println((System.nanoTime() - start) / 1000000 + " ms");
		return;
		
	}

	public static boolean checkBasePalindrome(String number){

		StringBuilder rebuiild = new StringBuilder(number);
		boolean isBasePalindrome = false;

		if(number.equals(rebuiild.reverse().toString())){

			String numBase2 = Integer.toString((Integer.parseInt(number)), 2);

			rebuiild = new StringBuilder(numBase2);

			if(numBase2.equals(rebuiild.reverse().toString())){
				isBasePalindrome = true;
			}

		}
		
		return isBasePalindrome;

	}
}