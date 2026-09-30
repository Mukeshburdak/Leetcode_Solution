## LeetCode Solutions

### Remove All Adjacent Duplicates In String

- **Problem:** Remove All Adjacent Duplicates In String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/2158095483)

#### Code
```java
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char b = s.charAt(i);
            if (!st.isEmpty() && st.peek() == b) {
                st.pop();
            } else {
                st.push(b);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
```
