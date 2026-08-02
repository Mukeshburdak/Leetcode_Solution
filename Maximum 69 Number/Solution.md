## LeetCode Solutions

### Maximum 69 Number

- **Problem:** Maximum 69 Number 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-69-number/submissions/2091595861)

#### Code
```java
class Solution {
    public int maximum69Number(int num) {
        int n = num;
        int len = (int) Math.log10(num) + 1;
        int[] digits = new int[len];
        int l = len - 1;
        while (n > 0) {
            digits[l] = n % 10;
            n /= 10;
            l--;
        }
        for (int i = 0; i < len; i++) {
            if (digits[0] == 6) {
                digits[0] = 9;
                break;
            } else if (digits[i] == 9) {
                continue;
            } else {
                digits[i] = 9;
                break;
            }
        }
        int result = 0;

        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }
}
```
