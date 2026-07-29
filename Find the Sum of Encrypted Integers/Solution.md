## LeetCode Solutions

### Find the Sum of Encrypted Integers

- **Problem:** Find the Sum of Encrypted Integers  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-sum-of-encrypted-integers/submissions/2086164695)

#### Code
```java
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += encrypt(nums[i]);
        }
        return sum;
    }

    private int encrypt(int x) {
        int max = 0;
        int i = 0;
        while (x > 0) {
            int rem = x % 10;
            if (rem > max) {
                max = rem;
            }
            x /= 10;
            i++;
        }
        if (i == 2) {
            return max * 11;
        } else if (i == 3) {
            return max * 111;
        } else if (i == 4) {
            return max * 1111;
        } else {
            return max;
        }
    }
}

```
