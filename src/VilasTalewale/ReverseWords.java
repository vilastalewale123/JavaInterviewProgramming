package VilasTalewale;

public class ReverseWords {

    public static void main(String args[]) {

        String str = "Welcome to Java";

        String[] splitWords = str.split(" ");
        String reverseString = "";

        for (String word : splitWords) {
            String reverseWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i);
            }

            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println("ReverseWords  Keeping order same : "+reverseString);
    }
}
