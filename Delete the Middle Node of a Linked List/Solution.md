## LeetCode Solutions

### Delete the Middle Node of a Linked List

- **Problem:** Delete the Middle Node of a Linked List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/solutions/7788105/delete-the-middle-node-of-a-linked-list-up2pq)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    if (head == NULL)
        return head;

    if (head->next == NULL)
        return head->next;

    struct ListNode* ptr = head;
    struct ListNode* prev = NULL;
    int n = 0;

    while (ptr != NULL) {
        n++;
        ptr = ptr->next;
    }

    int i = 1;
    ptr = head;

    while (i <= n / 2 && ptr != NULL) {
        prev = ptr;
        ptr = ptr->next;
        i++;
    }

    prev->next = prev->next->next;

    return head;
}
