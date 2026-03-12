## LeetCode Solutions

### Set Mismatch

- **Problem:** Set Mismatch  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/set-mismatch/solutions/7643566/set-mismatch-java-frequency-array-soluti-wbbt)

#### Code
```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        for(int i = 1; i <= n; i++){
            if(freq[i] == 2){
                arr[0] = i;
            }
            if(freq[i] == 0){
                arr[1] = i;
            }
        }

        return arr;
    }
}
```
