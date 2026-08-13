## LeetCode Solutions

### Check If Two String Arrays are Equivalent

- **Problem:** Check If Two String Arrays are Equivalent
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/2105451320)

#### Code
```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        for (String i : word1) {
            a.append(i);
        }
        StringBuilder b = new StringBuilder();
        for (String i : word2) {
            b.append(i);
        }
        if (a.toString().equals(b.toString())) {
            return true;
        }
        return false;
    }
}
```
