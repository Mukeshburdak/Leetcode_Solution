## LeetCode Solutions

### Evaluate Reverse Polish Notation

- **Problem:** Evaluate Reverse Polish Notation  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/7646693/evaluate-reverse-polish-notation-java-st-vx5l)

#### Code
```java
class Solution {
    public int evalRPN(String[] tokens) {
        List<String> stack = new ArrayList<>();
        int n = tokens.length;
        int i = 0;
        int j = 0;
        int temp = 0;

        while (i < n) {
            if (tokens[i].equals("+")) {
                temp = Integer.parseInt(stack.get(j - 2)) + Integer.parseInt(stack.get(j - 1));
                stack.remove(j - 1);
                stack.remove(j - 2);
                stack.add(String.valueOf(temp));
                j--;
            } else if (tokens[i].equals("-")) {
                temp = Integer.parseInt(stack.get(j - 2)) - Integer.parseInt(stack.get(j - 1));
                stack.remove(j - 1);
                stack.remove(j - 2);
                stack.add(String.valueOf(temp));
                j--;
            } else if (tokens[i].equals("*")) {
                temp = Integer.parseInt(stack.get(j - 2)) * Integer.parseInt(stack.get(j - 1));
                stack.remove(j - 1);
                stack.remove(j - 2);
                stack.add(String.valueOf(temp));
                j--;
            } else if (tokens[i].equals("/")) {
                temp = Integer.parseInt(stack.get(j - 2)) / Integer.parseInt(stack.get(j - 1));
                stack.remove(j - 1);
                stack.remove(j - 2);
                stack.add(String.valueOf(temp));
                j--;
            } else {
                stack.add(tokens[i]);
                j++;
            }
            i++;
        }

        return Integer.parseInt(stack.get(0));
    }
}
```
#### Code (Optimized Stack Version)
```java
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } 
            else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } 
            else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } 
            else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } 
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
```
