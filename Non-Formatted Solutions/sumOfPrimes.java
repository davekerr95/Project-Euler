package com.davekerr.projecteular;

import java.math.BigInteger;

public class sumOfPrimes {

	public static void main(String[] args) {
		
		System.out.println(findPrimes());
	}
	
	public static BigInteger findPrimes(){
		
		BigInteger result = BigInteger.ZERO;
		
		for(int i = 0; i <= 2000000; i++){
			
			if(BigInteger.valueOf(i).isProbablePrime(100)){
				result = result.add(BigInteger.valueOf(i));
			}
		}
		
		return result;
	}
}
