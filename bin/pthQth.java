import java.util.*;

public class pthQth{

    public static int sumBetweenPthToQthSmallestElement(int[] arr, int p, int q) {

       // Write code here
       Arrays.sort(arr);
    int sum = 0;
    
    for (int i = p - 1; i < q - 1; i++) {
        sum += arr[i];
    }
    
    return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(sumBetweenPthToQthSmallestElement(arr, p, q));
    }
}
