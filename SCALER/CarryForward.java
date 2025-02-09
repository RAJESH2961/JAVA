public class CarryForward {
    public static void main(String[] args) {
        char[] chars = {'a', 'd', 'g', 'a', 'g', 'a', 'g', 'f', 'g'};
        int n = chars.length;
        int cnt_g = 0;
        int ans = 0;
        for(int i = n-1; i>=0; i--){
            if(chars[i] == 'g'){
                cnt_g++;
            }
            else if(chars[i] == 'a'){
                ans += cnt_g;
            }
        }
        System.out.println(ans);
        
    }
    
}
