## LeetCode Solutions

### Divisor Game

- **Problem:** Divisor Game 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/divisor-game/submissions/2004602263)

#### Code
##### My First Approach
```java
class Solution {
    public boolean divisorGame(int n) {
        int i = 1;
        int count = 0;
        while (i < n && n > 1) {
            if (n % i == 0) {
                n = n - i;
                count++;
                i = 1;
            } else {
                i++;
            }

        }
        if (count % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
```
##### My Second Approach
```java
class Solution {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
```
