public class TwoSum {
    public static int[] twosum(int arr[], int target){
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target)
                {
                ans[0] = i;
                ans[1] = j;
                return ans;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int ans[] = twosum(arr, 9);
        System.out.println("Index of two Sum is : " + ans[0] + " : " + ans[1]);
        
    }
    
}
