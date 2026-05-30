## LeetCode Solutions

### Sum of Digits of String After Convert

- **Problem:** Sum of Digits of String After Convert 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-digits-of-string-after-convert/submissions/2016845815)

#### Code
```java
class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a' + 1;
            if (val < 10) {
                sum += val;
            } else {
                sum += (val / 10) + (val % 10);
            }
        }
        while (k > 1) {
            int i = sum;
            int temp = 0;
            while (i > 0) {
                temp += i % 10;
                i /= 10;
            }
            sum = temp;
            k--;
        }
        return sum;
    }
}
```
