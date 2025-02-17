
import java.util.ArrayList;



public class RowSum {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2 ,3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList <Integer>rowSum = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int row = 0; row < m; row++){
            int sum = 0;
            for(int col = 0; col < n; col++){
                sum += matrix[row][col];
            }
            rowSum.add(sum);
        }
        System.out.println(rowSum);
    }
}
