package com.davekerr.projecteular.solved;

public class Problem05_smallestMultiple {

	public static void main(String[] args) {

		for(int i = 20;; i++){
			if(checkMultiple(i)){
				System.out.println(i);
				return;
			}	
		}
	}

	public static boolean checkMultiple(int number){

		boolean euler = false;

		for(int i = 1; i < 20; i++){
			if(number % i == 0)
				euler = true;

			else 
				return false;
		}

		return euler;
	}
}