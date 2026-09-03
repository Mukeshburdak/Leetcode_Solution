## LeetCode Solutions

### All Elements in Two Binary Search Trees

- **Problem:** All Elements in Two Binary Search Trees
- **Platform:** LeetCode  
- **Language:** C
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/all-elements-in-two-binary-search-trees/submissions/2129231196)

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
int* getAllElements(struct TreeNode* root1, struct TreeNode* root2,
                    int* returnSize) {

    int capacity = 20000;

    int* arr1 = malloc(capacity * sizeof(int));
    int* arr2 = malloc(capacity * sizeof(int));
    int* result = malloc(2 * capacity * sizeof(int));

    struct TreeNode** stack = malloc(capacity * sizeof(struct TreeNode*));

    int n1 = 0, n2 = 0;
    int top = -1;
    struct TreeNode* ptr;

    ptr = root1;

    while (ptr != NULL || top != -1) {
        while (ptr != NULL) {
            stack[++top] = ptr;
            ptr = ptr->left;
        }

        ptr = stack[top--];
        arr1[n1++] = ptr->val;
        ptr = ptr->right;
    }

    top = -1;
    ptr = root2;

    while (ptr != NULL || top != -1) {
        while (ptr != NULL) {
            stack[++top] = ptr;
            ptr = ptr->left;
        }

        ptr = stack[top--];
        arr2[n2++] = ptr->val;
        ptr = ptr->right;
    }

    int i = 0, j = 0, k = 0;

    while (i < n1 && j < n2) {
        if (arr1[i] <= arr2[j]) {
            result[k++] = arr1[i++];
        } else {
            result[k++] = arr2[j++];
        }
    }

    while (i < n1) {
        result[k++] = arr1[i++];
    }

    while (j < n2) {
        result[k++] = arr2[j++];
    }

    *returnSize = k;

    free(arr1);
    free(arr2);
    free(stack);

    return result;
}
```
