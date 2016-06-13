package com.davekerr.projecteular;

public class pythagoreanTriplet {

	public static void main(String[] args) {

		for(int i = 1; i < 500; i++)
			for(int j = 1; j < 500; j++)
				for(int k = 1; k < 500; k++)

					if((Math.pow(i, 2) + Math.pow(j, 2)) == Math.pow(k, 2) && (i + j + k) == 1000){

						System.out.println(i * j * k);
						return;
					}
	}

}
