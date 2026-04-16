## LeetCode Solutions

### Maximum Number of Vowels in a Substring of Given Length

- **Problem:** Maximum Number of Vowels in a Substring of Given Length
- **Platform:** LeetCode  
- **Language:** Java 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/submissions/1980080416)

#### Code
```java
class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int max = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            if (isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
```
