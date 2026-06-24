## LeetCode Solutions

### Sum of Unique Elements

- **Problem:** Sum of Unique Elements  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-unique-elements/submissions/2044648207)

#### Code
```java
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (arr[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
```
