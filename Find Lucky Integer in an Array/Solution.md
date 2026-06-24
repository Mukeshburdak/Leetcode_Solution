## LeetCode Solutions

### Find Lucky Integer in an Array

- **Problem:** Find Lucky Integer in an Array 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-lucky-integer-in-an-array/submissions/2044639944)

#### Code
```java
class Solution {
    public int findLucky(int[] arr) {
        int[] res = new int[501];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]]++;
        }
        int max = 0;
        for (int i = 1; i <= 500; i++) {
            if (i == res[i] && max < i) {
                max = i;
            }
        }
        if (max != 0) {
            return max;
        }
        return -1;
    }
}
```
