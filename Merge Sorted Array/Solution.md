## LeetCode Solutions

### Merge Sorted Array

- **Problem:** Merge Sorted Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/merge-sorted-array/solutions/7694583/merge-sorted-array-java-bubble-sort-appr-pe7h)

#### Code
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t = m + n;

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i < t - 1; i++) {
            for (int j = 0; j < t - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}
