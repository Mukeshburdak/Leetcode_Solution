## LeetCode Solutions

### Sort Even and Odd Indices Independently

- **Problem:** Sort Even and Odd Indices Independently
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sort-even-and-odd-indices-independently/submissions/2165255332)

#### Code
```java
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                a.add(nums[i]);
            } else {
                b.add(nums[i]);
            }
        }
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.reverseOrder());
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = a.get(j);
                j++;
            } else {
                nums[i] = b.get(k);
                k++;
            }
        }
        return nums;
    }
}
```
