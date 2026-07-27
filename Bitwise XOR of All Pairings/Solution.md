## LeetCode Solutions

### Bitwise XOR of All Pairings

- **Problem:** Bitwise XOR of All Pairings
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/bitwise-xor-of-all-pairings/submissions/2083729027)

#### Code
```java
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ans = 0;
        if (n % 2 == 1) {
            for (int num : nums1) {
                ans ^= num;
            }
        }
        if (m % 2 == 1) {
            for (int num : nums2) {
                ans ^= num;
            }
        }
        return ans;
    }
}
```
