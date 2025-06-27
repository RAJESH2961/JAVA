public class MinimizedSortedArray {
    public static int minimized(int a[], int b[], int c[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                for(int k = 0; k < c.length; k++) {
                    int min_value = Math.min(a[i], Math.min(b[j], c[k]));
                    int max_value = Math.max(a[i], Math.max(b[j], c[k]));
                    int diff = max_value - min_value;
                    min = Math.min(min, diff );
                }
            }
        }
        return min;
    }
    // Optimal 3 pointer approach
    public static int optimal(int a[], int b[], int c[]) {
    int p1 = 0, p2 = 0, p3 = 0;
    int minDiff = Integer.MAX_VALUE;

    while (p1 < a.length && p2 < b.length && p3 < c.length) {
        int val1 = a[p1];
        int val2 = b[p2];
        int val3 = c[p3];

        int minVal = Math.min(val1, Math.min(val2, val3));
        int maxVal = Math.max(val1, Math.max(val2, val3));
        int diff = maxVal - minVal;

        

        // Early exit if best case found
        if (minVal == maxVal) return 0;

        // Move the pointer pointing to the minimum value
        if (minVal == val1) p1++;
        else if (minVal == val2) p2++;
        else p3++;
        
        minDiff = Math.min(minDiff, diff);
    }

    return minDiff;
}

    

    public static void main(String[] args) {
        int a[] = {3,14,16,20,29,40};
        int b[] = {-6,23,24,30,35,50};
        int c[] = {-15,15,26,31,39,42};
        System.out.println("Brute Force Approach : "+minimized(a,b,c));
        System.out.println("Optimal Approach : "+optimal(a,b,c));
    }
}
