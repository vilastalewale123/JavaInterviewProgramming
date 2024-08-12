package VilasTalewale;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "nitin";
		String rev = "";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			rev = ch + rev; 
		}
		
		if(str.equals(rev)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}

	}

}
