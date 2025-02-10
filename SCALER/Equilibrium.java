public class Equilibrium {
    //An Index i is said to be equilibrium if the sum of All Elements before i th index == sum of all Emements after i th index
    //Approach Buid an Prefix Sum array
    
    public static void main(String[] args) {
        int arr[] = {-7, 1 ,5, 2 ,-4, 3 ,0};
        int []prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        System.out.println("Printing Prefix Sum array");
        for(int data : prefix){
            System.out.print(data +" ");
        }
        System.out.println();
        int n = arr.length;
        for(int i = 1; i<n-1; i++){
            if(prefix[i-1] == prefix[n-1]-prefix[i]){
                System.out.println("Element Found "+i);
            }
        }   
    }
}
