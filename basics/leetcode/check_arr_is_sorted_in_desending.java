public class check_arr_is_sorted_in_desending {
    public static void main(String[] args) {
        int data [] = {77,66,55,44,33,22,11};
        boolean sorted = false;
        for(int i=1; i<=data.length-1; i++){
            if(data[i] <= data[i-1]){
                sorted=true;
            }
            else{
                sorted= false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not sorted");
        }
    }
    
}
