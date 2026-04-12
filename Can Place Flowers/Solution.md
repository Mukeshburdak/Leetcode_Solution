## LeetCode Solutions

### Can Place Flowers

- **Problem:** Can Place Flowers
- **Platform:** LeetCode  
- **Language:** Java 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/can-place-flowers/solutions/7877348/can-place-flower-java-solution-greedily-ay40t)

#### Code
```java
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;
        int len = flowerbed.length;
        int i = 1;
        int j = 0;
        if (len == 1) {
            return flowerbed[0] == 0 && n <= 1;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            j++;
        }

        while (i < len - 1 && j < n) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                j++;
            }
            i++;
        }

        if (flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0 && j < n) {
            flowerbed[len - 1] = 1;
            j++;
        }
        return j >= n;
    }
}
```
