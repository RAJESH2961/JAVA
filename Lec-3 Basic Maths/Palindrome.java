public class Palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int temp = n;
        int reversed = 0;
        while(n>0){
            int rem = n % 10 ;
            n = n/10;
            reversed = reversed * 10 + rem;
        }
        if (reversed == temp ){
            System.out.println("Given Number "+temp+" is palindrome ");
        }
        else{
            System.out.println("Given Number "+temp+" is Not an  palindrome ");

        }
    }
    
}
