package VilasTalewale;

import java.util.Arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int [] arr = {300,200,100,200,500};
		
		Arrays.sort(arr);
		int j=0;
		int arrCopy [] = new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arrCopy[j++] = arr[i];
			}
		}
		
		arrCopy[j++] = arr[arr.length-1];
		for(int k=0;k<j;k++) {
			System.out.println(arrCopy[k]);
		}

	}

}
