## LeetCode Solutions

### Intersection of Two Arrays II

- **Problem:** Intersection of Two Arrays II  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/2012585695)

#### Code
```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersect = new ArrayList<>();

        for (int num1 : nums1) {
            for (int i = 0; i < nums2.length; i++) {
                if (num1 == nums2[i]) {
                    intersect.add(num1);
                    nums2[i] = -1;
                    break;
                }
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
```
