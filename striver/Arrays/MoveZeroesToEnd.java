import java.util.ArrayList;

public class MoveZeroesToEnd {
    static void bruteMoveZeroesToEnd(int arr[], int n){
        // step-1
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        // step-2 Add the temp elements(which is non zero elements) in to the origional array
        for(int i=0; i< temp.size(); i++){
            arr[i] = temp.get(i);
        }
        //step-3 assign the zeroes for remaining elements 
        // we have stored temp elemnts size of n but few portion is remaining so n-temp.size() remaining will be zero
        for(int i = temp.size(); i<n; i++){
            arr[i] = 0;
        }
        // Time complexity step-1 O(N) + step-2 O(X) + step-3 O(N-X)

    }

    static void optimalApproach(int arr[], int n){
        //step-1 we need to find the first zero th index in order to move zeroes to end if not zeroes are found just return an message
        int j = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        // step-2 Two pointer optimalApproach
        // if the element is not zero then swap, i, j
        // the J should be always 0
        for(int i = j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 2, 0, 4, 3, 0, 9, 0, 0, 1};
        // bruteMoveZeroesToEnd(arr, arr.length);
        optimalApproach(arr, arr.length);
        System.out.println("Printing Elements ");
        for(int x : arr){
            System.out.println(x);
        }
        
    }
    
}
