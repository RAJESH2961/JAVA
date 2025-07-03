import java.util.HashMap;
public class SubArrayWithKDifferentIntegers{
    public static int brute(int nums[], int k){
        int cnt = 0;
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            hm.clear();
            for(int j = i; j < n; j++){
                int ch = nums[j];
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                if(hm.size() == k){
                    cnt++;
                }
                if(hm.size() > k){
                    break;
                }
            }
        }
        return cnt;
    }
    public static int optimal(int[] nums, int k) {
        return subArrayLessThanEqual(nums,k) - subArrayLessThanEqual(nums, k-1);
    }
    public static int subArrayLessThanEqual(int[] nums, int k){
        int left = 0;
        int right = 0;
        int cnt = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(right < nums.length){
            int key = nums[right];
            hm.put(key, hm.getOrDefault(key,0)+1);
            while(hm.size() > k){ // if it is greather then obvisoly it is <=
                int remove = nums[left];
                hm.put(remove, hm.get(remove)-1);
                if(hm.get(remove) == 0){
                    hm.remove(remove);
                }
                left++;
            }
            cnt = cnt+(right-left+1);
            right++;
        }
        return cnt;
    }
    public static void main(String args[]){
        int arr[] = {1,2,1,2,3};
        int k = 2;
        System.out.println("Brute force "+brute(arr,k));
        System.out.println("Better Approach "+optimal(arr,k));

    }
}