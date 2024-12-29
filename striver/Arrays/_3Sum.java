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


    //Optimal Approach
    public static List<List<Integer>> optimal(int n, int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            //COntinue will not enter not enter to the loop it increases the i value
            int j=i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+ arr[j] + arr[k];
                if(sum<0){
                    j++;
                }
                else if (sum>0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //To avoid Duplicates
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }

        return ans;
    }
 
    public static void main(String[] args) {
        // int arr[] = {-1, 0, 1, 2, -1, -4};
        // System.out.println(brute(arr));
        int arr[] ={-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2,2};
        System.out.println(optimal(arr.length,arr));
        
    }
}
