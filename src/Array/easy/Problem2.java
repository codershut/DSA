package Array.easy;

public class Problem2 {
	
	public static void main(String ... args) {
		int a[]= {1,2,1,33,22,19};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			max=Math.max(max, a[i]);
		}
		System.err.println(max);
		
	}
}
