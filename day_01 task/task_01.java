package day_01;
import java.util.Arrays;

public class task_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        System.out.println("Original Array: " + Arrays.toString(arr));

        arr = insertElement(arr, 2, 10);
        System.out.println("After Insertion: " + Arrays.toString(arr));

        
        arr = deleteElement(arr, 3);
        System.out.println("After Deletion: " + Arrays.toString(arr));

        
        arr = updateElement(arr, 1, 20);
        System.out.println("After Update: " + Arrays.toString(arr));
    }

    public static int[] insertElement(int[] arr, int index, int value) {
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
        if (index < 0 || index >= arr.length) return arr;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static int[] updateElement(int[] arr, int index, int value) {
        if (index < 0 || index >= arr.length) return arr;
        arr[index] = value;
        return arr;
    }
}


