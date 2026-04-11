## LeetCode Solutions

### Maximum Average Subarray I

- **Problem:** Maximum Average Subarray I
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/solutions/7865938/maximum-average-subarray-i-c-sliding-win-hrpu)

#### Code
```c
double findMaxAverage(int* nums, int numsSize, int k) {
    double max = 0;
    int i = 0;
    double sum = 0;
    while (i < k) {
        sum += nums[i];
        i++;
    }
    max = sum / k;
    while (i < numsSize) {
        sum += nums[i] - nums[i - k];
        if (sum / k > max) {
            max = sum / k;
        }
        i++;
    }
    return max;
}
```
