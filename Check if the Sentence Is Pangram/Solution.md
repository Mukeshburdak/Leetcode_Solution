## LeetCode Solutions

### Check if the Sentence Is Pangram

- **Problem:** Check if the Sentence Is Pangram
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/2115182400)

#### Code
```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            int a = sentence.charAt(i) - 'a';
            arr[a] = 1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum == 26;
    }
}
```
