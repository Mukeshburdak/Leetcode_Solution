## LeetCode Solutions

### Maximum Distance Between a Pair of Values

- **Problem:** Maximum Distance Between a Pair of Values 
- **Platform:** LeetCode  
- **Language:** C
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/submissions/1982735438)

#### Code
```c
int maxDistance(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int i = 0, j = 0;
    while (i < nums1Size && j < nums2Size) {
        if (nums1[i] > nums2[j]) {
            i++;
        }
        j++;
    }

    int max = j - i - 1;
    if (0 < max) {
        return max;
    }
    return 0;
}
```
