import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArray {
    public static int brute(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        List <Integer> arr3 = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n1 && j<n2){
            if(arr1[i] < arr2[j]){
                // System.out.println(i);
                arr3.add(arr1[i++]);
                // System.out.println(i);

            }
            else{
                arr3.add(arr2[j++]);
            }
        }
        //Adding the remaining elements
        while(i < n1){
            arr3.add(arr1[i++]);
        }
        while(j < n2){
            arr3.add(arr2[j++]);
        }
        System.out.println(arr3);
        // System.out.println(arr3.get(0));

        int size = n1+n2;
        if(size % 2 == 1){
            return arr3.get(size/2);
        }
        return (arr3.get(size/2) + arr3.get((size/2)-1))/2;
    }
    //Reduced Space Complexicity in brute we are using extra array to merge the two arrays here we are playing with pointers
    public static int better(int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;
        int size = n1+n2;
        System.out.println(size);
        System.out.println(n1);
        System.out.println(n2);
        //we want to find 2 index elememnts if the size is odd then we can return index 2 element,in case of even we should add 2 elements and return by dividing with 2
        int inx2 = size/2;
        int inx1 = inx2-1;
        //Storing the elememnts for returning purpose
        int ind1el = -1;
        int ind2el = -1;
        //pointers 
        int i = 0;
        int  j = 0;
        int cnt = 0;
        while(i<n1 && j < n2){
            if(a[i] < b[j]){
                if(cnt == inx1) ind1el = a[i];
                if(cnt == inx2) ind2el = a[i];
                cnt++;
                i++;
            }
            else{
                if(cnt == inx1) ind1el = b[i];
                if(cnt == inx2) ind2el = b[i]; 
                cnt++;
                j++;
            }
        }
        //copying the left over elements
        while(i < n1){
            if(cnt == inx1) ind1el = a[i];
            if(cnt == inx2) ind2el = a[i];
            i++;
        }
        while(j < n2){
            if(cnt == inx1) ind1el = b[i];
            if(cnt == inx2) ind2el = b[i];
            j++;
        }
        //finding the Median
        if(size % 2 == 1)//odd we can say for mid the left and right element will be same
        {
            return ind2el;
        }

        return (ind1el+ind2el)/2;
    }

    //Optimal Approach
    public static int optimal(int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;
        if(n1>n2) return optimal(b,a);//we can perform operation on smaller array so that the Time Complexity would be leseer
        int n = n1+n2;
        int left = (n1+n2+1)/2;//Formaula if 10 elemnts are given 11/2 = 5 (even)
        //Incase of odd 5+1/2 = 3 
        int low = 0, high = n1;
        while(low <= high){
            int mid1 = low+high/2;
            int mid2 = left-mid1;
            //The below conditions saysif there is no elements present then Default value woud be taken to complare

            int l1 = (mid1 > 0)? a[mid1-1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0)? a[mid2-1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1)? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2)? b[mid2] : Integer.MAX_VALUE;
            if(l1 <= r2 && l2 <=r1){
                if(n % 2 == 1) return Math.max(l1,l2);
            else return Math.max(l1,l2) + Math.min(r1, r2)/2;
            }
            else if(l1>l2) high = mid1-1;
            else low = mid1+1;
        }
        return 0;

    }
    public static void main(String[] args) {
        int []arr1 = {1,4, 7, 10, 12};
        int []arr2 = {2, 3 ,6, 15};
        System.out.println("Brute Force :"+brute(arr1, arr2));
        System.out.println("Better Force :"+better(arr1, arr2));
        System.out.println("optimal Approach :"+optimal(arr1, arr2));
    }
    
}
