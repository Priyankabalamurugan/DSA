package day07_post_assignment;
import java.util.Scanner;
public class day07_post_assignment
{
	public static void selectionSort(int[] arr, int n) {
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
 for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        selectionSort(arr, n);

	        System.out.println("Sorted array using Selection Sort:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	    
	}

}
