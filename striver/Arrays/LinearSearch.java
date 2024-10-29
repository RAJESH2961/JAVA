import java.util.ArrayList;
public class LinearSearch {
    static int lS(int arr[], int n, int occurance){
        int ele = 4;
        int count=0;
        for(int i = 0; i<n; i++){
            if(arr[i] == ele){
                count++;
            if(count==occurance){
                return i;
            }
            }
        }
        return -1;
    }
    static ArrayList<Integer> allOccurance(int arr[], int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] == 4){
                temp.add(i);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 4, 1, 4, 7, 4, 4};
        // System.out.println(lS(arr, arr.length, 4));
        System.out.println(allOccurance(arr, arr.length));

    }
    
}
