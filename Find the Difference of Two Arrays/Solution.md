## LeetCode Solutions

### Find the Difference of Two Arrays

- **Problem:** Find the Difference of Two Arrays
- **Platform:** LeetCode  
- **Language:** C
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-difference-of-two-arrays/submissions/1987906078)

#### Code
```c
/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume
 * caller calls free().
 */
int** findDifference(int* nums1, int nums1Size, int* nums2, int nums2Size,
                     int* returnSize, int** returnColumnSizes) {

    int** result = (int**)malloc(2 * sizeof(int*));

    *returnColumnSizes = (int*)malloc(2 * sizeof(int));

    *returnSize = 2;
    (*returnColumnSizes)[0] = 0;
    (*returnColumnSizes)[1] = 0;

    result[0] = (int*)malloc(nums1Size * sizeof(int));
    result[1] = (int*)malloc(nums2Size * sizeof(int));

    for (int i = 0; i < nums1Size; i++) {
        int res = false;
        for (int j = 0; j < nums2Size; j++) {
            if (nums1[i] == nums2[j]) {
                res = true;
                break;
            }
        }
        int already = false;
        for (int k = 0; k < (*returnColumnSizes)[0]; k++) {
            if (result[0][k] == nums1[i]) {
                already = true;
                break;
            }
        }

        if (!res && !already) {
            result[0][(*returnColumnSizes)[0]] = nums1[i];
            (*returnColumnSizes)[0]++;
        }
    }
    for (int i = 0; i < nums2Size; i++) {
        int res = false;
        for (int j = 0; j < nums1Size; j++) {
            if (nums2[i] == nums1[j]) {
                res = true;
                break;
            }
        }
        int already = false;
        for (int k = 0; k < (*returnColumnSizes)[1]; k++) {
            if (result[1][k] == nums2[i]) {
                already = true;
                break;
            }
        }

        if (!res && !already) {
            result[1][(*returnColumnSizes)[1]] = nums2[i];
            (*returnColumnSizes)[1]++;
        }
    }
    return result;
}
```
