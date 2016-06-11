package com.davekerr.projecteular;

import java.math.BigInteger;

/**
 * @author Dave_Kerr
 *The prime factors of 13195 are 5, 7, 13 and 29.
 *What is the largest prime factor of the number 600851475143 ?
 */

public class largestPrimeFactor {

	public static void main(String[] args) {
		
		long eular = 600851475143L;
		int max = Integer.MIN_VALUE;
		
		for(int i = 2; i < Math.sqrt(eular); i++){
			
			if(checkPrime(i) && eular % i == 0)
				if(max < i)
					max = i;
		}
		
		System.out.println(max);
	}
	
	public static boolean checkPrime(int num){
		
		BigInteger x = BigInteger.valueOf(num);
		if(x.isProbablePrime(100))
			return true;
		
		else
			return false;
	}
}
