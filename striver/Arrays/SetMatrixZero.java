//It also works for normal matrix value like int[][] arr = {
//     {1, 2, 3, 4, 5},
//     {6, 0, 8, 9, 10},
//     {11, 12, 0, 14, 15},
//     {16, 17, 18, 19, 20},
//     {21, 22, 23, 24, 0}
// };

public class SetMatrixZero {
    public static int[][] bruteForce(int arr[][], int n, int  m){
        for(int i = 0; i<n ;i++){
            for(int j = 0; j<m; j++){
                if(arr[i][j] == 0){
                    markRow(arr, n, m, i);
                    markCol(arr, n, m, j);
                }
            }
        }
        // Convert all -1s to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

     static void markRow(int arr[][], int n, int m, int i){
        for(int j=0; j<m; j++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
     }
     static void markCol(int arr[][], int n, int m, int j){
        for(int i=0; i<n; i++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
     }

     public static int[][] better(int arr[][], int n, int m){
        int row[] = new int[n];
        int col[]= new int[m];
        //marking rows and columns as 1 if any one element in the row/col is 0;
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if (row[i]==1 || col[j]==1) { 
                    arr[i][j] = 0;
                }
                
            }
        }

        return arr;

     }
    public static void main(String[] args) {
        int [][] arr = {{1, 1, 1}, 
                        {1, 0, 1}, 
                        {1, 1 ,1}};
                    //  {0, 0, 0}, 
                    //  {1, 0 ,1}};
                    // {{1, 0, 1}, 
        // int [][] finalarr = bruteForce(arr, arr.length, arr[0].length);
        int [][] finalarr = better(arr, arr.length, arr[0].length);


        System.out.println("Printing array Elements : ");
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<finalarr[0].length; j++){
                System.out.print(finalarr[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    
}
