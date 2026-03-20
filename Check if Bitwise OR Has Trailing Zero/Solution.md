## LeetCode Solutions

### Check if Bitwise OR Has Trailing Zero

- **Problem:** Check if Bitwise OR Has Trailing Zero  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros/solutions/7671377/check-if-bitwise-or-has-trailing-zero-ja-7lr9)

#### Code
```java
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int temp;
        int rem = 0;
        int n;
        boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                n = temp | nums[j];
                rem = n % 2;

                if (rem == 0) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
}
```
