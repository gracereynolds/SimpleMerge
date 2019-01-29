/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length + arr2.length; i++) {
            if(i < arr1.length) {
                arr3[i] = arr1[i];
            }
            else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        sort(arr3);
        return arr3;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int[] arr) {
        int temp;
        for(int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for(int j = i-1; j >= 0; j--) {
                if(temp < arr[j]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

}
