## LeetCode Solutions

### Mean of Array After Removing Some Elements

- **Problem:** Mean of Array After Removing Some Elements
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/mean-of-array-after-removing-some-elements/submissions/2159316860)

#### Code
```java
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int a = n * 1 / 20;
        int b = n - a;
        double sum = 0;
        for (int i = a; i < b; i++) {
            sum += arr[i];
        }
        return sum / (n - 2 * a);
    }
}
```
