## LeetCode Solutions

### Pascal's Triangle II

- **Problem:** Pascal's Triangle II
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/pascals-triangle-ii/submissions/2097478572)

#### Code
```java
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr.add(1);
                } else {
                    arr.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(arr);
        }
        return ans.get(rowIndex);
    }
}
```
