## LeetCode Solutions

### Baseball Game

- **Problem:** Baseball Game
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/baseball-game/submissions/2153494851)

#### Code
```java
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String c = operations[i];

            if (c.equals("+")) {
                int m = s.peek();
                s.pop();
                int n = s.peek();
                s.push(m);
                s.push(n + m);
            } else if (c.equals("D")) {
                int t = s.peek();
                s.push(t * 2);
            } else if (c.equals("C")) {
                s.pop();
            } else {
                int t = Integer.parseInt(c);
                s.push(t);
            }
        }
        int sum = 0;
        while (!s.empty()) {
            sum += s.peek();
            s.pop();
        }
        return sum;
    }
}
```
