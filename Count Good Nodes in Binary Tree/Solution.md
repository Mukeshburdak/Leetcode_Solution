## LeetCode Solutions

### Count Good Nodes in Binary Tree

- **Problem:** Count Good Nodes in Binary Tree 
- **Platform:** LeetCode  
- **Language:** C 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-good-nodes-in-binary-tree/submissions/1985494795)

#### Code
```c
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int goodNodes(struct TreeNode* root) {
    if (root == NULL)
        return 0;

    struct TreeNode* stack[100];
    int maxStack[100];

    int good = 0;
    int top = 0;

    stack[top] = root;
    maxStack[top] = root->val;

    while (top != -1) {
        struct TreeNode* node = stack[top];
        int Max = maxStack[top];
        top--;
        if (node->val >= Max) {
            good++;
        }

        int newMax = (node->val > Max) ? node->val : Max;
        if (node->right) {
            top++;
            stack[top] = node->right;
            maxStack[top] = newMax;
        }

        if (node->left) {
            stack[++top] = node->left;
            maxStack[top] = newMax;
        }
    }
    return good;
}
```
