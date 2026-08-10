## LeetCode Solutions

### Duplicate Zeros

- **Problem:** Duplicate Zeros
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/duplicate-zeros/submissions/2101824638)

#### Code
```java
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == 0) {
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = 0;
                i++;
            }
        }
    }
}
```
