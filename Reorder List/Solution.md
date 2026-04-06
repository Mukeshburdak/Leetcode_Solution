## LeetCode Solutions

### Reorder List

- **Problem:** Reorder List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/reorder-list/solutions/7796762/reorder-list-c-fast-slow-pointer-reverse-d4x2)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void reorderList(struct ListNode* head) {
    if (!head || !head->next)
        return;

    struct ListNode* slow = head;
    struct ListNode* fast = head;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

    struct ListNode* first = head;
    struct ListNode* second = slow->next;
    slow->next = NULL;

    struct ListNode* prev = NULL;
    struct ListNode* curr = second;
    struct ListNode* nxt = NULL;

    while (curr != NULL) {
        nxt = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nxt;
    }

    second = prev;

    while (second != NULL) {
        struct ListNode* temp1 = first->next;
        first->next = second;

        struct ListNode* temp2 = second->next;
        second->next = temp1;

        first = temp1;
        second = temp2;
    }
}
