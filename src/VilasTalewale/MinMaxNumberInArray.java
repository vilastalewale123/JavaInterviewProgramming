package VilasTalewale;

public class MinMaxNumberInArray {

	public static void main(String[] args) {
		int arr[] = {2,5,1,6,8};
		
		int largest = arr[0],minimum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}else if(arr[i]<minimum) {
				minimum = arr[i];
			}
		}
		
		System.out.println("Largest:"+largest);
		System.out.println("Minimum:"+minimum);

	}

}
