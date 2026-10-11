## LeetCode Solutions

### Number of Steps to Reduce a Number to Zero

- **Problem:** Number of Steps to Reduce a Number to Zero  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/2168925444)

#### Code
```java
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }
}
```
