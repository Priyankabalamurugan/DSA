package day_01;

public class task_02 {

	
	    public static void main(String[] args) {
	        int[] arr = {12, 45, 2, 67, 34, 89, 5};

	        int max = findMax(arr);
	        int min = findMin(arr);

	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	    }

	    public static int findMax(int[] arr) {
	        int max = arr[0];
	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }

	    public static int findMin(int[] arr) {
	        int min = arr[0];
	        for (int num : arr) {
	            if (num < min) {
	                min = num;
	            }
	        }
	        return min;
	    }
	}

