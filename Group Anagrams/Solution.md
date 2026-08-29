## LeetCode Solutions

### Group Anagrams

- **Problem:** Group Anagrams
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/group-anagrams/submissions/2123434848)

#### Code
```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] a = word.toCharArray();
            Arrays.sort(a);
            String sword = new String(a);
            if (!map.containsKey(sword)) {
                map.put(sword, new ArrayList<>());
            }
            map.get(sword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
```
