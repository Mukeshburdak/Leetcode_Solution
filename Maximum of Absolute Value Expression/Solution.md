## LeetCode Solutions

### Maximum of Absolute Value Expression

- **Problem:** Maximum of Absolute Value Expression
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-of-absolute-value-expression/submissions/2204707608)

#### Code
```java
class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        int d = Integer.MIN_VALUE;
        int e = Integer.MAX_VALUE;
        int f = Integer.MIN_VALUE;
        int g = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int t1 = arr1[i] + arr2[i] + i;
            int t2 = arr1[i] + arr2[i] - i;
            int t3 = arr1[i] - arr2[i] + i;
            int t4 = arr1[i] - arr2[i] - i;
            if (t1 < a) {
                a = t1;
            }
            if (b < t1) {
                b = t1;
            }
            if (t2 < c) {
                c = t2;
            }
            if (d < t2) {
                d = t2;
            }
            if (t3 < e) {
                e = t3;
            }
            if (f < t3) {
                f = t3;
            }
            if (t4 < g) {
                g = t4;
            }
            if (h < t4) {
                h = t4;
            }
        }
        int m = Math.max(b - a, d - c);
        int p = Math.max(f - e, h - g);
        int res = Math.max(m, p);
        return res;
    }
}
```
