## LeetCode Solutions

### Remove Duplicates from Sorted List

- **Problem:** Remove Duplicates from Sorted List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/solutions/7712968/remove-duplicates-from-sorted-list-c-on-rogps)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if (head == NULL || head->next == NULL)
        return head;

    struct ListNode* prev = head;
    struct ListNode* curr = head->next;

    while (curr != NULL) {
        if (prev->val == curr->val) {
            prev->next = curr->next;
            curr = curr->next;
        } else {
            prev = curr;
            curr = curr->next;
        }
    }

    return head;
}
