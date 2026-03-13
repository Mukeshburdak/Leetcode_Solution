## LeetCode Solutions

### Find All Numbers Disappeared in an Array

- **Problem:** Find All Numbers Disappeared in an Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/solutions/7645555/find-all-numbers-disappeared-in-an-array-zrm4)

#### Code
```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int flag = 0;

        Arrays.sort(nums);

        for (int i = 1; i <= n; i++) {
            int low = 0;
            int high = n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] == i) {
                    flag = 1;
                    break;
                }

                if (nums[mid] < i) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (flag == 0) {
                arr.add(i);
            }

            flag = 0;
        }

        return arr;
    }
}
```
