## LeetCode Solutions

### Add Two Numbers II

- **Problem:** Add Two Numbers II
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/add-two-numbers-ii/solutions/7809609/add-two-numbers-in-c-omaxm-n-by-mukeshbu-qw7h)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 * int val;
 * struct ListNode *next;
 * };
 */

struct ListNode* Reverse(struct ListNode* curr) {
    struct ListNode* prev = NULL;
    struct ListNode* nxt = NULL;
    while (curr != NULL) {
        nxt = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nxt;
    }
    return prev;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* head = NULL;
    l1 = Reverse(l1);
    l2 = Reverse(l2);
    int carry = 0;

    while (l1 != NULL || l2 != NULL || carry != 0) {
        int sum = carry;

        if (l1 != NULL) {
            sum += l1->val;
            l1 = l1->next;
        }
        if (l2 != NULL) {
            sum += l2->val;
            l2 = l2->next;
        }

        struct ListNode* newNode =
            (struct ListNode*)malloc(sizeof(struct ListNode));
        newNode->val = sum % 10;
        newNode->next = head;
        head = newNode;
        carry = sum / 10;
    }
    return head;
}
```
