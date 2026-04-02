## LeetCode Solutions

### Delete Node in a Linked List

- **Problem:** Delete Node in a Linked List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/delete-node-in-a-linked-list/solutions/7746675/delete-node-in-a-linked-list-c-on-by-muk-hcku)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {

    struct ListNode* ptr = node;
    struct ListNode* prev = NULL;

    while (ptr->next != NULL) {
        ptr->val = ptr->next->val;
        prev = ptr;
        ptr = ptr->next;
    }

    prev->next = NULL;
}
