package VilasTalewale;

public class LargestSecondLargestNumberInArray {

	public static void main(String[] args) {
		int [] arr = {2,1,6,2,9,8};
		
		int firstLargest = arr[0],secondLargest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("SecondLargest:"+secondLargest);
		System.out.println("FirstLargest:"+firstLargest);
	}

}
