package com.davekerr.projecteular.solved;

public class Problem14_longestCollatzSequence {

	public static void main(String[] args) {

		long start = System.nanoTime();
		
		int longest = 0;
		int longestDigit = 0;
		
		for(int i = 1; i < 1000000; i++){
			
			if(CollatzSequence(i, 1) > longest){
				longest = CollatzSequence(i, 1);
				longestDigit = i;
			}
		}
		
		System.out.println(longestDigit);
		System.out.println((System.nanoTime() - start) / 1000000 + " ms");
		return;
	}

	public static int CollatzSequence(long num, int length){

		if(num == 1){
			return length;
		}

		else {	
			length++;
			return (num % 2 == 0) ? CollatzSequence(num >> 1, length) : CollatzSequence((3* num) + 1, length);
		}

	}


}
