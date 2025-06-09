package day_02;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class task_3 {
	
	
	    public static void main(String[] args) {
	        int[] arr = {2, 3, 4, 4, 5, 8, 2, 3};

	        int[] uniqueArr = removeDuplicates(arr);

	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
	    }

	    public static int[] removeDuplicates(int[] arr) {
	        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // Preserves order & removes duplicates
	        for (int num : arr) {
	            set.add(num);
	        }

	        // Convert HashSet back to array
	        return set.stream().mapToInt(Integer::intValue).toArray();
	    }
	}


