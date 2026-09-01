## LeetCode Solutions

### Count Pairs Whose Sum is Less than Target

- **Problem:** Count Pairs Whose Sum is Less than Target
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/submissions/2127416455)

#### Code
```java
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int a = nums.get(i);
                int b = nums.get(j);
                if (a + b < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
```
