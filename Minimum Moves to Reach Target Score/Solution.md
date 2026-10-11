## LeetCode Solutions

### Minimum Moves to Reach Target Score

- **Problem:** Minimum Moves to Reach Target Score
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-moves-to-reach-target-score/submissions/2168958950)

#### Code
```java
class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count = 0;
        while (target > 1) {
            if (maxDoubles == 0) {
                count += (target - 1);
                break;
            }
            if (target % 2 != 0) {
                target--;
                count++;
            } else {
                target /= 2;
                maxDoubles--;
                count++;
            }
        }
        return count++;
    }
}
```
