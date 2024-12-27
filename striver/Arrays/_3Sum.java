import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3Sum {
    public static List<List<Integer>> brute(int arr[]){
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> answer = new ArrayList<>(st);

        //Before returning the answer Display the Set
        for(List<Integer> it :answer){
            System.out.println("[");
            for(Integer d: it){
                System.out.print(d +" ");
            }
            System.out.print("]");
        }
        System.out.println();

        return answer;
        // return st; after changing data type but.. why here we are returning List is if Set is unordered it doesnot follow ordered instructions
        //when we return set we can perform other operations like displaying ... in List
    }

    //Better Approach
    public static 
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(brute(arr));
        
    }
}
