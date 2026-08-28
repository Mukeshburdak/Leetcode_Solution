## LeetCode Solutions

### Find Numbers with Even Number of Digits

- **Problem:** Find Numbers with Even Number of Digits
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/2122894076)

#### Code
```java
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int temp = 0;
            while (n > 0) {
                n /= 10;
                temp++;
            }
            if (temp % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
```
