
import java.util.ArrayList;



public class ColSum {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2 ,3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList <Integer>colSum = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int col = 0; col < m; col++){
            int sum = 0;
            for(int row = 0; row < n; row++){
                sum += matrix[row][col];
            }
            colSum.add(sum);
        }
        System.out.println(colSum);


        //Challenge DO the same operation as above but first iterate over rows and then iterate over columns
        int [] col_sum = new int[n];
        for(int row = 0; row  < m; row++){
            for(int col = 0; col < m; col++){
                col_sum[col] += matrix[row][col];
            }
            System.out.println();
        }
        System.out.println("With out using Sum varaiable ");
        for(int data : col_sum){
            System.out.println(data);
        }
    }
}
