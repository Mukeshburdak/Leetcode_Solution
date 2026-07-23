## LeetCode Solutions

### Jewels and Stones

- **Problem:** Jewels and Stones 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/jewels-and-stones/submissions/2078678614)

#### Code
```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (jewels.contains(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }
}
```
