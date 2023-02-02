package Array.easy;

public class Problem4 {

	public static void main(String ... args) {
//		int a[]= {1,33,21,2,54};
		int a[]= {1,2,3,4,5,5};

		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				System.err.println("False");
				return;
			}
		}
		System.err.println("True");
		return;
	}
	
}
