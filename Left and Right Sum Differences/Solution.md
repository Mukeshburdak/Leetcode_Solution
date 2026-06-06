## LeetCode Solutions

### Left and Right Sum Differences

- **Problem:** Left and Right Sum Differences 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/left-and-right-sum-differences/submissions/2023746056)

#### Code
```java
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] Sum = new int[n];

        leftSum[0] = 0;
        rightSum[n - 1] = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                leftSum[i + 1] = leftSum[i] + nums[i];
            }
            if (i != 0) {
                rightSum[n - i - 1] = rightSum[n - i] + nums[n - i];
            }
        }
        for (int i = 0; i < n; i++) {
            int temp = leftSum[i] - rightSum[i];
            if (temp < 0) {
                Sum[i] = -temp;
            } else {
                Sum[i] = temp;
            }
        }
        return Sum;
    }
}
```
