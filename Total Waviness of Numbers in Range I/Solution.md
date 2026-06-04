## LeetCode Solutions

### Total Waviness of Numbers in Range I

- **Problem:** Total Waviness of Numbers in Range I  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/solutions/8312591/count-total-waviness-in-a-range-brutefor-xdxh)

#### Code
```java
class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            int j = i;
            List<Integer> l = new ArrayList<>();
            if (j < 100) {
                continue;
            }
            while (j > 0) {
                l.add(j % 10);
                j /= 10;
            }
            for (int k = 1; k < l.size() - 1; k++) {
                if (l.get(k - 1) < l.get(k) && l.get(k) > l.get(k + 1)) {
                    count++;
                } else if (l.get(k - 1) > l.get(k) && l.get(k) < l.get(k + 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}
