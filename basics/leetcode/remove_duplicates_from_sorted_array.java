public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int data [] = {1, 1, 3, 3, 5, 5};
        //{1, 3, 3, 5, 5}
        //{1, 3, 5, 5}
        //

        int i=0; //1 2 
        for(int j=1; j<=data.length-1; j++){
            if(data[i] != data[j]){
                i++;
                data[i]=data[j];
            }
        }
        int index = i;
        System.out.println(index);
        for(int x=0 ;x<=index; x++){
            System.out.println("Values in the array "+ data[x]);
        }

    }
    
}
