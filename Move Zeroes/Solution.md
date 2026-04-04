## LeetCode Solutions

### Move Zeroes

- **Problem:** Move Zeroes  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/move-zeroes/solutions/7771314/move-zeroes-java-shift-approach-on2-by-m-503d)

#### Code
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int m = n;
        int i = 0;

        while (i < n) {
            if (nums[i] == 0) {
                for (int j = i; j < m - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                m--;
                n--;
            } else {
                i++;
            }
        }
    }
}
