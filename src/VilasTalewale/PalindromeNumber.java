package VilasTalewale;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 545;
	    int numValue = number;
		int rev = 0;
		while(number>0) {
			rev = rev * 10 + number % 10;
			number = number/10;
		}
	   
		if(rev == numValue) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Is not Palindrome Number");
		}
    
	}

}
