## LeetCode Solutions

### Find Greatest Common Divisor of Array

- **Problem:** Find Greatest Common Divisor of Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-greatest-common-divisor-of-array/submissions/2052434204)

#### Code
```java
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[0];
        int b = nums[n - 1];
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
