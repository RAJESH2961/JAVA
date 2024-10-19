public class second_smallest {
    public static void main(String[] args) {
        int data [] = {-1,5,12,78,-5,5,-10,-12,-11};

        int smallest = Integer.MAX_VALUE;//It will generate maximum value which an declared datatype hold
        int ssmallest = Integer.MAX_VALUE;
        System.out.println("Maximum value " + smallest);
        for (int i = 0; i < data.length; i++) {
            if(data[i] <  smallest){
                ssmallest = smallest;
                smallest = data[i];
            }
            else if(data[i] < ssmallest && data[i] != smallest){
                ssmallest = data[i];
            }
            
        }
        System.out.println("Smallest "+ smallest);
        System.out.println("Second Smallest "+ ssmallest);
    }
    
}
