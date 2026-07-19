## LeetCode Solutions

### Cells in a Range on an Excel Sheet

- **Problem:** Cells in a Range on an Excel Sheet
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/submissions/2073110169)

#### Code
```java
class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        char a = s.charAt(0);
        char b = s.charAt(3);
        int m = (int) s.charAt(1);
        int n = (int) s.charAt(4);
        StringBuilder sb = new StringBuilder();
        for (char i = a; i <= b; i++) {
            for (int j = m; j <= n; j++) {
                sb.setLength(0);
                sb.append((char) i).append((char) j);
                ans.add(sb.toString());
            }
        }
        return ans;
    }
}
```
