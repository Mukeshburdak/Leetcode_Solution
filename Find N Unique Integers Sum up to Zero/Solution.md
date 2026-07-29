## LeetCode Solutions

### Find N Unique Integers Sum up to Zero

- **Problem:** Find N Unique Integers Sum up to Zero  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/submissions/2086196350)

#### Code
```java
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int j = 1;
        for (int i = 0; i < n / 2; i++) {
            ans[i] = j;
            ans[n - i - 1] = -j;
            j++;
        }
        if (n % 2 != 0) {
            ans[n / 2] = 0;
        }
        return ans;
    }
}
```
