## LeetCode Solutions

### Smallest Missing Multiple of K

- **Problem:** Smallest Missing Multiple of K
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-missing-multiple-of-k/submissions/2119067198)

#### Code
```java
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i = 1;
        int n = 0;
        while (true) {
            n = i * k;
            int t = 0;
            for (int j = 0; j < nums.length; j++) {
                if (n == nums[j]) {
                    t = 1;
                }
            }
            if (t == 0) {
                break;
            }
            i++;
        }
        return n;
    }
}
```
