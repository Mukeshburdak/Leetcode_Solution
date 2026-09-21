## LeetCode Solutions

### Day of the Year

- **Problem:** Day of the Year
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/day-of-the-year/submissions/2148835611)

#### Code
```java
class Solution {
    public int dayOfYear(String date) {
        int count = 0;
        int[] arr = new int[12];
        arr[0] = 31;
        arr[1] = 28;
        arr[2] = 31;
        arr[3] = 30;
        arr[4] = 31;
        arr[5] = 30;
        arr[6] = 31;
        arr[7] = 31;
        arr[8] = 30;
        arr[9] = 31;
        arr[10] = 30;
        arr[11] = 31;
        int a = 0;
        for (int i = 0; i < 4; i++) {
            a += Math.pow(10, 3 - i) * (date.charAt(i) - '0');
        }
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            arr[1]++;
        }
        a = 10 * (date.charAt(5) - '0') + (date.charAt(6) - '0');
        int b = 10 * (date.charAt(8) - '0') + (date.charAt(9) - '0');

        for (int i = 0; i < a - 1; i++) {
            count += arr[i];
        }
        count += b;
        return count;
    }
}
```
