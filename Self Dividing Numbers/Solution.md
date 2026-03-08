## LeetCode Solutions

### Self Dividing Numbers

- **Problem:** Self Dividing Numbers  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/self-dividing-numbers/solutions/7633928/self-dividing-numbers-intuition-approach-8264)

#### Code
```java
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = left; i <= right; i++) {
            int div = i;
            boolean valid = true;

            while (div != 0) {
                int rem = div % 10;

                if (rem == 0 || i % rem != 0) {
                    valid = false;
                    break;
                }

                div = div / 10;
            }

            if (valid) {
                a.add(i);
            }
        }

        return a;
    }
}
```
