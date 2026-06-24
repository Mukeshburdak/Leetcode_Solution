## LeetCode Solutions

### Maximum Number of Balls in a Box

- **Problem:** Maximum Number of Balls in a Box 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-number-of-balls-in-a-box/submissions/2044670040)

#### Code
```java
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int j = lowLimit;
        while (j <= highLimit) {
            int sum = 0;
            int i = j;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            arr[sum]++;
            j++;
        }
        int max = 0;
        for (int i = 0; i < 46; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
```
