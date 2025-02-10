public class LeadersCount {
    public static void main(String[] args) {
        int arr[] = {15, -1, 7, 2, 5, 4, 2, 3};
        int n = arr.length;
        int leaderCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) { // If any right element is greater, not a leader
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaderCount++;
            }
        }

        System.out.println("Total number of leaders: " + leaderCount);


        System.out.println("Optimal Approach");
        int max = arr[n-1];
        int cnt = 1;
        for(int i = n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                cnt++;
            }
        }
        System.out.println("Total number of leaders: " + cnt);

    }
}
