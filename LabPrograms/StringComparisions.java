public class StringComparisions{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3.equals(str4));
    }
}