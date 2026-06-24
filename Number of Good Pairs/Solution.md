## LeetCode Solutions

### Number of Good Pairs

- **Problem:** Number of Good Pairs 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-good-pairs/submissions/2044629809)

#### Code
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += arr[i] * (arr[i] - 1) / 2;
        }
        return sum;
    }
}
```
