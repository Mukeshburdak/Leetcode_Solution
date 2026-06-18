## LeetCode Solutions

### Find the Winning Player in Coin Game

- **Problem:** Find the Winning Player in Coin Game 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-winning-player-in-coin-game/submissions/2037802608)

#### Code
```java
class Solution {
    public String winningPlayer(int x, int y) {
        int count = 0;
        while (x >= 1 && y >= 4) {
            x = x - 1;
            y = y - 4;
            count++;
        }
        if (count % 2 == 0) {
            return "Bob";
        }
        return "Alice";
    }
}
```
