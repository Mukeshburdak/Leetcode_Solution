## LeetCode Solutions

### Reverse Vowels of a String

- **Problem:** Reverse Vowels of a String  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/solutions/7688148/reverse-vowels-of-a-string-java-two-poin-cd88)

#### Code
```java
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        char[] arr = s.toCharArray();
        int j = s.length() - 1;

        while (i < j) {
            char ch = arr[i];

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                    || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                while (j > i) {
                    char c = arr[j];

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                            || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }

        s = new String(arr);
        return s;
    }
}
