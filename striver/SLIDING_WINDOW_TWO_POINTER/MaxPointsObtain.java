public class MaxPointsObtain {
    public static  int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        // step-1 calculate the first k elements
        for(int i = 0; i < k; i++) {
            leftSum = leftSum + cardPoints[i];
        }
        int maxValue = leftSum;

        // step-2 reduce one from left and take one from right
        // update the max value according to that
        int rightIndex = cardPoints.length-1;
        int rightSum = 0;
        for(int i = k-1; i >=0 ; i--) {
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[rightIndex];
            // reduce the right index
            rightIndex--;
            maxValue = Math.max(maxValue,(leftSum + rightSum));
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int arr[] = {11,2,3,45,4,11,12};
        int k = 3;
        System.out.println("Max points i can obtain is : "+ maxScore(arr,k));
    }
}

