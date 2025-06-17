package day_09;
import java.util.Scanner;
public class task_03 {
	
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
System.out.println("Enter " + n + " sorted elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the target value: ");
	        int target = scanner.nextInt();
	        scanner.close();
	        int count = countOccurrences(arr, target);
	        System.out.println("Occurrences of target " + target + ": " + count);
	    }

	   
	    public static int findFirst(int[] arr, int target) {
	        int left = 0, right = arr.length - 1, result = -1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                right = mid - 1;
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    public static int findLast(int[] arr, int target) {
	        int left = 0, right = arr.length - 1, result = -1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                left = mid + 1;
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    public static int countOccurrences(int[] arr, int target) {
	        int first = findFirst(arr, target);
	        int last = findLast(arr, target);

	        if (first == -1 || last == -1) return 0;
	        return last - first + 1;
	    }
	}


