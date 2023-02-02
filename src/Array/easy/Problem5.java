package Array.easy;

public class Problem5 {
	public static void main(String[] args) {
		int a[]= {1,2,2,2,2,2,3,3,3,5,5,6};	
		int j=0;
		for(int i=1;i<a.length;i++) {
			if(a[j]!=a[i]) {
				j++;
				a[j]=a[i];
			}
		}
		System.err.println(j+1);
		for(int i=0;i<j+1;i++) {
			System.err.println(a[i]);
		}
	}
}
