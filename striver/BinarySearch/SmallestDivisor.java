public class SmallestDivisor {
    // public static int smallestDivisor(int arr[], int threshold){
    //     //Finding Max Element hence it can give threshold only on max Element
    //     int maxElement = Integer.MIN_VALUE;
    //     for(int i = 0; i<arr.length; i++){
    //         maxElement = Math.max(maxElement, arr[i]);
    //     }
    //     int size = arr.length;
    //     for(int i = 1; i<=maxElement; i++){
    //         int ans = 0;
    //         for(int j = 0; j<size; j++){
    //             // ans += (Math.ceil(arr[j]/i)); it will not work ceil always expect Double value if we pass int then it will result unintended behaviour
    //             ans += Math.ceil((double)(arr[j]) / (double)(i));

    //         }
    //         if(ans <= threshold){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int threshold(int arr[], int value){
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            ans += (int) Math.ceil((double) arr[i] / (double) value);
        }
        return ans;
    }

    public static int optimal(int arr[], int threshold){
        int size = arr.length;
        //Finding MAx Element
        int maxElement = Integer.MIN_VALUE;
        for(int value : arr){
            maxElement = Math.max(maxElement, value);
        }
        System.out.println(maxElement);
        

        //Binary Search
        int low = 1; 
        int high = size;
        int value = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if((threshold(arr, mid)) <= threshold){
                value = mid; //or we can direclt return low not here (Instead of declaring and initilalizing low variable)
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return value; //or low
    }
    public static void main(String[] args) {
        int threshold = 8; 
        int arr[] = {1, 2, 3, 4 ,5};
        // System.out.println(smallestDivisor(arr, threshold));
        System.out.println(optimal(arr, threshold));
    }
    
}
