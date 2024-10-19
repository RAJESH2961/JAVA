package striver.Arrays;

public class sort {
    public static void main(String[] args) {
        int data [] = {7,5,3,6,87,54};
        // Arrays.sort(data);
        // System.out.println(data[data.length-1]);
        int largest = data[0];
        for (int i=0; i<= data.length-1; i++){
            if(data[i] > largest){
                largest = data[i];
            }
        }
        System.out.println("Largest Element in the Array is "+ largest);
        System.out.println(data[0]);

    }
    
}
