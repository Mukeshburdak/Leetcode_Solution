## LeetCode Solutions

### Sum of Digits in Base K

- **Problem:** Sum of Digits in Base K 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-digits-in-base-k/submissions/2160328135)

#### Code
```java
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        List<Integer> l = new ArrayList<>();
        while (n > 0) {
            int t = n % k;
            l.add(t);
            n /= k;
        }
        int i = 0;
        while (l.size() > i) {
            sum += l.get(i);
            i++;
        }
        return sum;
    }
}
```
