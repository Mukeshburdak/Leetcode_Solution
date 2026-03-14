## LeetCode Solutions

### Build an Array With Stack Operations

- **Problem:** Build an Array With Stack Operations  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/build-an-array-with-stack-operations/solutions/7646617/build-an-array-with-stack-operations-jav-w76b)

#### Code
```java
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> arr = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        String var = "Push";
        int i = 0;
        int j = 1;
        int m = target.length;

        while (i < m && j <= n) {
            arr.add(var);
            stack.add(j);

            if (target[i] != stack.get(i)) {
                var = "Pop";
                arr.add(var);
                stack.remove(i);
                var = "Push";
                j++;
            } else {
                i++;
                j++;
            }
        }

        return arr;
    }
}
```
