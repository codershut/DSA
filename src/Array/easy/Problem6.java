package Array.easy;

public class Problem6 {
	
	public static void main(String ... args) {
		int a[]= {1,2,3,4,5};
		int k=a[0];	
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=k;
		for(int i=0;i<a.length;i++) {
			System.err.println(a[i]);
		}
	}
}
