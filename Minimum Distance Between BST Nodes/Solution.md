## LeetCode Solutions

### Minimum Distance Between BST Nodes

- **Problem:** Minimum Distance Between BST Nodes
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-distance-between-bst-nodes/submissions/2129207740)

#### Code
```java
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int minDiffInBST(struct TreeNode* root) {
    struct TreeNode* ptr = root;
    struct TreeNode* stack[100];
    int top = -1;
    int previous = -100000;
    int min = 100000;
    while (top != -1 || ptr != NULL) {
        while (ptr != NULL) {
            top++;
            stack[top] = ptr;
            ptr = ptr->left;
        }
        ptr = stack[top];
        top--;
        int current = ptr->val;
        if (current - previous < min) {
            min = current - previous;
        }
        previous = current;
        ptr = ptr->right;
    }
    return min;
}
```
