## LeetCode Solutions

### Minimum Add to Make Parentheses Valid

- **Problem:** Minimum Add to Make Parentheses Valid 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/submissions/2164200713)

#### Code
```java
class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    count++;
                } else {
                    st.pop();
                }
            }
        }
        int a = st.size();
        return a + count;
    }
}
```
