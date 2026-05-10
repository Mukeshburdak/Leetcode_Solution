## LeetCode Solutions

### Fizz Buzz

- **Problem:** Fizz Buzz  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/fizz-buzz/solutions/8183588/fizz-buzz-solution-in-java-easy-leetcode-832b)

#### Code
```java
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                answer.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                answer.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i + 1));
            }
        }
        return answer;
    }
}
```
