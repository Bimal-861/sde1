import java.util.*;

public class mergingTwoArray {

    public static int median(int[] arr1, int[] arr2 , int n){

        // Write code here
              int[] merged = mergeArrays(arr1, arr2, n);
        int length = merged.length;

        if (length % 2 == 0) {
            int midIndex1 = length / 2 - 1;
            int midIndex2 = length / 2;
            int median = (merged[midIndex1] + merged[midIndex2]) / 2;
            return median;
        } else {
            int midIndex = length / 2;
            return merged[midIndex];
        }
    }
     public static int[] mergeArrays(int[] arr1, int[] arr2, int n) {
        int[] merged = new int[n * 2];

        int i = 0, j = 0, k = 0;
        while (i < n && j < n) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n) {
            merged[k++] = arr1[i++];
        }

        while (j < n) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(median(arr1, arr2, n));
    }
}
