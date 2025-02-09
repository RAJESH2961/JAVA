import java.util.ArrayList;

public class GoodPair {
    public static int solve(ArrayList<Integer> A, int B) {
            int n = A.size();
            for(int  i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if( (i!=j)&& (A.get(i) + A.get(j) == B) ){
                        return 1;
                    }
                }
            }
            return 0;
        }
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            System.out.println(solve(arr,7));
    }
}
