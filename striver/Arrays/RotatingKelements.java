public class RotatingKelements {
    //Brute Force Approach
    static void rotateKElements(int arr[], int n, int d) {
        //step-1 here we have extracted the k items and stored it in temporary
        int temp[] = new int[d];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
            System.out.println(temp[i]);
        }
        // step-2 placing the last elements in the first
        for(int i = 0 ; i < n - d; i++){
            arr[i] = arr[i+d];
        }

        ///4 5 6 7 8 9 10 8 9 10
        // step-3 we have to palce the temporary array ath the end of the origional array
        for(int i = n-d ;i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
        System.out.println("Printing Elements after Rotated ");
        for (int i = 0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    //Optimal Approach Without Using Extra Space
    static void rotateKElementsWithoutUsingExtraSpace(int arr[], int n, int k){
        k = k % n;  // In case k is larger than n

        // Step 1: Reverse the first k elements (from 0 to k-1)
        reverse(arr, 0, k - 1);

        // Step 2: Reverse the remaining elements (from k to n-1)
        reverse(arr, k, n - 1);

        // Step 3: Reverse the entire array (from 0 to n-1)
        reverse(arr, 0, n - 1);
        System.out.println("Printing Elements");

        for (int i = 0; i<n; i++)
        {
            System.out.println(arr[i]);
        }


    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // rotateKElements(arr, arr.length, 3);
        System.out.println("Length of the Array is : "+arr.length);
        rotateKElementsWithoutUsingExtraSpace(arr, arr.length, 3);
    }

}
