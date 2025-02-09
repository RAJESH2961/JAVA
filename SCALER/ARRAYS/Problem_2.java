/*
 * Given an N array Elements find No of elements having atleat 1 Element Greather than itself
 * 
 * Approach
 * step-1 find the Total Number of Elements
 * step-2 find Max int the Array
 * step-3 coutn how many max we have
 * step-4 return ans = n-count;
 */

public class Problem_2 {
    public static int greather(int arr[]){
        //Step-1
        int n = arr.length;
        //step-2
        int max = -1;
        for(int i = 0; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println("Max Element is "+max);
        //Step-3
        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == max){
                count++;
            }
        }
        System.out.println("Max Element count is "+count);

        return n-count;

    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 1 ,4, 8, 1, 3, 8};
        System.out.println("Max Elements are :"+greather(arr));
    }
    
}
