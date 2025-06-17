package day_09;

public class task_02 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 12, 24, 35,66,88};
        int target = 55;
        int left = 0;
        int right = arr.length;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] <= target) { 
                left = mid + 1;
            } else {
                right = mid;
            }
        }
if (left < arr.length){
            System.out.println("Upper bound found at index " + left + " and value " + arr[left]);
        } else 
        {
            System.out.println("No upper bound found for target " + target);
        }
    }
}

