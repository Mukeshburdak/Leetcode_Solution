## LeetCode Solutions

### Reverse Bits

- **Problem:** Reverse Bits  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/submissions/detail/1951090761/)

#### Code
```java
class Solution {
    public int reverseBits(int n) {
        List<Integer> val = new ArrayList<>();

        for (int i = 0; i < 32; i++) {
            int rem = n % 2;
            if (rem < 0) rem += 2;
            val.add(rem);
            n = n / 2;
        }

        int sum = 0;
        for (int i = 0; i < 32; i++) {
            sum += val.get(i) * (int)Math.pow(2, 31 - i);
        }

        return sum;
    }
}
```
