## LeetCode Solutions

### Average Salary Excluding the Minimum and Maximum Salary

- **Problem:** Average Salary Excluding the Minimum and Maximum Salary
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/2194996766)

#### Code
```java
class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = salary.length;
        for (int i = 0; i < n; i++) {
            sum += salary[i];
            if (min > salary[i]) {
                min = salary[i];
            }
            if (max < salary[i]) {
                max = salary[i];
            }
        }
        return (double) (sum - min - max) / (double) (n - 2);
    }
}
```
