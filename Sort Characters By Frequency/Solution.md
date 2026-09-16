## LeetCode Solutions

### Sort Characters By Frequency

- **Problem:** Sort Characters By Frequency 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sort-characters-by-frequency/submissions/2143499716)

#### Code
```java
class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[123];
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i);
            arr[n]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = s.length(); j > 0; j--) {
            for (int i = 0; i < 123; i++) {
                if (arr[i] == j) {
                    char ch = (char) i;
                    int n = arr[i];

                    while (n > 0) {
                        sb.append(ch);
                        n--;
                    }

                    arr[i] = 0;
                }
            }
        }
        return sb.toString();
    }
}
```
