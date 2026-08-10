## LeetCode Solutions

### Add to Array-Form of Integer

- **Problem:** Add to Array-Form of Integer
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/add-to-array-form-of-integer/submissions/2101782043)

#### Code
```java
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int a = num[i];
            int t = num[i] + k % 10 + carry;
            carry = t / 10;
            t = t % 10;
            ans.add(t);
            k /= 10;
        }
        while (k > 0) {
            int t = k % 10 + carry;
            carry = t / 10;
            t = t % 10;
            ans.add(t);
            k /= 10;
        }
        if (carry > 0) {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;

    }
}
```
