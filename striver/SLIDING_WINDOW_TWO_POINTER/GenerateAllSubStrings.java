public class GenerateAllSubStrings {
    public static void main(String[] args) {
        String data = "abcd";

        // Generate all substrings
        for (int i = 0; i < data.length(); i++) {
            for (int j = i + 1; j <= data.length(); j++) {
                // a b c d
                // substring(0,1) == (0,0) j is excluded in substring
                System.out.println(data.substring(i, j));
            }
        }
    }
}
