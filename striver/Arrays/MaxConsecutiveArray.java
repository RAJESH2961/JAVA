public class MaxConsecutiveArray {
    public static void main(String[] args) {
        int count =0;
        int maxi = 0;
        int arr[] = {1, 1, 1,  1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1};
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count=0;
            }
            //for each time maxi variable will be updated. to keep track of maximum sequence if else block is executed then count will be 0
            maxi = Math.max(maxi, count);
        }
        System.out.println("Maximum Consecutive is :"+maxi);
    }
    
}
