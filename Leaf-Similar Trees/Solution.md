## LeetCode Solutions

### Leaf-Similar Trees

- **Problem:** Leaf-Similar Trees 
- **Platform:** LeetCode  
- **Language:** C
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/leaf-similar-trees/submissions/1984576493)

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
bool leafSimilar(struct TreeNode* root1, struct TreeNode* root2) {
    struct TreeNode* ptr1 = root1;
    struct TreeNode* ptr2 = root2;
    struct TreeNode* stack[200];
    int* result1 = malloc(100 * sizeof(int));
    int* result2 = malloc(100 * sizeof(int));
    int size1 = 0;
    int top = -1;
    while (top != -1 || ptr1 != NULL) {
        while (ptr1 != NULL) {
            top++;
            stack[top] = ptr1;
            ptr1 = ptr1->left;
        }
        ptr1 = stack[top];
        top--;
        if (ptr1->left == NULL && ptr1->right == NULL) {
            result1[size1] = ptr1->val;
            size1++;
        }
        ptr1 = ptr1->right;
    }
    int size2 = 0;
    while (top != -1 || ptr2 != NULL) {
        while (ptr2 != NULL) {
            top++;
            stack[top] = ptr2;
            ptr2 = ptr2->left;
        }
        ptr2 = stack[top];
        top--;
        if (ptr2->left == NULL && ptr2->right == NULL) {
            result2[size2] = ptr2->val;
            size2++;
        }
        ptr2 = ptr2->right;
    }
    if (size1 != size2) {
        return false;
    }

    for (int i = 0; i < size1; i++) {
        if (result1[i] != result2[i]) {
            return false;
        }
    }
    return true;
}
```
