## LeetCode Solutions

### Resulting String After Adjacent Removals

- **Problem:** Resulting String After Adjacent Removals
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/resulting-string-after-adjacent-removals/submissions/2151233635)

#### Code
```java
class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (!st.isEmpty()) {
                char b = st.peek();
                if (Math.abs(a - b) == 1 || Math.abs(a - b) == 25) {
                    st.pop();
                    continue;
                }
            }
            st.push(a);
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
```
