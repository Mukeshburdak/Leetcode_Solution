## LeetCode Solutions

### Kth Distinct String in an Array

- **Problem:** Kth Distinct String in an Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/kth-distinct-string-in-an-array/submissions/2115198670)

#### Code
```java
class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String a = arr[i];
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (a.equals(arr[j]) && i != j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                k--;
            }
            if (k == 0) {
                return a;
            }
        }
        return "";
    }
}
```
