/*Rotate the Array By K Times
 * Input = 1 2 3 4 5 6 7
 * k = 2
 * Output = 6 7 1 2 3 4 5
 * this below part is only for last half
 * out[0] = input[5] 7 - k +i
 * out[1] = input[6] 7- k +i = 7 - 2 + 1
 * For Right Half
 * out[k+i] = input[i];
 * 
 * finally 2 steps one for rotated half and one for Normal half
 * 
 */

 //The Brute Approach Takes an Extra Space array
public class RotateArrayByKTimes {
    public static int[] brute(int arr[], int k){
        int n = arr.length;
        int ans []= new int[n];
        // Input = 1 2 3 4 5 6 7
        //  * k = 2
        //  * Output = 6 7 1 2 3 4 5
        //First half this loop will run K times
        for(int i = 0; i<k; i++){
            ans[i] = arr[n-k+i];
        }
        //Second half This loop will run N-k times
        for(int i = 0; i<n-k; i++){
            ans[k+i] = arr[i]; 
        }
        return ans;
    }
//Optimal Approach
/*
 * step-1 Reverse an Entire array
 * step-2 Reverse 0 to n-k-1
 * Step-3 Reverse k to n-1
 */
public static void swap(int arr[], int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
public static void optimal(int arr[], int k){
    int n = arr.length;
    k = k % 10; //in case k is greather than N
    //step-1 Swap the Entire array
    swap(arr, 0, n-1);
    // System.out.println("After Swapped ");
    //Step-2
    swap(arr, 0,  k-1);
    //Step -3
    swap(arr, k, n-1);
}
    public static void main(String[] args) {
        int arr[] = {1, 2, 3 ,4 ,5 ,6 ,7};
        int ans[] = brute(arr, 2);
        optimal(arr, 2);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
