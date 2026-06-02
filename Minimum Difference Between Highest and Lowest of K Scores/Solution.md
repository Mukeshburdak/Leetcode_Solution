## LeetCode Solutions

### Minimum Difference Between Highest and Lowest of K Scores

- **Problem:** Minimum Difference Between Highest and Lowest of K Scores 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/submissions/2019732797)

#### Code
```java
class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
        int i = 0;
        int ans = Integer.MAX_VALUE;
        while (i < nums.length - k + 1) {
            int temp = nums[i + k - 1] - nums[i];
            if (temp < ans) {
                ans = temp;
            }
            i = i + 1;
        }
        if (ans == Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
    }
}
```
