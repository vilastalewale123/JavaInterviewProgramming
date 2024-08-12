package VilasTalewale;

public class InfiniteLoopShiftCharacter {

	public static void main(String[] args) {
		
		String str = "Persistent";
		
		for(int i=0;i<str.length();i++) {
			
			str = str.charAt(str.length()-1)+str.substring(0,str.length()-1);
			System.out.println("Shifting Character:"+str);
		}

	}

}
