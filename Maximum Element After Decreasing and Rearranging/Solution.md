## LeetCode Solutions

### Maximum Element After Decreasing and Rearranging

- **Problem:** Maximum Element After Decreasing and Rearranging
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/submissions/2048509735)

#### Code
```java
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[n - 1];
    }
}
```
