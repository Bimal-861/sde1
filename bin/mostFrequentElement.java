import java.util.*;

public class mostFrequentElement {

 public static int mostFrequentElement(int[] arr) {

   // Write code here
     if (arr.length == 0)
            return -1;

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequentElement = -1;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = num;
            }
        }

        return mostFrequentElement;
 }


 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(mostFrequentElement(arr));
 }
}