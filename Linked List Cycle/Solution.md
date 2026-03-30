## LeetCode Solutions

### Linked List Cycle

- **Problem:** Linked List Cycle  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/submissions/detail/1963814458/)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode* head) {
    struct ListNode* ptr = head;
    struct ListNode* prev = head;

    while (ptr != NULL && ptr->next != NULL) {
        ptr = ptr->next->next;
        prev = prev->next;

        if (ptr == prev) {
            return true;
        }
    }

    return false;
}
