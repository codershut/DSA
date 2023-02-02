package Array.easy;

import java.util.Scanner;

public class Problem7 {
	
	public static void main(String ...strings) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array:");
		int n =sc.nextInt();
		System.out.print("Enter the elements:");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the places you wish to shift:");
		int place = sc.nextInt();
		
		finalArray(a,place);
		
	}
	// 1 2 3 4 5 6 7
	// 4 3 2 1 7 6 5
	// 5 6 7 1 2 3 4

	private static void finalArray(int a[], int place) {

		int b[]= new int[place];
		int j=0;
		for(int i=a.length-place;i<a.length;i++) {
			b[j]=a[i];
			j++;
		}
		int k=a.length-place-1;
		int m=0;
		while(m<a.length-place){
			a[k+place]=a[k];
			k--;
			m++;
		}
		for(int i=0;i<place;i++) {
			a[i]=b[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
