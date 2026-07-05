## LeetCode Solutions

### Sum of Primes Between Number and Its Reverse

- **Problem:** Sum of Primes Between Number and Its Reverse 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/submissions/2056506132)

#### Code
```java
class Solution {
    public int sumOfPrimesInRange(int n) {
        int i = n;
        String s = "";
        while (i > 0) {
            int rem = i % 10;
            s += rem;
            i /= 10;
        }

        int r = Integer.valueOf(s);
        int sum = 0;
        if (n > r) {
            i = r;
            r = n;
        } else {
            i = n;
        }
        while (i <= r) {
            if (isPrime(i)) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
```
