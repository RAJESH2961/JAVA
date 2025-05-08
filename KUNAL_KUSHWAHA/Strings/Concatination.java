import java.util.ArrayList;

public class Concatination {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // if we add 2 characters it will add their ascii
        System.out.println("a" + "b");// If we add 2 Strings it will concatinate
        System.out.println('a' + 3); //Ascii of a is 97 + 3 = 100
        System.out.println((char)('a' + 3)); //100 th value in Ascii is d
        System.out.println("a" + 1);
        //Here the integer will be converted into Integer that will call to toString()
        // Basically this will be converted after calling to String : "a" + "1"

        System.out.println(new Integer(56) + "" + new ArrayList<>()); 
        // if we want to perform concatination then there should be any one string even it is empty like above case
        //How these works
        // if there is non string object present in println() then the println() --> call --> toString() which converts the non string object into String object so that we can perform concatination

        //if no string is present it will be considered as expression

    }
}
