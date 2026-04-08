## LeetCode Solutions

### Swapping Nodes in a Linked List

- **Problem:** Swapping Nodes in a Linked List 
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/solutions/7821032/swapping-nodes-in-a-linked-list-in-c-on-b8dm4).

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapNodes(struct ListNode* head, int k) {
    if (head == NULL || head->next == NULL)
        return head;

    struct ListNode* ptr = head;
    struct ListNode* left = NULL;
    struct ListNode* right = NULL;
    int i = 0;

    while (ptr != NULL) {
        if (i < k) {
            left = ptr;
        }
        i++;
        ptr = ptr->next;
    }
    ptr = head;
    int j = i - k;
    while (ptr != NULL && j >= 0) {
        right = ptr;
        ptr = ptr->next;
        j--;
    }
    int temp = right->val;
    right->val = left->val;
    left->val = temp;

    return head;
}
```
---
This is not a perfect solution.
