package VilasTalewale;

public class FindLengthOfLastWord {

	public static void main(String[] args) {
		
		String str = "Vilas loves Java Language";
		
		String trimmedString = str.trim();
		

		int len = 0;
		for(int i=0;i<trimmedString.length();i++) {
			if(trimmedString.charAt(i) ==' ') {
				len =0;
			}else {
				len++;
			}
		}
		
		System.out.println("Length of Word:"+len);

	}

}
