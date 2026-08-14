## LeetCode Solutions

### Distribute Candies

- **Problem:** Distribute Candies
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/distribute-candies/submissions/2106797384)

#### Code
```java
class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length / 2;
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < n * 2; i++) {
            ans.add(candyType[i]);
        }
        int m = ans.size();
        if (m > n)
            return n;
        return m;
    }
}
```
