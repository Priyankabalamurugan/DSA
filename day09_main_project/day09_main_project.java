package day09_main_project;
import java.util.*;

public class day09_main_project {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
System.out.print("Enter the element to find rank of: ");
	        int target = scanner.nextInt();
	        scanner.close();
int rank = findRank(arr, target);

	        if (rank == -1) {
	            System.out.println("Element not found in the array.");
	        } else {
	            System.out.println("Rank of element " + target + ": " + rank);
	        }
	    }

	    public static int findRank(int[] arr, int target) {
	    
	        int[] sorted = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(sorted);

	        int rank = 1;
	        for (int value : sorted) {
	            if (value == target) {
	                return rank;
	            }
	            if (value < target) {
	                rank++;
	            }
	        }
	        return -1;  
	    }
	}



