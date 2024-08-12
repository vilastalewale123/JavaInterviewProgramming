package VilasTalewale;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String str[] = {"flower","float","flight"};
		
		String subOfString = "";
		boolean bool = true;
		String largestCommonPrefix = "";
		for(int i=0;i<str[0].length();i++) {
			
			subOfString = str[0].substring(0,i+1);
			//System.out.println("subOfString"+subOfString);
			
			for(int j=0;j<str.length;j++) {
				if(!str[j].startsWith(subOfString)) {
					bool = false;
				}
			}
			if(bool) {
				largestCommonPrefix = subOfString;
				continue;
			}break;
		}
		
		System.out.println("Largest Common Prefix:"+largestCommonPrefix);

	}

}
