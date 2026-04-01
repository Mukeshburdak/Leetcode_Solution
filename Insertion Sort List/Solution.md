## LeetCode Solutions

### Insertion Sort List (Approach 1 - Value Swapping)

- **Problem:** Insertion Sort List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/insertion-sort-list/submissions/1965865078)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* insertionSortList(struct ListNode* head) {
    if (head == NULL || head->next == NULL)
        return head;

    struct ListNode* new = head->next;
    int temp;

    while (new != NULL) {
        struct ListNode* ptr = head;

        while (ptr != new) {
            if (ptr->val > new->val) {
                temp = new->val;
                new->val = ptr->val;
                ptr->val = temp;
            }
            ptr = ptr->next;
        }
        new = new->next;
    }
    return head;
}
```
## Insertion Sort List (Approach 2 - Pointer Based)
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* insertionSortList(struct ListNode* head) {
    if (head == NULL || head->next == NULL)
        return head;

    struct ListNode dummy;
    dummy.next = NULL;

    struct ListNode* curr = head;

    while (curr != NULL) {
        struct ListNode* next = curr->next;
        struct ListNode* prev = &dummy;

        while (prev->next != NULL && prev->next->val < curr->val) {
            prev = prev->next;
        }

        curr->next = prev->next;
        prev->next = curr;

        curr = next;
    }

    return dummy.next;
}
```
