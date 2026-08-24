## LeetCode Solutions

### Check if Any Element Has Prime Frequency

- **Problem:** Check if Any Element Has Prime Frequency
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-any-element-has-prime-frequency/submissions/2118322504)

#### Code
```java
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                return true;
            }
        }
        return false;

    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
```
