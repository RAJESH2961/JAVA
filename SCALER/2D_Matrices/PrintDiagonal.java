
import java.util.ArrayList;

public class PrintDiagonal {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, 
                        {4,5,6}, 
                        {7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        //Starting values
        int r = m-1;
        int c = 0;
        while(c<n){
            ArrayList<Integer> diag = new ArrayList<>();
            int i = r;
            int j = c;
            while(i<m && j<n){
                diag.add(arr[i][j]);
                i++;
                j++;
            }
            System.out.println(diag);
            if(r > 0){
                r--;
            }
            else{
                c++;
            }
        }

        //It will print from top right
        /* 
         * //Starting values
        int r = 0;
        int c = n-1;
        while(r<m){
            ArrayList<Integer> diag = new ArrayList<>();
            int i = r;
            int j = c;
            while(i<m && j<n){
                diag.add(arr[i][j]);
                i++;
                j++;
            }
            System.out.println(diag);
            if(c > 0){
                c--;
            }
            else{
                r++;
            }
        }
         */
    }
}
