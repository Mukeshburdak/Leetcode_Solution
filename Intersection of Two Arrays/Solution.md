## LeetCode Solutions

### Intersection of Two Arrays

- **Problem:** Intersection of Two Arrays
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/submissions/2010367953)

#### Code
```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersectSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectSet.add(num);
            }
        }

        int[] result = new int[intersectSet.size()];
        int i = 0;
        for (int num : intersectSet) {
            result[i++] = num;
        }
        return result;
    }
}
```
