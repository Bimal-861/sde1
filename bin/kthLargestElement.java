import java.util.*;

public class kthLargestElement{


     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt(); // Size of the stream
        int K = scanner.nextInt(); // Position of the largest number

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(K);

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            if (minHeap.size() < K) {
                minHeap.offer(num);
                if (minHeap.size() < K) {
                    System.out.println("None");
                } else {
                    System.out.println(K + " largest number is " + minHeap.peek());
                }
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
                System.out.println(K + " largest number is " + minHeap.peek());
            } else {
                System.out.println(K + " largest number is " + minHeap.peek());
            }
        }
    }
    
}