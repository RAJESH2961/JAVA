public class second_largest{
    public static void main(String[] args) {
        int arr[]={1,6,12,98,5,6};

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]> largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > slargest && arr[i] < largest){
                slargest = arr[i];
            }

        }
        System.out.println("Second largest Element : "+ slargest);
        System.out.println("Largest Element " +largest);


    }
}