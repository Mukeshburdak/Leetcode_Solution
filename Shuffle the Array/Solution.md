## LeetCode Solutions

### Shuffle the Array

- **Problem:** Shuffle the Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/shuffle-the-array/solutions/7638926/shuffle-the-array-java-easy-solution-on-c7bbs)

#### Code
```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []ans = new int[2*n];
        int  j = 0;

        for(int i = 0; i < n; i++){
            ans[j] = nums[i];
            j += 1;
            ans[j] = nums[n+i];
            j += 1;
        }
        return ans;
    }
}
```
