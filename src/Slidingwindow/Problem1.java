package Slidingwindow;

public class Problem1 {
//	public static void main(String[] args) {
//		int b[]= {1, 4, 2, 10, 23, 3, 1, 0, 20};	
//		int k=4;
//		int max=Integer.MIN_VALUE;
//		int sum=0;
//		for(int i=0;i<b.length-k+1;i++) {
//			sum=0;
//			for(int j=i;j<i+k;j++) {
//				sum=sum+b[j];
//			}
//			max=Math.max(max, sum);
//		}
//		System.out.print(max);
//	} 
// o(n*k)

	public static void main(String[] args) {
		
		int b[]= {1,4,2,10,23,3,1,0,20};	
		int k=4;	
		int firstSum=0;
		for(int i=0;i<k;i++) {
			firstSum=firstSum+b[i];
		}
		int max=0;
		for(int i=k;i<b.length;i++) {
			firstSum=firstSum+b[i]-b[i-k];
			max=Math.max(max, firstSum);
		}
		System.err.println(max);
	}
}
//o(n)
