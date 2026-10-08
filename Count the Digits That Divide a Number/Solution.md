## LeetCode Solutions

### Count the Digits That Divide a Number

- **Problem:**  Count the Digits That Divide a Number
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-the-digits-that-divide-a-number/submissions/2166480031)

#### Code
```java
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int n = num;
        while (n > 0) {
            int t = n % 10;
            if (num % t == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
```
