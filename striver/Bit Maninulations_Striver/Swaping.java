public class Swaping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping Value A is :"+a);
        System.out.println("Before Swapping Value B is :"+b);
        
        a = a^b; //10^20 = 30  a = a+b
        b = a^b; //30^20 = 10  b = a-b
        a = a^b; //30^10 = 20  a = a-b
        System.out.println("After Swapping Value A is :"+a);
        System.out.println("After Swapping Value B is :"+b);

    }
    
}
