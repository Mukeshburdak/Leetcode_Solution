## LeetCode Solutions

### Check if Word Equals Summation of Two Words

- **Problem:** Check if Word Equals Summation of Two Words
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/submissions/2118507394)

#### Code
```java
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a = Check(firstWord, firstWord.length());
        int b = Check(secondWord, secondWord.length());
        int c = Check(targetWord, targetWord.length());
        if (c == b + a) {
            return true;
        }
        return false;
    }

    public int Check(String s, int n) {
        int num = 0;
        for (int i = n - 1; i >= 0; i--) {
            int t = s.charAt(i) - 'a';
            num += (int) Math.pow(10, n - 1 - i) * t;
        }
        return num;
    }
}
```
