## LeetCode Solutions

### Single Number

- **Problem:** Single Number 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/single-number/solutions/7847419/find-the-single-number-using-xor-on-opti-9oto)

#### Code
```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
```
