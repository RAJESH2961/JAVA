public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++){
            char ch = ((char)('a' + i));
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.toString());
        sb.deleteCharAt(1);
        System.out.println(sb.toString());
        System.out.println(sb.reverse());


    }
}
