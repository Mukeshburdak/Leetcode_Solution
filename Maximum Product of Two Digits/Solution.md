## LeetCode Solutions

### Maximum Product of Two Digits

- **Problem:** Maximum Product of Two Digits 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-product-of-two-digits/submissions/2080224325)

#### Code
```java
class Solution {
    public int maxProduct(int n) {
        List<Integer> a = new ArrayList<>();
        while (n > 0) {
            a.add(n % 10);
            n /= 10;
        }
        Collections.sort(a);
        int m = a.size() - 1;
        return a.get(m) * a.get(m - 1);
    }
}
```
