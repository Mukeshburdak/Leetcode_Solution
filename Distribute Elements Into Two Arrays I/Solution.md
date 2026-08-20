## LeetCode Solutions

### Distribute Elements Into Two Arrays I

- **Problem:** Distribute Elements Into Two Arrays I
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/distribute-elements-into-two-arrays-i/submissions/2114114612)

#### Code
```java
class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        int j = 0, k = 0;
        for (int i = 2; i < nums.length; i++) {
            int c = a.get(j);
            int d = b.get(k);
            if (c > d) {
                a.add(nums[i]);
                j++;
            } else {
                b.add(nums[i]);
                k++;
            }
        }
        a.addAll(b);
        int[] array = a.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
```
