class leetcode {
    public static boolean doesValidArrayExist(int[] derived) {
            
            int[] original = derived;
            int n = derived.length+1;
            for(int i = 0; i<n; i++){
                derived[i] = original[i]^original[i+1];
            }
            return true;
        }

        public static void main(String[] args) {
            int []derived = {1,1,0};
            System.out.println(doesValidArrayExist(derived));
    }
}
