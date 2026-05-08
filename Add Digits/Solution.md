## LeetCode Solutions

### Add Digits

- **Problem:** Add Digits  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/add-digits/submissions/1998120525)

#### Code
```java
class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        if (sum < 10)
            return sum;
        else
            return addDigits(sum);
    }
}
```
