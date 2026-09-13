## LeetCode Solutions

### Find All Anagrams in a String

- **Problem:** Find All Anagrams in a String
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/submissions/2140276295)

#### Code
```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> ans = new ArrayList<>();
        char[] b = p.toCharArray();
        Arrays.sort(b);
        for (int i = 0; i < n - m + 1; i++) {
            String t = s.substring(i, m + i);
            char[] a = t.toCharArray();
            Arrays.sort(a);
            if (Arrays.equals(a, b)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
```
