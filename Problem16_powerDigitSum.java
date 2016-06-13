package com.davekerr.projecteular.solved;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem16_powerDigitSum {

	public static void main(String[] args) {
		
		BigInteger x = BigInteger.valueOf(2).pow(1000);
		long y = 0;
		
		char [] array = x.toString().toCharArray();
		
		System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < array.length; i++)
			y += Character.getNumericValue(array[i]);
		
		System.out.println(y);
	}

}
