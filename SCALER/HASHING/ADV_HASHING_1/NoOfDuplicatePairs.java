
import java.util.HashMap;

public class NoOfDuplicatePairs{
    public static int optimal(int arr[]){
        int cnt = 0;
        //Hashmap to store freq 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int data:arr){
            if(hm.containsKey(data)){
                cnt = cnt+hm.get(data);
                hm.put(data, hm.getOrDefault(data, 0)+1);
            } else {
                hm.put(data, hm.getOrDefault(data, 0)+1);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,1,4,6,1};
        System.out.println("Optimal using one Iteration :"+optimal(arr));
    }
}