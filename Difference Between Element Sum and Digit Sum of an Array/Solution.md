## LeetCode Solutions

### Difference Between Element Sum and Digit Sum of an Array

- **Problem:** Difference Between Element Sum and Digit Sum of an Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/submissions/2112693519)

#### Code
```java
class Solution {
    public int differenceOfSum(int[] nums) {
        int digitSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            sum += n;
            while (n > 0) {
                digitSum += n % 10;
                n /= 10;
            }
        }
        return Math.abs(sum - digitSum);
    }
}
```
