public class Strings {
    public static void main(String[] args) {
        // String literals are stored in the String Constant Pool.
        // Both name1 and name2 refer to the same object in the pool.
        String name1 = "Rajesh";
        String name2 = "Rajesh";

        // Compares object references (memory addresses).
        System.out.println(name1 == name2); // true

        // Using 'new' creates distinct String objects in the heap.
        String a = new String("Rajesh");
        String b = new String("Rajesh");

        // Comparing object references (will be false since 'a' and 'b' are different objects).
        System.out.println(a == b); // false

        // .equals() compares the actual content/value of the strings.
        System.out.println(a.equals(b)); // true
        System.out.println();
        Integer num = new Integer(12);
        System.out.println(num.toString());

    }
}
