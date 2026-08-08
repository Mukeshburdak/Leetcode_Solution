## LeetCode Solutions

### Next Greater Element I

- **Problem:** Next Greater Element I  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/next-greater-element-i/submissions/2098670102)

#### Code
```java
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            int t = 0;
            int b = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == a) {
                    b = j;
                } else if (nums2[j] > a && j > b && b != -1) {
                    t = nums2[j];
                    break;
                }
            }
            if (t == 0) {
                ans[i] = -1;
            } else {
                ans[i] = t;
            }
        }
        return ans;
    }
}
```
