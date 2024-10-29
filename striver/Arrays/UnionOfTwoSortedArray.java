import java.util.*;
//Brute Force Approach

public class UnionOfTwoSortedArray {
    //Brute Force Approach
    static HashSet<Integer> setUnion(int arr1[], int arr2[]) {
        //Storing the Elements in the final Unioned Array
        HashSet<Integer> unionSet = new HashSet<>();

        // Add elements from the first array
        for (int i : arr1) {
            unionSet.add(i);
        }

        // Add elements from the second array
        for (int i : arr2) {
            unionSet.add(i);
        }

        return unionSet;
    }
    //Optimal Approach using Two pointers
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
       ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
       while (i < n && j < m) {
         if (arr1[i] <= arr2[j]) // Case 1 and 2
         {
           if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
             Union.add(arr1[i]);
           i++;
         } else // case 3
         {
           if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
             Union.add(arr2[j]);
           j++;
         }
       }
       while (i < n) // IF any element left in arr1
       {
         if (Union.get(Union.size()-1) != arr1[i])
           Union.add(arr1[i]);
         i++;
       }
       while (j < m) // If any elements left in arr2
       {
         if (Union.get(Union.size()-1) != arr2[j])
           Union.add(arr2[j]);
         j++;
       }
       return Union;
     }
     


    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 4, 6, 7};
        int arr2[] = {1, 1, 2, 3, 6, 8, 9, 10};
        // [1, 1]

        // HashSet<Integer> unionResult = setUnion(arr1, arr2);
        // System.out.println("Union of the two arrays: " + setUnion(arr1, arr2));
        System.out.println("Union of the two arrays: " + FindUnion(arr1, arr2, arr1.length, arr2.length));
    }
}
