import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        // 4. Split by Digits
        String inputDigit = "apple1banana2grape3";
        String[] inputParts = inputDigit.split("\\d");  // Split by each digit
        System.out.println(Arrays.toString(inputParts));
        System.out.println(inputParts[1]);
        // Split by digits based on 2 or more digits
        String input = "abc123def456ghi";
        String[] result = input.split("\\d+");// split based on digits if it is \\d if \\d+ two or more digits
        System.out.println(Arrays.toString(result)); // Output: [abc, def, ghi]

        // 5. Split by Non-Alphabetic Characters
        String input1 = "Hello@World#Java";
        String[] parts = input1.split("[^a-zA-Z]");
        System.out.println(Arrays.toString(parts));

        //3. Split by Multiple Delimiters (comma, semicolon, or pipe)
        String delimitersInput = "one,two;three|four";
        String[] delimiterParts = delimitersInput.split("[,;|]");
        System.out.println(Arrays.toString(delimiterParts));

    // Java String.split() with Regular Expressions - Examples
    // 1. Split by Space(s)
    // String input = "Java is awesome";
    // String[] parts = input.split("\\s+"); // One or more spaces
    // 2. Split by Comma
    // String input = "apple,banana,grape";
    // String[] parts = input.split(",");
    // 3. Split by Multiple Delimiters (comma, semicolon, or pipe)
    // String input = "one,two;three|four";
    // String[] parts = input.split("[,;|]");
    // 4. Split by Digits
    // String input = "apple1banana2grape3";
    // String[] parts = input.split("\\d"); // Split by each digit
    // 5. Split by Non-Alphabetic Characters
    // String input = "Hello@World#Java";
    // String[] parts = input.split("[^a-zA-Z]");
    // 6. Split on Each Character
    // String input = "abc";
    // String[] chars = input.split(""); // ["a", "b", "c"]
    // 7. Split by Digits (One or More)
    // String input = "abc123def456ghi";
    // String[] result = input.split("\\d+");
    // Java String.split() with Regular Expressions - Examples
    // // Output: [abc, def, ghi]




    }
}
