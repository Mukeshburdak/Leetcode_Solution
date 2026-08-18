## LeetCode Solutions

### Largest 3-Same-Digit Number in String

- **Problem:** Largest 3-Same-Digit Number in String
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/largest-3-same-digit-number-in-string/submissions/2111776934)

#### Code
```java
class Solution {
    public String largestGoodInteger(String num) {
        String[] arr = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
        for (int i = 0; i < 10; i++) {
            if (num.contains(arr[i]))
                return arr[i];
        }
        return "";
    }
}
```
