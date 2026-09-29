## LeetCode Solutions

### Apply Operations to an Array

- **Problem:** Apply Operations to an Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/apply-operations-to-an-array/submissions/2157443147)

#### Code
```java
class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i - 1];
            int b = nums[i];
            if (a == b) {
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
        }
        List<Integer> s = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                s.add(nums[i]);
            } else {
                count++;
            }
        }
        while (count > 0) {
            s.add(0);
            count--;
        }
        int[] array = s.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
```
