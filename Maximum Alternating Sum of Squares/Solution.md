## LeetCode Solutions

### Maximum Alternating Sum of Squares

- **Problem:** Maximum Alternating Sum of Squares 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-alternating-sum-of-squares/submissions/2171172856)

#### Code
```java
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum += (arr[n - i - 1] - arr[i]);
        }
        if (n % 2 == 0) {
            return sum;
        }
        return sum + arr[n / 2];
    }
}
```
