## LeetCode Solutions

### Nim Game

- **Problem:** Nim Game  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/nim-game/submissions/2037809843)

#### Code
```java
class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        else{
            return true;
        }
    }
}
```
