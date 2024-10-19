public class insertion_sort {
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        int n=6;
        for (int i=1; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

            
        }
    }
    

