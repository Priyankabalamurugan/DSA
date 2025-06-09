package day1_main_project;
import java.util.Arrays;
import java.util.Scanner;
public class day1_main_project {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        while (true) {
	            System.out.println("\nMENU:");
	            System.out.println("1. Insert Element");
	            System.out.println("2. Delete Element");
	            System.out.println("3. Update Element");
	            System.out.println("4. Sort Array (Descending)");
	            System.out.println("5. Display Array");
	            System.out.println("6. Exit");

	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter index to insert: ");
	                    int insertIndex = scanner.nextInt();
	                    System.out.print("Enter value to insert: ");
	                    int insertValue = scanner.nextInt();
	                    arr = insertElement(arr, insertIndex, insertValue);
	                    System.out.println("Updated Array: " + Arrays.toString(arr));
	                    break;
	                case 2:
	                    System.out.print("Enter index to delete: ");
	                    int deleteIndex = scanner.nextInt();
	                    arr = deleteElement(arr, deleteIndex);
	                    System.out.println("Updated Array: " + Arrays.toString(arr));
	                    break;
	                case 3:
	                    System.out.print("Enter index to update: ");
	                    int updateIndex = scanner.nextInt();
	                    System.out.print("Enter new value: ");
	                    int updateValue = scanner.nextInt();
	                    arr = updateElement(arr, updateIndex, updateValue);
	                    System.out.println("Updated Array: " + Arrays.toString(arr));
	                    break;
	                case 4:
	                    arr = sortDescending(arr);
	                    System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
	                    break;
	                case 5:
	                    System.out.println("Array: " + Arrays.toString(arr));
	                    break;
	                case 6:
	                    System.out.println("Exiting... Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please select a valid option.");
	            }
	        }
	    }

	    
	    public static int[] insertElement(int[] arr, int index, int value) {
	        if (index < 0 || index > arr.length) {
	            System.out.println("Invalid index!");
	            return arr;
	        }
	        int[] newArr = new int[arr.length + 1];
	        for (int i = 0, j = 0; i < newArr.length; i++) {
	            if (i == index) {
	                newArr[i] = value;
	            } else {
	                newArr[i] = arr[j++];
	            }
	        }
	        return newArr;
	    }

	
	    public static int[] deleteElement(int[] arr, int index) {
	        if (index < 0 || index >= arr.length) {
	            System.out.println("Invalid index!");
	            return arr;
	        }
	        int[] newArr = new int[arr.length - 1];
	        for (int i = 0, j = 0; i < arr.length; i++) {
	            if (i != index) {
	                newArr[j++] = arr[i];
	            }
	        }
	        return newArr;
	    }


	    public static int[] updateElement(int[] arr, int index, int value) {
	        if (index < 0 || index >= arr.length) {
	            System.out.println("Invalid index!");
	            return arr;
	        }
	        arr[index] = value;
	        return arr;
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


