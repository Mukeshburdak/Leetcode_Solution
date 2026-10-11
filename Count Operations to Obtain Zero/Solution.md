## LeetCode Solutions

### Count Operations to Obtain Zero

- **Problem:** Count Operations to Obtain Zero 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-operations-to-obtain-zero/submissions/2168929350)

#### Code
```java
class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            count++;
        }
        return count;
    }
}
```
