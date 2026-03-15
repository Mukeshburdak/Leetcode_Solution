## LeetCode Solutions

### Add Two Numbers

- **Problem:** Add Two Numbers  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/add-two-numbers/submissions/1948701157)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {

    struct ListNode* ptr = NULL;
    struct ListNode* ptr1 = NULL;
    struct ListNode* start = NULL;

    int carry = 0;
    int sum = 0;

    while (l1 != NULL || l2 != NULL || carry != 0) {

        struct ListNode* new_node = (struct ListNode*)malloc(sizeof(struct ListNode));

        sum = carry;

        if (l1 != NULL) {
            sum = sum + l1->val;
            l1 = l1->next;
        }

        if (l2 != NULL) {
            sum = sum + l2->val;
            l2 = l2->next;
        }

        carry = sum / 10;
        new_node->val = sum % 10;
        new_node->next = NULL;

        if (start == NULL) {
            start = new_node;
            ptr = new_node;
        } else {
            ptr->next = new_node;
            ptr = new_node;
        }
    }

    return start;
}
```
