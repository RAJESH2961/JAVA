
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    // For Pascal Triangle There are 3 Possible Questions
    // Question -1 : an Row index and Column index will be given need to return an element
    // Question -2 : an Row index will be given need to print Entire row
    // Question -3 : Print Entire Pascal Triangle
    public static long question_1(int n, int r){
            long ans =1;
            for(int i =0; i<r; i++){
                ans = ans*(n-i);
                ans = ans/(i+1);
            }
            return ans;
        }
//printing Entire row in pascal triangle
    public static void question_2(int n){
        int ans = 1;
        System.out.println(ans);
        for(int  i = 1; i<n; i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.println(ans);
        }
    }
    public static List<Integer>generateRow(int n){
        List<Integer> tempAns = new ArrayList<>();
        tempAns.add(1);
        int ans = 1;
        for(int i = 1; i<n; i++){
            ans = ans * (n-i);
            ans = ans/i;
            tempAns.add((int)ans);
        }
        return tempAns;
    }
    public static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
        //stores the Pascal Triangle
        for(int i = 1; i<=n; i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
        public static void main(String[] args) {
            int n = 5;
            int r = 3;
            // System.out.println("The Element at Particular Row and Column is : "+question_1(n-1,r-1));
            // System.out.println("The Elements at Nth Row is : " +question_2(n));
            // question_2(n+1);


            List<List<Integer>> ans = pascalTriangle(n);
            for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    
}
