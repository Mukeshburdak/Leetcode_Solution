## LeetCode Solutions

### Middle of the Linked List

- **Problem:** Middle of the Linked List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/middle-of-the-linked-list/solutions/7725479/middle-of-the-linked-list-c-on-by-mukesh-t1ul)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* ptr = head;
    int n = 0;

    while (ptr != NULL) {
        n++;
        ptr = ptr->next;
    }

    n = (n / 2);
    ptr = head;

    while (n > 0) {
        ptr = ptr->next;
        n--;
    }

    return ptr;
}
