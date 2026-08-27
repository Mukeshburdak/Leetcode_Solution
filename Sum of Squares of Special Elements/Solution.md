## LeetCode Solutions

### Sum of Squares of Special Elements 

- **Problem:** Sum of Squares of Special Elements 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-squares-of-special-elements/submissions/2121923700)

#### Code
```java
class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sqSum = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                sqSum += Math.pow(nums[i], 2);
            }
        }
        return sqSum;
    }
}
```
