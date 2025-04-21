public class Clear_ith_bit{
    public static void main(String args[]){
        int num = 13;
        int index = 3;
        int bit_mask = ~(1<<index);
        int val = num&bit_mask;
        System.out.println(val);
    }
}