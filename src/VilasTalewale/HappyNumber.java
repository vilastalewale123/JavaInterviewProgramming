package VilasTalewale;

import java.util.*;
public class HappyNumber {

	public static void main(String[] args) {
		int number = 19;//19 happy,1081 -Not Happy
		
		boolean bool = isHappyNumber(number);
		if(bool) {
			System.out.println("Number is Happy");
		}else {
			System.out.println("Number is not Happy");
		}

	}
	
	private static boolean isHappyNumber(int number) {
		Set<Integer> set = new HashSet<Integer>();
 		while(true) {
		if(number == 1)
			return true;
		
		number = sumOfDigits(number);
		
		if(set.contains(number)) {
			return false;
		}
		set.add(number);
 		}
 		
	}
	
	private static int sumOfDigits(int number) {
		int sum = 0;
		while(number>0) {
			int digit = number%10;
			sum = sum+digit*digit;
			number = number/10;
		}
		
		return sum;
	}

}
