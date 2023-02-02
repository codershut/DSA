package Patterns;

public class factorial {
	
	 public static void main(String[] args) {
	       System.out.println(getFactorial(5));
	    }
	    
	    public static int getFactorial(int n){
	        if(n==1||n==0){
	            return n;
	    }
	    return getFactorial(n-1)*n;
	}
}
