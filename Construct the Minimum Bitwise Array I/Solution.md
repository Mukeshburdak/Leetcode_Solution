## LeetCode Solutions

### Construct the Minimum Bitwise Array I

- **Problem:** Construct the Minimum Bitwise Array I
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/submissions/2128720233)

#### Code
```java
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 1000; j++) {
                if ((j | (j + 1)) == nums.get(i)) {
                    ans[i] = j;
                    break;
                }
            }
            if (ans[i] == 0) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
```
