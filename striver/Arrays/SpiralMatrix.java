import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix{
    public static List<Integer> printSpiral(int mat[][]){
        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int left = 0;
        int bottom = mat.length-1;
        int right = mat[0].length-1;
        while(top<=bottom && left<=right){

        
        //left to right
        for(int i=left; i<=right; i++){
            ans.add(mat[top][i]);
        }
        top++;
        //top to bottom
        for(int i= top; i<=bottom; i++){
            ans.add(mat[i][right]);
        }
        right--;
        //right to left
        if(top<=bottom){
        for(int i = right; i>=left; i--){
            ans.add(mat[bottom][i]);
        }
        bottom--;

    }
    if(left<=right){
        //bottom to top
        for(int i= bottom; i>=top; i--){
            ans.add(mat[i][left]);
        }
        left++;
    }

    }
        return ans;
        
    }
    public static void main(String[] args) {
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> answer = printSpiral(mat);
        System.out.println("Elements .. ");
        for(int i=0; i< answer.size(); i++){
            System.out.println(answer.get(i)+ " ");

        }
    }
}