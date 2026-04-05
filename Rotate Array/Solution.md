## LeetCode Solutions

### Rotate Array (Approach 1 - Brute Force)

- **Problem:** Rotate Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/rotate-array/solutions/7785209/rotate-array-brute-force-vs-optimal-reve-utrg)

#### Code
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        while (k > 0) {
            int temp = nums[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }

            nums[0] = temp;
            k--;
        }
    }
}
```

### Rotate Array (Approach 2 - Optimal Reverse Method)
#### Code
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
```
