## LeetCode Solutions

### Check if Numbers Are Ascending in a Sentence

- **Problem:** Check if Numbers Are Ascending in a Sentence
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/submissions/2110122268)

#### Code
```java
class Solution {
    public boolean areNumbersAscending(String s) {
        int max = 0;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("\\d+")) {
                int temp = Integer.valueOf(words[i]);
                if (max < temp) {
                    max = temp;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
```
