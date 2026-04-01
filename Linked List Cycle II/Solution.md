## LeetCode Solutions

### Linked List Cycle II

- **Problem:** Linked List Cycle II  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/linked-list-cycle-ii/solutions/7741898/linked-list-cycle-ii-c-floyds-algorithm-kih6f)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* detectCycle(struct ListNode* head) {
    struct ListNode* ptr = head;
    struct ListNode* prev = head;

    while (ptr != NULL && ptr->next != NULL) {
        ptr = ptr->next->next;
        prev = prev->next;

        if (ptr == prev) {
            ptr = head;

            while (ptr != prev) {
                ptr = ptr->next;
                prev = prev->next;
            }

            return ptr;
        }
    }

    return NULL;
}
