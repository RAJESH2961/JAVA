public class KthPositiveMissingNumber {
    public static int optimal(int arr[] ,int n, int k){
        //Approach when the arr[i] < k definetly it is going to occupt the space in the array;
        for(int i = 0; i<n; i++){
            if(arr[i] <k )k++;
            else break;
        }
        return k;
    }
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10 11
        
        int arr[] = {2 ,3 ,4 ,7 ,11};
        int k = 5; //ans =11
        System.out.println("Optimal Solution :"+optimal(arr, arr.length, k));
    }
    
}
