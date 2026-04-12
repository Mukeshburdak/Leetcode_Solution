## LeetCode Solutions

### Kids With the Greatest Number of Candies

- **Problem:** Kids With the Greatest Number of Candies
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/7877139/kids-with-the-greatest-number-of-candies-8y3f)

#### Code
```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i] + extraCandies;
            if (temp < max) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }
}
```
