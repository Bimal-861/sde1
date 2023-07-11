import java.util.*;

public class commonElement {

    public static void printElementInAllRows(int mat[][]) {

        // Write code here
        
    int rows = mat.length;
    int cols = mat[0].length;

    Map<Integer, Integer> countMap = new HashMap<>();

    // Count the occurrence of each element in the first row
    for (int j = 0; j < cols; j++) {
        int element = mat[0][j];
        countMap.put(element, countMap.getOrDefault(element, 0) + 1);
    }

    // Check if each element occurs in all rows
    for (int i = 1; i < rows; i++) {
        Map<Integer, Integer> rowMap = new HashMap<>();
        for (int j = 0; j < cols; j++) {
            int element = mat[i][j];
            rowMap.put(element, rowMap.getOrDefault(element, 0) + 1);
        }

        // Update the count map by intersecting with the current row map
        Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int element = entry.getKey();
            if (rowMap.containsKey(element)) {
                countMap.put(element, Math.min(entry.getValue(), rowMap.get(element)));
            } else {
                iterator.remove();
            }
        }
    }

    // Print the common elements
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        int element = entry.getKey();
        int count = entry.getValue();
        for (int i = 0; i < count; i++) {
            System.out.print(element + " ");
        }
    }
        
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}
