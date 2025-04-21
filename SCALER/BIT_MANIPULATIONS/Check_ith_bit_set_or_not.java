public class Check_ith_bit_set_or_not{
    public static void main(String args[]){
        int num = 8;
        int index = 3;
        int bit_mask = 1<<index;
        int val = num&bit_mask;
        if(val > 0){
            System.out.println(index+" bit is a set");
        }
        else{
            System.out.println(index+"bit is a Not set bit");
        }
    }
}