## LeetCode Solutions

### Check Balanced String

- **Problem:** Check Balanced String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-balanced-string/submissions/2104250046)

#### Code
```java
class Solution {
    public boolean isBalanced(String num) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < num.length(); i++) {
            int temp = num.charAt(i) - '0';
            if (i % 2 == 0) {
                evenSum += temp;
            } else {
                oddSum += temp;
            }
        }
        return oddSum == evenSum;
    }
}
```
