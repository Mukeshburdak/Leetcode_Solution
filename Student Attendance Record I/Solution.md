## LeetCode Solutions

### Student Attendance Record I

- **Problem:** Student Attendance Record I  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/student-attendance-record-i/submissions/2079810948)

#### Code
```java
class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                l++;
            } else if (c == 'A') {
                a++;
                l = 0;
            } else {
                l = 0;
            }
            if (l == 3) {
                return false;
            }
            if (a == 2) {
                return false;
            }
        }
        return true;
    }
}
```
