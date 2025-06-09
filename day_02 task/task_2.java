package day_02;
import java.util.Arrays;
import java.util.Scanner;
public class task_2 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	       
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int[] sortedArr = sortDescending(arr);

	        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(sortedArr));

	        scanner.close();
	    }

	    public static int[] sortDescending(int[] arr) {
	        int[] newArr = Arrays.copyOf(arr, arr.length); 
	        Arrays.sort(newArr);
	        reverseArray(newArr); 
	        return newArr;
	    }

	    public static void reverseArray(int[] arr) {
	        int left = 0, right = arr.length - 1;
	        while (left < right) {
	          
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;

	            left++;
	            right--;
	        }
	    }
	}


