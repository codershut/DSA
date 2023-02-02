package Array.easy;

public class Problem {
	public static void main(String[] args) {	
		int a[] = {10,12,33,23,9};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.err.println(max);
	}
}
