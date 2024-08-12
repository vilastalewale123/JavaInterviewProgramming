package VilasTalewale;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 5;
		int num1=1,num2=2;
        int num3=0;
		for(int i=0;i<number;i++) {
			System.out.println("num3:"+num1);
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
	}

}
