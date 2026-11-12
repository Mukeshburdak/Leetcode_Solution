## LeetCode Solutions

### Points That Intersect With Cars

- **Problem:** Points That Intersect With Cars
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/points-that-intersect-with-cars/submissions/2194355704)

#### Code
```java
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i).get(0);
            int t = nums.get(i).get(1);
            for (int j = a; j <= t; j++) {
                st.add(j);
            }
        }
        return st.size();
    }
}
```
