
import java.util.ArrayList;
import java.util.Arrays;

public class Sort_0_1_2 {
    public static void sortArrayBetter (ArrayList<Integer> arr1, int n){
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        // for(int i = 0; i<n; i++){
        //     switch (arr[i]) {
        //         case 0:
        //             count_0++;
        //             break;
        //         case 1:
        //             count_1++;
        //             break;
        //         default:
        //             count_2++;
        //             break;
        //     }
        // }
        // for(int i=0; i<count_0; i++){
        //     arr[i]=0;
        // }
        // for(int i=count_0; i<count_1+count_0; i++){
        //     arr[i]=1;
        // }
        // for(int i=count_0+count_1; i<n; i++){
        //     arr[i]=2;
        // }

        //or

        for(int i=0; i<n; i++){
            if(arr1.get(i) == 0){
                count_0++;
            }
            else if(arr1.get(i) == 1){
                count_1++;
            }
            else{
                count_2++;
            }
        }

        for(int i=0; i<count_0; i++){
            arr1.set(i, 0);
        }
        for(int i=count_0; i<count_1+count_0; i++){
            arr1.set(i, 1);
        }
        for(int i=count_0+count_1; i<n; i++){
            arr1.set(i, 2);
        }



    }
    public static void optimal(int arr[], int n){
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;

            }
        }
                                                  

    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,0,1,2,2,2,1,1,1,1,0};
        // // sortArrayBetter(arr, arr.length);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(new Integer[] {0,2,1,2,0,1,1,1,0,0}));
        // for(int i = 0 ;i<20; i++){
        //     if(i%2 == 0){
        //         arr1.add(1);
        //     }
        //     else if(i%2 == 1){
        //         arr1.add(0);
        //         arr1.add(2);
        //     }

        // }
        // sortArrayBetter(arr1, arr1.size());
        // System.out.println(arr1);
        optimal(arr, arr.length);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }  

        

    }
    
}
