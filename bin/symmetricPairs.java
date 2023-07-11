import java.util.*;

public class symmetricPairs {

    public static void symmetricPair(int[][] arr) {
        // Write code here
          Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i += 2) {
            int a = arr[i][0];
            int b = arr[i][1];

            if (map.containsKey(b) && map.get(b) == a) {
                System.out.println(a + " " + b);
            } else {
                map.put(a, b);
            }
        }
       
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }
}