
class PeakElementII {
    public static int maxElement(int [][] mat, int n, int m, int mid){
        int max = -1;
        int index = -1;
        for(int i = 0; i < n; i++){
            if(mat[i][mid] > max){
                max = mat[i][mid];
                index = i;
            }
        }
        return index;
    }

    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            int row = maxElement(mat, n, m, mid);
            int left = (mid - 1 >= 0) ? mat[row][mid - 1] : -1;
            int right = (mid + 1 < m) ? mat[row][mid + 1] : -1;
            
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row, mid};
            } else if(mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return new int[]{-1, -1}; // Return if no peak is found
    }

    public static void main(String[] args) {
        int[][] mat = {
            {10, 20, 15, 14, 13},
            {21, 30, 29, 28, 25},
            {17, 35, 40, 39, 22},
            {16, 37, 38, 42, 19},
            {12, 14, 11, 10, 9}
        };
        int ans[] = findPeakGrid(mat);
        System.out.println("MOST OPTIMAL : (" + ans[0] + ", " + ans[1] + ")");
    }
}
