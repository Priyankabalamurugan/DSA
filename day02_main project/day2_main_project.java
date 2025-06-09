package day2_main_project;
import java.util.Scanner;
public class day2_main_project {



	 public static boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; 
	            }
	            left++;  
	            right--; 
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

	        if (isPalindrome(input)) {
	            System.out.println("Palindrome ✅");
	        } else {
	            System.out.println("Not a Palindrome ❌");
	        }

	        scanner.close();
	    }
	}


