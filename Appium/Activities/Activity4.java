package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int[] arr = {11,7,5,12};
        System.out.println("Given Array is"+Arrays.toString(arr));
        InsertionSort(arr);
    }
    public static void InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("After insertion sort the Array is"+ Arrays.toString(arr));
    }
}
