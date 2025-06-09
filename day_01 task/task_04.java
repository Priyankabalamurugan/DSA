package day_01;

public class task_04 {
	    public static int fibonacci(int n) {
	        if (n == 0) return 0; 
	        if (n == 1) return 1; 
	        return fibonacci(n - 1) + fibonacci(n - 2); 
	    }

	    public static void main(String[] args) {
	        int num = 6;
	        System.out.println("Fibonacci number at position " + num + " is: " + fibonacci(num));
	    }
	}



