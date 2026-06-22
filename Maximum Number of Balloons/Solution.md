## LeetCode Solutions

### Maximum Number of Balloons

- **Problem:** Maximum Number of Balloons 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-number-of-balloons/submissions/2042382967)

#### Code
```java
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                arr[0]++;
            } else if (ch == 'a') {
                arr[1]++;
            } else if (ch == 'l') {
                arr[2]++;
            } else if (ch == 'o') {
                arr[3]++;
            } else if (ch == 'n') {
                arr[4]++;
            }
        }
        arr[2] = arr[2] / 2;
        arr[3] = arr[3] / 2;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
```
