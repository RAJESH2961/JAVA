import java.util.ArrayList;

public class LeadersInArray {
    static ArrayList leaders (int arr[], int n){
        ArrayList<Integer> leaders = new ArrayList<>();

        int max = arr[n-1];
        leaders.add(max);

        for(int i = n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                leaders.add(max);

            }
        }
        return leaders;
    }
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        System.out.println(leaders(arr, arr.length));
    }
    
}
