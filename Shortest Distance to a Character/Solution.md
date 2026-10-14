## LeetCode Solutions

### Shortest Distance to a Character

- **Problem:** Shortest Distance to a Character
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/shortest-distance-to-a-character/submissions/2172097566)

#### Code
```java
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = n - 1;
            int temp = Integer.MAX_VALUE;
            while (j <= k) {
                char ch = s.charAt(j);
                char t = s.charAt(k);
                if (ch == c) {
                    int p = Math.abs(i - j);
                    if (temp > p) {
                        arr[i] = p;
                        temp = p;
                    }
                }
                if (t == c) {
                    int p = Math.abs(i - k);
                    if (temp > p) {
                        arr[i] = p;
                        temp = p;
                    }
                }
                j++;
                k--;
            }
        }
        return arr;
    }
}
```
