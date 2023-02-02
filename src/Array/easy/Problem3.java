package Array.easy;

import java.util.Arrays;

public class Problem3 {
	
//	public static void main(String ... args) {
//		int arr[]= {3,4,55,66,23};
//		Arrays.sort(arr);
//		System.out.print("Second largest element is :"+arr[arr.length-2]);
//	}
	public static void main(String[] args) {
		
		int arr[]= {12,3,22,44,5};

		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			small=Math.min(small, arr[i]);
			large=Math.max(large,arr[i]);
		}
		int secondSmall=Integer.MAX_VALUE;
		int secondLarge=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<secondSmall && arr[i]!=small) {
				secondSmall=arr[i];
			}
			if(arr[i]>secondLarge && arr[i]!=large) {
				secondLarge=arr[i];
			}
		}
		System.err.println(secondLarge);
		System.err.println(secondSmall);
	}
}
