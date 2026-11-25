## LeetCode Solutions

### Final Value of Variable After Performing Operations

- **Problem:** Final Value of Variable After Performing Operations
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/2203392525)

#### Code
```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int t = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                t++;
            } else {
                t--;
            }
        }
        return t;
    }
}
```
