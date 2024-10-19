public class ExtractionOfDigits {
    public static void main(String[] args) {
        int n = 7699;
        while(n>0){
            int lastDigit = n%10; // extracting last digit 7699/10 = 769.9 we weill take remainder 76%10 = 7.6
            System.out.println("Printing last digits : "+lastDigit);
            n = n/10; // removing last digit
        }
    }
    
}
