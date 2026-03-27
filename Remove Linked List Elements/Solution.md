## LeetCode Solutions

### Remove Linked List Elements

- **Problem:** Remove Linked List Elements  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/remove-linked-list-elements/submissions/1960786720)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {

    while (head != NULL && head->val == val) {
        head = head->next;
    }

    struct ListNode* curr = head;
    struct ListNode* prev = NULL;

    while (curr != NULL) {
        if (curr->val == val) {
            prev->next = curr->next;
        } else {
            prev = curr;
        }
        curr = curr->next;
    }

    return head;
}
