## LeetCode Solutions

### Two Furthest Houses With Different Colors

- **Problem:** Two Furthest Houses With Different Colors  
- **Platform:** LeetCode  
- **Language:** C
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/two-furthest-houses-with-different-colors/submissions/1983563831)

#### Code
```c
int maxDistance(int* colors, int colorsSize) {
    int max = 0;
    for (int i = 0; i < colorsSize; i++) {
        for (int j = i + 1; j < colorsSize; j++) {
            if (colors[i] != colors[j]) {
                int temp = j - i;
                if (max < temp) {
                    max = temp;
                }
            }
        }
    }
    return max;
}
```
