## LeetCode Solutions

### Check If All 1's Are at Least Length K Places Away

- **Problem:** Check If All 1's Are at Least Length K Places Away
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/submissions/2114613872)

#### Code
```java
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                break;
            }
            i++;
        }
        i++;
        while (i < nums.length) {
            if (nums[i] == 0) {
                j++;
            } else {
                if (j < k) {
                    return false;
                } else {
                    j = 0;
                }
            }
            i++;
        }
        return true;
    }
}
```
