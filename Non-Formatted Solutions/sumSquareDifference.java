package com.davekerr.projecteular;

public class sumSquareDifference {

	public static void main(String[] args) {
		
		int sumSquares = 0;
		int squareSums = 0;
		
		for(int i = 0; i <= 100; i++){
			
			sumSquares += Math.pow(i, 2);
			squareSums += i;
		}
		
		squareSums = (int) Math.pow(squareSums, 2);
		
		System.out.println(squareSums - sumSquares);
		
	}

}
