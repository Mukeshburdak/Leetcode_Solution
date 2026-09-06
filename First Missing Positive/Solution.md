## LeetCode Solutions

### First Missing Positive

- **Problem:** First Missing Positive
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](hhttps://leetcode.com/problems/first-missing-positive/submissions/2132826367)

#### Code
```java
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 1;
        int[] positive = Arrays.stream(nums).filter(n -> n > 0).toArray();
        Arrays.sort(positive);
        for (int n : positive) {
            if (i == n) {
                i++;
            } else if (n > i) {
                return i;
            }
        }
        return i;
    }
}
```
