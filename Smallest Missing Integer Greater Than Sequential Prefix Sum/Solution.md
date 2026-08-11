## LeetCode Solutions

### Smallest Missing Integer Greater Than Sequential Prefix Sum

- **Problem:** Smallest Missing Integer Greater Than Sequential Prefix Sum 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/submissions/2102797753)

#### Code
```java
class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                break;
            }
            sum += nums[i];
        }
        int ans = sum;
        while (true) {
            boolean a = false;
            for (int i = 0; i < n; i++) {
                if (ans == nums[i]) {
                    a = true;
                }
            }
            if (a == false) {
                break;
            }
            ans++;
        }
        return ans;
    }
}
```
