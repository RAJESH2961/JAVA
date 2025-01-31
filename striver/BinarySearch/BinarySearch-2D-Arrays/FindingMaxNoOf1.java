// You are given a binary matrix of size N x M, where each element is either 0 or 1. Your task is to find the row index that contains the maximum number of 1s.
public class FindingMaxNoOf1 {
    public static int brute(int arr[][]){
        int n = arr.length; // length of the array height
        int m = arr[0].length;//Length of the first array we perform bs on this array
        int max = -1;
        int rowIndex = -1;
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j = 0; j<m; j++){
                if(arr[i][j] == 1){
                    // max = arr[i][j-1];
                    cnt++;
                }
            }
            if(cnt > max){
                max = cnt;
                rowIndex = i;
            }
        }
        return rowIndex;
    }

    //Optimal binary Search
    public static int optimal(int arr[]){
        int n = arr.length; // length of the array height
        // int m = arr[0].length;//Length of the first array we perform bs on this array

        // for()

        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            // 1 1 1 1 1 1 0
            // if(arr[mid] == 0) return arr[mid]-1;
            if(arr[mid] == 1){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid] > 1) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 0, 0}, {1, 1, 1}, {1, 1, 1}};
        System.out.println("Brute Force Approach :"+brute(matrix));
        int arr[] = {1, 1, 1, 1, 0};
        System.out.println("Optimal Approach :"+optimal(arr));
    }
    
}
