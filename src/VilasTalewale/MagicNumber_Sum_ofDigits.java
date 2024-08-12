package VilasTalewale;

public class MagicNumber_Sum_ofDigits {

	public static void main(String[] args) {
		int number = 1522;
	       int sum = 0;
	       
	       while(number>0 || sum > 9){
	           if(number == 0){
	               number = sum;
	               sum=0;
	           }
	           
	           sum = sum +number%10;
	           number= number/10;
	       }
	       
	       if(sum == 1){
	           System.out.println("Its a magics number");
	       }else{
	           System.out.println("Its not magic number");
	       }
	    }

}
