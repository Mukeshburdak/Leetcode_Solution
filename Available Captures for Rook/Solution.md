## LeetCode Solutions

### Available Captures for Rook

- **Problem:** Available Captures for Rook
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/available-captures-for-rook/submissions/2098295724)

#### Code
```java
class Solution {
    public int numRookCaptures(char[][] board) {
        int a = 0, b = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    a = i;
                    b = j;
                }
            }
        }
        int count = 0;
        for (int i = a - 1; i >= 0; i--) {
            if (board[i][b] == 'B') {
                break;
            } else if (board[i][b] == 'p') {
                count++;
                break;
            }
        }
        for (int i = b - 1; i >= 0; i--) {
            if (board[a][i] == 'B') {
                break;
            } else if (board[a][i] == 'p') {
                count++;
                break;
            }
        }
        for (int i = a + 1; i < 8; i++) {
            if (board[i][b] == 'B') {
                break;
            } else if (board[i][b] == 'p') {
                count++;
                break;
            }
        }
        for (int i = b + 1; i < 8; i++) {
            if (board[a][i] == 'B') {
                break;
            } else if (board[a][i] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }
}
```
