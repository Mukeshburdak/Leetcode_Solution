## LeetCode Solutions

### Convert Binary Number in a Linked List to Integer

- **Problem:** Convert Binary Number in a Linked List to Integer  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/solutions/7725400/convert-binary-number-in-a-linked-list-t-6qb2)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    struct ListNode* ptr = head;
    int result = 0;

    while (ptr != NULL) {
        result = result * 2 + ptr->val;
        ptr = ptr->next;
    }

    return result;
}
