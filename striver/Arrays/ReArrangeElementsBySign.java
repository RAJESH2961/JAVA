import java.util.ArrayList;

public class ReArrangeElementsBySign {
    public static void reArrange(int arr[]){
        //finding positive values in loop
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        //replacing Array with positive and negative index
        for(int i=0; i<arr.length/2; i++){
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        

    }
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, -2, 4, 8, 2, -3, -9, -13};
        System.out.println("Printing Elements");
        reArrange(arr);
        //Printing Values
        System.out.println("Printing Values ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +"  |  ");
        }


    }
    
}


//optimal Approach 

// import java.util.*;
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int answer[] = new int[n];
//         int posIndex = 0;
//         int negIndex = 1;
//         for(int i=0; i<n; i++){
//             if(nums[i] < 0){
//                 answer[negIndex] = nums[i];
//                 negIndex+=2;
//             }
//             else{
//                 answer[posIndex] = nums[i];
//                 posIndex+=2;
//             }
//         }
//         return answer;
//     }
// }