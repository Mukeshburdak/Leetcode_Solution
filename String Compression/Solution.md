## LeetCode Solutions

### String Compression

- **Problem:** String Compression
- **Platform:** LeetCode  
- **Language:** Java 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/string-compression/submissions/1973589621)

#### Code
```java
class Solution {
    public int compress(char[] chars) {
        int count = 1;
        List<Character> temp = new ArrayList<>();
        temp.add(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        temp.add(c);
                    }
                }
                temp.add(chars[i]);
                count = 1;
            }
        }

        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                temp.add(c);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            chars[i] = temp.get(i);
        }

        return temp.size();
    }
}
```
