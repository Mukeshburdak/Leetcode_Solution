## LeetCode Solutions

### Smallest Index With Digit Sum Equal to Index

- **Problem:** Smallest Index With Digit Sum Equal to Index 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/submissions/2151941727)

#### Code
```java
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}
```
