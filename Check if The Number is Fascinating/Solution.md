## LeetCode Solutions

### Check if The Number is Fascinating

- **Problem:** Check if The Number is Fascinating 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-the-number-is-fascinating/submissions/2112657108)

#### Code
```java
class Solution {
    public boolean isFascinating(int n) {
        int a = 2 * n;
        int b = 3 * n;
        String s = n + "" + a + "" + b;
        Set<Integer> temp = new HashSet<>();
        for (int i = 1; i < 10; i++) {
            String c = "" + i;
            if (!s.contains(c)) {
                return false;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - '0';
            if (!temp.add(j)) {
                return false;
            }
        }
        return true;
    }
}
```
