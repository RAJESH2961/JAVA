public class selection_sort{
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n=6;
        for(int i=0; i<=n-2; i++){
            int minimum = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j] < arr[minimum]){
                    minimum = j;
                }
            }
        int temp = arr[minimum];
        arr[minimum] = arr[i];
        arr[i] = temp;
    }
}
}