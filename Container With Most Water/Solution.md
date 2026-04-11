## LeetCode Solutions

### Container With Most Water

- **Problem:** Container With Most Water
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/container-with-most-water/solutions/7865428/container-with-most-water-two-pointer-op-dd46)

#### Code
```c
int maxArea(int* height, int heightSize) {
    int left, right;
    int i = 0, j = heightSize - 1;
    int max = 0;
    while (i < j) {
        left = height[i];
        right = height[j];
        int temp;
        if (left < right) {
            temp = left * (j - i);
            i++;
        } else {
            temp = right * (j - i);
            j--;
        }
        if (max < temp) {
            max = temp;
        }
    }
    return max;
}
