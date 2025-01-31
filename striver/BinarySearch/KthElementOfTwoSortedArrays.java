import java.util.ArrayList;
import java.util.List;
//Brute Force Approach is Direct create an 3rd array and store ind return the kth element T.C = O(N+M) --> S.C = O(N+M)
//Better Reduced Time complexicity played with pointers asign a pointer and i&j iterate through both loops and return if finded kth element 
public class KthElementOfTwoSortedArrays {
    public static int brute(int arr1[], int arr2[], int k){
        int a = arr1.length;
        int b = arr2.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        List <Integer> ans = new ArrayList<>();
        while(i<a && j<b){
            if(arr1[i] < arr2[j]){
                ans.add(arr1[i]);
                i++;
                cnt++;
            }
            else{
                ans.add(arr2[i]);
                j++;
                cnt++;
            }
        }
        //Add the Remaining Elements
        while(i < a){
            cnt++;
            ans.add(arr1[i]);
            i++;
        }
        while(j < b){
            cnt++;
            ans.add(arr2[j]);
            j++;
        }
        return ans.get(k-1);
    }

    public static int better(int arr1[], int arr2[], int k){
        int a = arr1.length;
        int b = arr2.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        // List <Integer> ans = new ArrayList<>();
        while(i<a && j<b){
            if(arr1[i] < arr2[j]){
                // ans.add(arr1[i]);
                cnt++;
                if(cnt == k) return arr1[i];
                i++;//Note Increament after The Searched the Count if we increament the I value before it will give an error
            }
            else{
                // ans.add(arr2[i]);
                cnt++;
                if(cnt == k) return arr2[j];
                j++;
            }
        }
        //Add the Remaining Elements
        while(i < a){
            cnt++;
            // ans.add(arr1[i]);
            if(cnt == k) return arr1[i];
            i++;
        }
        while(j < b){
            cnt++;
            // ans.add(arr2[j]);
            if(cnt == k) return arr2[j];
            j++;
        }
        return -1;
}

//Optimal using Binary Search
public static int optimal(int arr1[], int arr2[], int k){
    int n1 = arr1.length;
    int n2 = arr2.length;
    int n = n1+n2;
    if(n1 > n2) return optimal(arr2,arr1,k);
    int left = k; //No of elelments required for left side total in Median approach n1+n2/2 but here we are going to find kth element so we dont need to do so we can assign left as k
    int low = Math.max(0, left-n2);
    int high = Math.min(k, n1);

    while(low <= high){
        int mid1 = (low+high)/2;
        int mid2 = left -mid1;
        int l1 = (mid1 > 0)? arr1[mid1-1] : Integer.MIN_VALUE;
        int l2 = (mid2 > 0)? arr2[mid2-1] : Integer.MIN_VALUE;
        int r1 = (mid1 < n1)? arr1[mid1] : Integer.MAX_VALUE;
        int r2 = (mid2 < n2)? arr2[mid2] : Integer.MAX_VALUE;
        if(l1 <= r2 && l2 <= r1){
            return Math.max(l1,l2);
        }
        else if(l1 > r2) high = mid1-1;
        else low = mid1+1;
    }
    return 0;
}
    public static void main(String[] args) {
        int arr1[] = {1, 4 ,7 ,10 ,12};
        int arr2[] = {2, 3 ,6 ,15};
        System.out.println("Brute Force Approach "+brute(arr1, arr2, 5));
        System.out.println("Better Approach "+better(arr1, arr2, 5));
        System.out.println("Optimal Approach "+optimal(arr1, arr2, 5));

    }
    
}
