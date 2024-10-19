package leetcode;

public class twosum {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40};
        int target = 50; // Assuming you want a target of 50 for the example

        for(int i = 0; i < data.length - 1; i++) {
            for(int j = i + 1; j < data.length; j++) {
                if(data[i] + data[j] == target) {
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    return; // If only one pair is required, you can return after finding the first pair
                }
            }
        }

        // If no pair is found
        System.out.println("No two sum solution found.");
    }
}
