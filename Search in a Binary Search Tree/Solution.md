## LeetCode Solutions

### Search in a Binary Search Tree 

- **Problem:** Search in a Binary Search Tree 
- **Platform:** LeetCode  
- **Language:** C
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/search-in-a-binary-search-tree/solutions/8056149/search-in-bst-olog-n-approach-with-c-imp-wz49)

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
struct TreeNode* searchBST(struct TreeNode* root, int val) {
    struct TreeNode* ptr = root;
    struct TreeNode* result = NULL;
    while (ptr != NULL) {
        if (ptr->val == val) {
            result = ptr;
            break;
        }
        if (ptr->val > val) {
            ptr = ptr->left;
        } else {
            ptr = ptr->right;
        }
    }
    return result;
}
```
