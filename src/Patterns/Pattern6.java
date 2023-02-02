package Patterns;

import java.util.Scanner;

public class Pattern6 {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of row");
		int row=sc.nextInt();
		System.out.println("Enter no. of col");
		int col =sc.nextInt();
		
		for(int i=0;i<=row;i++) {
			for(int j=1;j<=col-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
