package day2_post_assignment;
import java.util.Arrays;

public class day2_post_assignment {
	

	
	    public static int[] findPair(int[] arr, int target) {
	        Arrays.sort(arr); 
	        int left = 0, right = arr.length - 1;

	        while (left < right) {
	            int sum = arr[left] + arr[right];

	            if (sum == target) {
	                return new int[]{arr[left], arr[right]};
	            } else if (sum < target) {
	                left++; 
	            } else {
	                right--; 
	            }
	        }
	        return new int[]{}; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 7, 4, 1, 9, 5};
	        int target = 10;

	        int[] result = findPair(arr, target);

	        if (result.length > 0) {
	            System.out.println("Pair found: " + Arrays.toString(result));
	        } else {
	            System.out.println("No pair found.");
	        }
	    }
	}


