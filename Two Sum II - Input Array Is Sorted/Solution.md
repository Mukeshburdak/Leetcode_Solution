## LeetCode Solutions

### Two Sum II - Input Array Is Sorted

- **Problem:** Two Sum II - Input Array Is Sorted
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/2138520076)

#### Code
```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length - 1;
        int i = 0;
        int[] ans = new int[2];
        while (i < n) {
            int temp = numbers[i] + numbers[n];
            if (temp == target) {
                ans[0] = i + 1;
                ans[1] = n + 1;
                return ans;
            } else if (temp < target) {
                i++;
            } else {
                n--;
            }
        }
        return ans;
    }
}
```
