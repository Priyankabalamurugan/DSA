package day01_post_assignment;

public class post_assignment {
	    public static int sumDigits(int num) {
	        if (num == 0) {
	            return 0; // Base case: when num is 0, return 0
	        }
	        return (num % 10) + sumDigits(num / 10); // Recursive case
	    }

	    public static void main(String[] args) {
	        int num = 12345;
	        System.out.println("Sum of digits of " + num + " is: " + sumDigits(num));
	    }
	}



