## LeetCode Solutions

### Digit Frequency Score

- **Problem:** Digit Frequency Score
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/digit-frequency-score/submissions/2205269262)

#### Code
```java
class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            int rem = n % 10;
            freq[rem]++;
            n /= 10;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * freq[i];
        }
        return sum;
    }
}
```
