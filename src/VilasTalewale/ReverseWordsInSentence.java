package VilasTalewale;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String str = "We are learning java";
		
		String result = "";
		String [] strArray = str.split("");
		for(int i=strArray.length-1;i>=0;i--) {
			result = result + strArray[i];
		}
		System.out.println("Reverse Words:"+result);
		

	}

}
