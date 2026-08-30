## LeetCode Solutions

### Replace Elements with Greatest Element on Right Side

- **Problem:** Replace Elements with Greatest Element on Right Side
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/2125274318)

#### Code
```java
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int a = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (a < arr[j]) {
                    a = arr[j];
                }
            }
            arr[i - 1] = a;
        }
        arr[n - 1] = -1;
        return arr;
    }
}
```
