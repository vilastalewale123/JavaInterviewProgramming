package VilasTalewale;

public class OccurencesOfCharacter {

	public static void main(String[] args) {

		String str = "Java is programming langugae";
		checkOccurencesOfCharacter(str,'a');

	}
	private static void checkOccurencesOfCharacter(String str,char val) {
		int count = 0;
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			if(ch == val) {
				count++;
			}
		}
		System.out.println(val+":"+count);
		
		//2nd way
		int cnt = str.length()-str.replaceAll("a", "").length();
		System.out.println("a"+":"+cnt);
	}
}
