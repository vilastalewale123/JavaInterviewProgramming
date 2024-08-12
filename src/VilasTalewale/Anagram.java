package VilasTalewale;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "LISTEN";
		String s2 = "SILENT";
		
		boolean val = isAnagram(s1,s2);
		if(val) {
			System.out.println("String IsAnagaram");
		}else {
			System.out.println("Not Anagram");
		}
	}
	
	private static boolean isAnagram(String s1,String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}else {
			char ch1[] = s1.toLowerCase().toCharArray();
			char ch2[] = s2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			return Arrays.equals(ch1, ch2);
		}
	}

}
