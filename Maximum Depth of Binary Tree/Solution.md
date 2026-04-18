## LeetCode Solutions

### Maximum Depth of Binary Tree

- **Problem:** Maximum Depth of Binary Tree
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/1981892054)

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
int maxDepth(struct TreeNode* root) {
    if (root == NULL) {
        return 0;
    }
    struct TreeNode* ptr = root;
    int max = 0;
    struct TreeNode* stack[10000];
    int depth[10000];
    int top = 0;
    int count = 1;
    stack[top] = ptr;
    depth[top] = count;
    while (top != -1) {
        ptr = stack[top];
        count = depth[top];
        top--;
        if (count > max) {
            max = count;
        }
        if (ptr->right != NULL) {
            top++;
            stack[top] = ptr->right;
            depth[top] = count + 1;
        }
        if (ptr->left != NULL) {
            top++;
            stack[top] = ptr->left;
            depth[top] = count + 1;
        }
    }
    return max;
}
```
