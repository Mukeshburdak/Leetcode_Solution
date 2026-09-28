## LeetCode Solutions

### Maximum Nesting Depth of the Parentheses

- **Problem:** Maximum Nesting Depth of the Parentheses 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/2156322303)

#### Code
```java
class Solution {
    public int maxDepth(String s) {
        int k = 0;
        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                k++;
            } else if (ch == ')') {
                j++;
            }
            if (max < k - j) {
                max = k - j;
            }
        }
        return max;
    }
}
```
