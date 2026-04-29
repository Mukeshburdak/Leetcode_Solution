## LeetCode Solutions

### Binary Tree Preorder Traversal 

- **Problem:** Binary Tree Preorder Traversal  
- **Platform:** LeetCode  
- **Language:** C 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/binary-tree-preorder-traversal/solutions/8114002/binary-tree-preorder-traversal-on-by-muk-w24y)

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
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    struct TreeNode* ptr = root;
    struct TreeNode* stack[100];
    int top = 0;
    int* result = malloc(100 * sizeof(int));
    *returnSize = 0;
    while (top != -1) {
        while (ptr != NULL) {
            result[*returnSize] = ptr->val;
            (*returnSize)++;
            if (ptr->right != NULL) {
                top++;
                stack[top] = ptr->right;
            }
            ptr = ptr->left;
        }
        ptr = stack[top];
        top--;
    }
    return result;
}
```
