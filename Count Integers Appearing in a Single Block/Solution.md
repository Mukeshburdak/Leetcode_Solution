## LeetCode Solutions

### Count Integers Appearing in a Single Block

- **Problem:** Count Integers Appearing in a Single Block  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-integers-appearing-in-a-single-block/submissions/2139759592)

#### Code
```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (i > 0 && nums[i - 1] == x) {
                continue;
            }
            int j = i;
            while (j < nums.length && nums[j] == x) {
                j++;
            }
            if (j - i == arr[x]) {
                count++;
            }
        }
        return count;
    }
}
```
