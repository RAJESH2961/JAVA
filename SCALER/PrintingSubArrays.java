public class PrintingSubArrays {
    public static void main(String[] args) {
        int []arr = {3, 4 ,5, 6 ,7};
        int n =  arr.length;
        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                for(int k = i; k<j+1; k++){
                    System.out.print(arr[k] +"");
                }
                cnt++;
                System.out.println();
            }
        }
        System.out.println("The Total Number of Sub arrays is :"+cnt);
    }
}
