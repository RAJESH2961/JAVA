public class twosum_srtiver {


    public static String twosum(int data[], int target, int n, int answer[]){
        for( int i=0; i< n; i++){
            for(int j=i+1; j<n; j++){
                if(data[i] + data[j] == target)
                {
                    answer[0] = data[i];
                    answer[1] = data[j];
                    return "yes";
                }
            }
        }
        return "No";

    }
    public static void main(String[] args) {
        int data[] = {1, 4, 1, 7,5,9};
        int target = 12;
        int n=6;
        int answer [] = {-1,-1};

        String ans = twosum(data,target,n, answer);

        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
    
}
