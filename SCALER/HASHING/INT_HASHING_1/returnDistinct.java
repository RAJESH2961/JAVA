
import java.util.Arrays;
import java.util.HashSet;

public class returnDistinct {

    public static int[] brute(int arr[]) {
        int[] unique = new int[arr.length];
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicatefound = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    duplicatefound = true;
                    break;
                }
            }
            if (!duplicatefound) {
                unique[uniqueCount++] = arr[i];
            }
        }
        // since we declared unique size of array n elements some are not used in that caase we can reemove zeroes at end;
        // return sub array 
        return Arrays.copyOfRange(unique, 0, uniqueCount);
    }

    // Optimal approach
    public static Integer[] optimal(int arr[]) {
        Integer[] unique = new Integer[arr.length];

        // Push all elements into hashmap
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]); // Automatically removes duplicates
        }
        // // Storing hashsset elemetns into an array
        // Iterator<Integer> iterator = hs.iterator();
        // int cnt = 0;
        // while (iterator.hasNext()) {
        //     // Integer data = 
        //     unique[cnt++] = iterator.next();
        // }
        return hs.toArray(new Integer[hs.size()]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2};
        int[] brute = brute(arr);
        for (int data : brute) {
            System.out.println("Distinct :" + data);
        }
    }
}
