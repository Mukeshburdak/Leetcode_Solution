## LeetCode Solutions

### Number Complement

- **Problem:** Number Complement  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/complement-of-base-10-integer/solutions/7641374/number-complement-java-easy-solution-olo-atzd)

#### Code
```java
class Solution {
    public int bitwiseComplement(int n) {
        List<Integer> arr = new ArrayList<>();
        int rem = 0;
        int sum = 0;

        if (n == 0) {
            return 1;
        }

        while (n != 0) {
            rem = n % 2;
            arr.add(rem);
            n /= 2;
        }

        arr.reversed();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                arr.set(i, 0);
            } else {
                arr.set(i, 1);
            }

            sum += (Math.pow(2, i) * arr.get(i));
        }

        return sum;
    }
}
```
