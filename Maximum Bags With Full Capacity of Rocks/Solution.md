## LeetCode Solutions

### Maximum Bags With Full Capacity of Rocks

- **Problem:** Maximum Bags With Full Capacity of Rocks  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/submissions/2092106739)

#### Code
```java
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int[] arr = new int[n];
        for (int i = 0; i < capacity.length; i++) {
            arr[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= additionalRocks) {
                additionalRocks -= arr[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
```
