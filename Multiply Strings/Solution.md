## LeetCode Solutions

### Multiply Strings

- **Problem:** Multiply Strings
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/multiply-strings/submissions/2130262514)

#### Code
```java
class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] arr = new int[m + n];
        for (int j = n - 1; j >= 0; j--) {
            int b = num2.charAt(j) - '0';
            for (int i = m - 1; i >= 0; i--) {
                int a = num1.charAt(i) - '0';
                int t = a * b;
                int sum = t + arr[i + j + 1];
                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
```
