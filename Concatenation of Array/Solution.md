## LeetCode Solutions

### Concatenation of Array

- **Problem:** Concatenation of Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/concatenation-of-array/solutions/7638894/concatenation-of-array-simple-java-solut-qpvj)

#### Code
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[n + i] = nums[i];
        }

        return ans;
    }
}
```
