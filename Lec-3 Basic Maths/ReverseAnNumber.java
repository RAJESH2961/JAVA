public class ReverseAnNumber {
    public static void main(String[] args) {
        int num = 7699;
        int reversed_number = 0;
        while(num>0){
            int rem = num % 10; //7699 % 10 = 769.9 == 9
            num = num/10; //7699 / 10 = 769
            reversed_number = reversed_number * 10 + rem; // 0 * 10 + 9 = 9 
            // 9 *10 + rem(9) = 99; 
            //99*10 + rem(6) = 996;
            //996*10 + rem(7) = 9960 + 7 = 9967
        }
        System.out.println("The Reversed Number is "+reversed_number);

    }
}
