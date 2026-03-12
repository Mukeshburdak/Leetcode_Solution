## LeetCode Solutions

### How Many Numbers Are Smaller Than the Current Number

- **Problem:** How Many Numbers Are Smaller Than the Current Number  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/solutions/7643595/how-many-numbers-are-smaller-than-the-cu-awal)

#### Code
```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int value = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(nums[i] > nums[j]){
                    value++;
                }
            }
            arr[i] = value;
            value = 0;
        }

        return arr;
    }
}
```
