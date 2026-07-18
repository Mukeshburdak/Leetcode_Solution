## LeetCode Solutions

### Valid Parentheses

- **Problem:** Valid Parentheses
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/valid-parentheses/submissions/2072529771)

#### Code
```java
class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                if ((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{')
                        || (ch == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
```
