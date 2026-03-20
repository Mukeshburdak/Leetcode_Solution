## LeetCode Solutions

### Bitwise OR of Even Numbers in Array

- **Problem:** Bitwise OR of Even Numbers in Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/submissions/1953590332)

#### Code
```java
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;
        int i;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result = nums[i];
                break;
            }
        }

        for (int j = i; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int n = nums[j];
                result = result | n;
            }
        }

        return result;
    }
}
```

#### Optimise Code
```java
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;
        int i;
        for (int num : nums) {
            if (num % 2 == 0) {
                result |= num;
            }
        }
        return result;
    }
}
```
