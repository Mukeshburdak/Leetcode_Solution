## LeetCode Solutions

### Three Divisors

- **Problem:** Three Divisors 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/three-divisors/submissions/2053609475)

#### Code
```java
class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 ) {
                count++;
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }
}
```
