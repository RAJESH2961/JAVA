import java.util.*;

public class IntersectionOfTwoSortedArray {
    static ArrayList<Integer> brute(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> intersection = new ArrayList<>();
        int visited[] = new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // Check if arr1[i] equals arr2[j] and arr2[j] has not been visited
                if(arr1[i] == arr2[j] && visited[j] == 0){
                    intersection.add(arr1[i]);
                    visited[j] = 1; // Mark arr2[j] as visited
                    break;
                }
                if(arr2[j] > arr1[i]) break;
            }
        }
        return intersection;
    }

    //Optimal Approach
    static ArrayList<Integer> optimal(int arr1[], int arr2[], int m, int n){
        ArrayList<Integer> intersection = new ArrayList<>();
        int i=0;
        int j=0;
        // while(i<n && j<n){
        //     if(arr1[i] == arr2[j]){
        //         intersection.add(arr1[i]);
        //         i++;
        //         j++;
        //     }
        //     else if (arr1[i] < arr2[j]){
        //         i++;
        //     }
        //     else 
        //     j++;
        // }
        // or
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j]< arr1[i]){
                j++;
            }
            else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };
        // System.out.println(brute(arr1, arr2, arr1.length, arr2.length));
        System.out.println(optimal(arr1, arr2, arr1.length, arr2.length));
    }

}
