## LeetCode Solutions

### Uncommon Words from Two Sentences

- **Problem:** Uncommon Words from Two Sentences
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/uncommon-words-from-two-sentences/submissions/2123457235)

#### Code
```java
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s3 = s1 + " " + s2;
        String[] words = s3.split(" ");
        List<String> l = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        map.forEach((key, value) -> {
            if (value == 1) {
                l.add(key);
            }
        });
        return l.toArray(String[]::new);
    }
}
```
