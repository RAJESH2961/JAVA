public class SearchElementIn2SortedArray{


    public static boolean brute(int mat[][], int target){
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == target) return true;
            }
        }
        return false;
    }
 
     static boolean binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }   


    //Better
    public static boolean better(int mat[][], int target){
        int n = mat.length;
        int m = mat[0].length;
        boolean ans = false;

        //checking at first row 1st ele and last ele wheather it exist or not if dodnt we skip the entire row 
        //It will help us to reduce T.C
        for(int i = 0; i<n; i++){
            if(mat[i][0] <= target || mat[i][m-1] >= target) 
            {
                ans = binarySearch(mat[i], target);
            }
        }
        return ans;
    }

    //Optimal Solution 
    // Converting the 2-D array into 1-D Array in Imagination not in real world
public static boolean optimal(int mat[][], int target){
    int n = mat.length;
    int m = mat[0].length;
    int low = 0; 
    int high = ((n*m)-1);
    while(low <= high){
        int mid = low + (high - low) / 2;
        //We have to find Coordinates to check in 2-D MAtrix to find we use below formula
        int row = mid/m;
        int col = mid%m;
        if(mat[row][col] == target) return true;
        else if(mat[row][col] < target) low = mid+1;
        else{
            high = mid-1;
        }
    }
    return false;
}
//Optimal incase of row is increasing and col is increasing
public static int[] optimal1(int arr[][], int target){
    int n = arr.length;
    int m = arr[0].length;

    int row = 0, col = m-1;
    while(row <n && col > 0){
        if(arr[row][col] == target) return new int[]{row, col};
        else if(arr[row][col] < target){
            row++;
        }
        else{
            col--;
        }
    }

    return new int[] {-1,-1};
}




    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3 ,4 ,5},
            {6, 7, 8, 9, 10},
            {11 ,12 ,13 ,14, 15}
        };

        int[][] mat1 = {
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9,  10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        

        System.out.println("Brute Force :"+brute(mat, 13));
        System.out.println("Better Approach :"+better(mat, 13));
        System.out.println("Optimal Approach :"+optimal(mat, 13));
        int optimal1[]  = optimal1(mat1, 13);
        System.out.println("Optimal1 Approach :" + optimal1[0] +" "+ optimal1[1]);
    }
}
