## LeetCode Solutions

### Rotate List

- **Problem:** Rotate List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/rotate-list/submissions/1962571746)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if (head == NULL || head->next == NULL || k == 0)
        return head;

    struct ListNode* last = head;
    int len = 1;

    while (last->next != NULL) {
        last = last->next;
        len++;
    }

    k = k % len;
    if (k == 0) {
        return head;
    }

    last->next = head;

    struct ListNode* new = head;
    for (int i = 1; i < len - k; i++) {
        new = new->next;
    }

    struct ListNode* Head = new->next;
    new->next = NULL;

    return Head;
}
