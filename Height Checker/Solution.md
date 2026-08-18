## LeetCode Solutions

### Height Checker

- **Problem:** Height Checker  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/height-checker/submissions/2111817854)

#### Code
```java
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}
```
