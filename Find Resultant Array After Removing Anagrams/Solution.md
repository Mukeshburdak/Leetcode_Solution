## LeetCode Solutions

### Find Resultant Array After Removing Anagrams

- **Problem:** Find Resultant Array After Removing Anagrams
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/submissions/2123445177)

#### Code
```java
class Solution {
    public List<String> removeAnagrams(String[] words) {
        Set<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            char[] a = word.toCharArray();
            Arrays.sort(a);
            String sword = new String(a);
            if (!set.contains(sword)) {
                ans.add(word);
                set.clear();
                set.add(sword);
            }
        }
        return ans;
    }
}
```
