package day_08_post_assignment;
public class day08_post_assignment{
	
	    static int findFirstOccurrence(int arr[], int target) {
	        int left = 0, right = arr.length - 1, result = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
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

	    static int findLastOccurrence(int arr[], int target) {
	        int left = 0, right = arr.length - 1, result = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
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

	    static int countFrequency(int arr[], int target) {
	        int first = findFirstOccurrence(arr, target);
	        if (first == -1) return 0; 
	        int last = findLastOccurrence(arr, target);
	        return last - first + 1;
	    }

	    public static void main(String args[]) {
	        int arr[] = {1, 1, 2, 2, 2, 2, 3, 4, 4, 5};
	        int target = 2;
	        System.out.println("Frequency of " + target + ": " + countFrequency(arr, target));
	    }
	}


