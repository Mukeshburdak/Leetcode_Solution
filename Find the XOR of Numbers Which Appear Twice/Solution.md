## LeetCode Solutions

### Find the XOR of Numbers Which Appear Twice

- **Problem:** Find the XOR of Numbers Which Appear Twice  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/solutions/8104762/duplicate-numbers-xor-java-solution-by-m-c3hg)

#### Code
```java
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int result = 0;
        while (i < nums.length-1) {
            int j = i + 1;
            if (nums[i] == nums[j]) {
                result = result ^ nums[i];
            }
            i++;
        }
        return result;
    }
}
```
