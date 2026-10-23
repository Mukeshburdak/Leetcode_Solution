## LeetCode Solutions

### Sum of Even Numbers After Queries

- **Problem:** Sum of Even Numbers After Queries 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-even-numbers-after-queries/submissions/2179416908)

#### Code
```java
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] arr = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            nums[index] += queries[i][0];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    arr[i] += nums[j];
                }
            }
        }
        return arr;
    }
}
```
