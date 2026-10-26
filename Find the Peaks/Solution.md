## LeetCode Solutions

### Find the Peaks

- **Problem:** Find the Peaks 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-peaks/submissions/2182286597)

#### Code
```java
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            int a = mountain[i - 1];
            int b = mountain[i];
            int c = mountain[i + 1];
            if (a < b && b > c) {
                l.add(i);
            }
        }
        return l;
    }
}
```
