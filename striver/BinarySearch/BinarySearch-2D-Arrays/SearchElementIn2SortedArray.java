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
    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3 ,4 ,5},
            {6, 7, 8, 9, 10},
            {11 ,12 ,13 ,14, 15}
        };

        System.out.println("Brute Force :"+brute(mat, 13));
        System.out.println("Better Approach :"+better(mat, 13));
    }
}
