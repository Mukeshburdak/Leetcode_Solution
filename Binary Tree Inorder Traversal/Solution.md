## LeetCode Solutions

### Binary Tree Inorder Traversal

- **Problem:** Binary Tree Inorder Traversal
- **Platform:** LeetCode  
- **Language:** C 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/binary-tree-inorder-traversal/solutions/7967182/binary-tree-inorder-traversal-iterative-lin4f)

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
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    struct TreeNode* ptr = root;
    struct TreeNode* stack[100];
    int top = -1;
    int* result = malloc(100 * sizeof(int));
    *returnSize = 0; 
    while (top != -1 || ptr != NULL) {
        while (ptr != NULL) {
            top++;
            stack[top] = ptr;
            ptr = ptr->left;
        }
        ptr = stack[top];
        top--;
        result[*returnSize] = ptr->val;
        (*returnSize)++; 
        ptr = ptr->right;
    }
    return result;
}
```
