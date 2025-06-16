package day_07;
import java.util.Scanner;
public class task_03 {
	public static void insertionSort(int[] arr, int n) {
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;
 while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
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
insertionSort(arr, n);
System.out.println("Sorted array using Insertion Sort:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }

	        sc.close();
	    }
	}


