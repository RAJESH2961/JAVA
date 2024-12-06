public class FindNumberAppearOnce {
    static int findingNumber(int arr[], int n){
        // //Brute force approach
        // for(int i = 0; i<n ;i++){
        //     int count =0;
        //     for(int j=0; j<n; j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         return arr[i];
        //     }
        // }
        // return -1;
// ------------------------------
    
        // //Better using Hashing Technique

        // here we are finding max to create an hasing array;
        // maxi+1 such that we can store only unique elements to avoid extra space

        // int maxi = 0;
        // for(int i = 0 ;i<n; i++){
        //     maxi = Math.max(maxi, arr[i]);//It returns max element based on two given values.
        // }

        // //creating an Hashing array
        // int hash[] = new int [maxi+1];
        // //storing elements
        // for(int i=0; i<n; i++){
        //     hash[arr[i]]++;
        // }

        // for(int i=0; i<n; i++){
        //     if(hash[arr[i]] == 1){
        //         return arr[i];
        //     }
        // }
        // return -1;

        int xorr = 0;
        for(int i=0; i<n; i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 4, 5, 5};
        System.out.println("The Element is :" +findingNumber(arr, arr.length));

    }
    
}
