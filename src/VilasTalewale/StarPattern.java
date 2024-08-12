package VilasTalewale;

public class StarPattern {

	public static void main(String[] args) {
		
		// Print star pattern triangle
		System.out.println("******Print star pattern triangle*****");
		
		for(int i=0 ; i<=4 ;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();	
		
		}
		
		System.out.println("-------------opposite triangl----------------");
		
		//print star pattern opposite traingle
		for(int i=0;i<=4;i++) {
			for(int j=4 ;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		System.out.println("-------------combine triangl----------------");
		
		for(int i=0 ; i<=4 ;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();	
		
		}
		
		for(int i=0;i<=4;i++) {
			for(int j=4 ;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
