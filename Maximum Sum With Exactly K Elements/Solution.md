## LeetCode Solutions

### Maximum Sum With Exactly K Elements 

- **Problem:** Maximum Sum With Exactly K Elements 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/submissions/2181550661)

#### Code
```java
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = nums[nums.length - 1];
        sum = k * (sum + sum + k - 1) / 2;
        return sum;
    }
}
```
