import java.util.*;

public class nearlySortedArray {

    private static void sortArray(int[] arr, int k) {

        // Write code here
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            minHeap.offer(arr[i]);
            
            if (minHeap.size() > k) {
                arr[i - k] = minHeap.poll();
            }
        }
        
        int index = arr.length - k;
        while (!minHeap.isEmpty()) {
            arr[index] = minHeap.poll();
            index++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr, k);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
