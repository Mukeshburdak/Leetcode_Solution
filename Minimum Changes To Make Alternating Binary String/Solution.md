## LeetCode Solutions

### Minimum Operations to Make the Binary String Alternating

- **Problem:** Minimum Operations to Make the Binary String Alternating  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/solutions/7632828/minimum-operations-to-make-binary-string-e2zc)

#### Code
```java
class Solution {
    public int minOperations(String s) {
        int carry = 0;
        int carry1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '0' && i % 2 != 0) || 
                (s.charAt(i) == '1' && i % 2 == 0)) {
                carry += 1;
            }

            if ((s.charAt(i) == '1' && i % 2 != 0) || 
                (s.charAt(i) == '0' && i % 2 == 0)) {
                carry1 += 1;
            }
        }

        if (carry > carry1) {
            return carry1;
        }

        return carry;
    }
}
```
