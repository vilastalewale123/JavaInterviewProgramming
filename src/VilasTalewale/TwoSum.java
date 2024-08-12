package VilasTalewale;

public class TwoSum {

	public static void main(String[] args) {
		int [] arr = {1,2,3};
		int key = 3;
		int sum = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			
			if(sum == key) {
				count++;
			}
		}
		
		System.out.println("Count"+count);

	}

}
