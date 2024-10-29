import java.util.HashSet;

public class RemoveDulicates {
    //set only contains Unique Elements
    public static void main(String args[]) {
        //Brute Force Approach
        int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     set.add(arr[i]);
        // }
        // int j=0;
        // for(int x: set){
        //     arr[j++] = x;
        // }
        // System.out.println(set.size());
        
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        //Optimal approach using two pointer
        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int k = 0 ;k<=i; k++){
            System.out.println("Unique Elements in the Array are :"+arr[k]);
        }
    }

}
