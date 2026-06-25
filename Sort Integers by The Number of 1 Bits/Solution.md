## LeetCode Solutions

### Sort Integers by The Number of 1 Bits

- **Problem:** Sort Integers by The Number of 1 Bits  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/2046054596)

#### Code
```java
class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int count = 0;
            while (a > 0) {
                if (a % 2 == 1) {
                    count++;
                }
                a /= 2;
            }
            res[i] = count;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (res[i] > res[j] ||
                        (res[i] == res[j] && arr[i] > arr[j])) {
                    int temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
```
