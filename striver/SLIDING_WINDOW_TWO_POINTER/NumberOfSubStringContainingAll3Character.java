public class NumberOfSubStringContainingAll3Character {
    public static int numberOfSubstrings(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] hash = new int[3];
            for(int j = i; j < s.length(); j++){
                hash[s.charAt(j) - 'a'] = 1;
                if((hash[0]+hash[1]+hash[2]) == 3 ) {
                    cnt++;
                }
            }
            
        }
        return cnt;
    }
    public static int better(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] hash = new int[3];
            for(int j = i; j < s.length(); j++){
                hash[s.charAt(j) - 'a'] = 1;
                if((hash[0]+hash[1]+hash[2]) == 3 ) {
                    // cnt++;
                    cnt = cnt + (s.length()-j);
                    break;
                }
            }
            
        }
        return cnt;
    }
    public static void main(String[] args) {
        String s = "bbacba";
        System.out.println("Brute Force Approach : "+numberOfSubstrings(s));
        System.out.println("Better  Approach : "+better(s));
    }
}
