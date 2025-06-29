import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class FruitsIntoBasket {
    public static int brute(int[] fruits) {
        int maxLen = 0;

        for (int i = 0; i < fruits.length; i++) {
            Set<Integer> fruitTypes = new HashSet<>();
            // int count = 0;

            for (int j = i; j < fruits.length; j++) {
                fruitTypes.add(fruits[j]);

                if (fruitTypes.size() > 2) {
                    break;
                }

                // count++;
                maxLen = Math.max(maxLen, j-i+1);
            }
        }

        return maxLen;
    }
    public static int better(int[] fruits) {
        int left = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            // If we have more than 2 types of fruits, shrink the window
            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static int optimal(int[] fruits) {
        int left = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            // If we have more than 2 types of fruits, shrink the window
            if (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println("Max fruits collected: " + brute(fruits));  // Output: 4
        System.out.println("Max fruits collected: " + better(fruits));  // Output: 4
        System.out.println("Max fruits collected: " + optimal(fruits));  // Output: 4
    }
}

