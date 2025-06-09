package day_02;
import java.util.Arrays;
public class task_1 {



	    public static void main(String[] args) {
	        int[] arr = {4, 2, 10, 7, 5, 3, 8};

	        reverseArray(arr);

	        System.out.println("Reversed Array: " + Arrays.toString(arr));
	    }

	    public static void reverseArray(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            // Swap elements using a temporary variable
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;

	            left++;  // Move left pointer forward
	            right--; // Move right pointer backward
	        }
	    }
	}


