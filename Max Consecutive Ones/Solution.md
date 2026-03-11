## LeetCode Solutions

### Max Consecutive Ones

- **Problem:** Max Consecutive Ones  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/max-consecutive-ones/solutions/7641252/max-consecutive-ones-java-easy-solution-47ofe)

#### Code
```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int min = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                min += 1;
            }
            else{
                if(max < min){
                    max = min;
                }
                min = 0;
            }

            if(nums[nums.length-1] == 1){
                if(max < min){
                    max = min;
                }
            }
        }
        return max;
    }
}
```
