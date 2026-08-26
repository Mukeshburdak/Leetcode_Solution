## LeetCode Solutions

### Last Stone Weight

- **Problem:** Last Stone Weight
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/last-stone-weight/submissions/2120999904)

#### Code
```java
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        while (n > 1) {
            Arrays.sort(stones);

            int x = stones[n - 2];
            int y = stones[n - 1];

            if (x == y) {
                n -= 2;
            } else {
                stones[n - 2] = y - x;
                n--;
            }
        }

        return n == 0 ? 0 : stones[0];
    }
}
```
