
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int n = matrix1.length;
        int m = matrix1[0].length;
        int [][] ans = new int[m][n];
        System.out.println("Before addition the sum matrix is :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }       


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] += matrix1[i][j]+matrix2[i][j];
            }
        }   
        
        System.out.println("After addition the sum matrix is :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }   
    }
}
