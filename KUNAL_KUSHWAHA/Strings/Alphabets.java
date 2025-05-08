public class Alphabets {
    public static void main(String[] args) {
        String alpha = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            alpha +=ch;
            System.out.print(ch +" ");
        }
        System.out.println(alpha);
    }
    
}
