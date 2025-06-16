package day_08;

public class task_03 {
	    static int search(int arr[], int left, int right, int key) {
	        if (left > right) return -1;

	        int mid = (left + right) / 2;

	        if (arr[mid] == key) return mid;

	        if (arr[left] <= arr[mid]) {
	            if (key >= arr[left] && key < arr[mid])
	                return search(arr, left, mid - 1, key);
	            return search(arr, mid + 1, right, key);
	        }

	     
	        if (key > arr[mid] && key <= arr[right])
	            return search(arr, mid + 1, right, key);
	        return search(arr, left, mid - 1, key);
	    }

	    public static void main(String args[]) {
	        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
	        int key = 6;
	        int index = search(arr, 0, arr.length - 1, key);
	        System.out.println("Index of " + key + ": " + index);
	    }
	}


