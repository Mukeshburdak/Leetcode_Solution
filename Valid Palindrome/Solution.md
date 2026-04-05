## LeetCode Solutions

### Valid Palindrome

- **Problem:** Valid Palindrome  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/submissions/detail/1969448190/)

#### Code
```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int last = s.length() - 1;
        int first = 0;

        while (first <= last) {
            if (s.charAt(first) != s.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
