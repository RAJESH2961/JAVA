public class LeftRotateArray {
    static void leftRotateBy1(int arr[]){
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
                //   0  1  2  3  4 
        leftRotateBy1(arr);
        System.out.println("Rotated Array is");
        for(int i = 0 ;i<arr.length; i++){
            System.out.println(arr[i]);

        }

    }
    
}
