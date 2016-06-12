package com.davekerr.projecteular;

import java.math.BigInteger;

public class findTheNthPrime {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		System.out.println(findPrime(10001));
		
		System.out.println((System.nanoTime() - start) / 1000000 + " ms");
		return;
	}
	
	
	public static int findPrime(int number){
		
		BigInteger x = BigInteger.valueOf(0);
		
		for(int i = 0; i < number; i++)
			x = x.nextProbablePrime();
		
		return x.intValue();
	}

}
