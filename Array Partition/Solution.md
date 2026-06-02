## LeetCode Solutions

### Array Partition

- **Problem:** Array Partition  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/array-partition/submissions/2019706253)

#### Code
```java
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        int sum = 0;
        while (i < nums.length) {
            sum += min(nums[i-1],nums[i]);
            i = i + 2;
        }
        return sum;
    }

    int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
}
```
