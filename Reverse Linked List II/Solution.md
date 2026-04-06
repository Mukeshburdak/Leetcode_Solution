## LeetCode Solutions

### Reverse Linked List II

- **Problem:** Reverse Linked List II  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/reverse-linked-list-ii/solutions/7798864/reverse-linked-list-ii-clean-c-solution-w9mes)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {

    struct ListNode* curr = head;
    struct ListNode* new = NULL;
    struct ListNode* nxt = NULL;
    struct ListNode* start = NULL;

    if (head == NULL || head->next == NULL)
        return head;

    int j = 1;
    while (j < left && curr != NULL) {
        start = curr;
        curr = curr->next;
        j++;
    }

    struct ListNode* tail = curr;
    while (j <= right && curr != NULL) {
        nxt = curr->next;
        curr->next = new;
        new = curr;
        curr = nxt;
        j++;
    }

    if (start != NULL)
        start->next = new;
    else
        head = new;

    tail->next = curr;

    return head;
}
```
