## LeetCode Solutions

### Maximum Score After Splitting a String

- **Problem:** Maximum Score After Splitting a String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-score-after-splitting-a-string/submissions/2127393221)

#### Code
```java
class Solution {
    public int maxScore(String s) {
        int left = 0;
        int right = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                right++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                left++;
            } else {
                right--;
            }
            if (sum < left + right) {
                sum = left + right;
            }
        }
        return sum;
    }
}
```
