## LeetCode Solutions

### Rank Transform of an Array

- **Problem:** Rank Transform of an Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/rank-transform-of-an-array/submissions/2064593669)

#### Code
```java
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> ans = new HashMap<>();
        int[] temp = Arrays.copyOf(arr, n);

        Arrays.sort(temp);
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && temp[i - 1] < temp[i]) {
                rank++;
            }
            ans.put(temp[i], rank);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans.get(arr[i]);
        }
        return arr;
    }
}
```
