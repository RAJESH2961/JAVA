import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Max_N_3 {
    public static List<Integer> brute(int arr[]){
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            // if(answer.size()==0 || answer.get(0)!=arr[i])
            // {
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            
                if(cnt>(arr.length/3)){answer.add(arr[i]);}
        // }
                if(answer.size()==2){break;}
        }
            
        return answer;
    }
    //HashMap Doesnt contain Duplicates
    //getorDefault() returns the value of an key
    //Syntax : (key,Defalut)
    //Syntax : (arr[i],0)

    public static List<Integer> better_hashing(int arr[]){
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        int mini = (arr.length/3)+1;
        for(int i=0; i<arr.length; i++){
            //getting the value from the map
            int value = hs.getOrDefault(arr[i], 0);//It returns the value(frequency) of an element if 
            hs.put(arr[i], value+1);

            if(hs.get(arr[i])==mini){
                answer.add(arr[i]);
            }
            if(answer.size()==2) break;

        }
        return answer;
    }
    public static List<Integer> optimalMooreExtend(int arr[]){
        List<Integer> answer = new ArrayList<>();
        int n = arr.length;
        int cnt1=0;
        int cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        //Applying the Moores Algorithm
        for(int i=0; i<n; i++){
            if(cnt1==0 && el2!=arr[i]){
                cnt1=1;
                el1 = arr[i];
            }
            else if(cnt2==0 && el2!=arr[i]){
                cnt2=1;
                el2 = arr[i];
            }
            else if(arr[i] == el1) cnt1++;
            else if(arr[i] == el2) cnt2++;
            else{
                cnt1--; cnt2--;
            }
        }
            System.out.println(el1);
            System.out.println(el2);
            //Manually checking the Element 
            cnt1=0;
            cnt2=0;
            for(int i=0; i<n; i++){
                if(arr[i]==el1) cnt1++;
                if(arr[i]==el2) cnt2++;
            }
                int mini = (int)(n/3)+1;
                if(cnt1>=mini) answer.add(el1);
                if(cnt2>=mini) answer.add(el2);
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        // System.out.println(brute(arr));
        // System.out.println(better_hashing(arr));
        System.out.println(optimalMooreExtend(arr));
        
    }
    
}
