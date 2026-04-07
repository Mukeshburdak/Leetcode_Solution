## LeetCode Solutions

### Intersection of Two Linked Lists

- **Problem:** Intersection of Two Linked Lists  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/intersection-of-two-linked-lists/solutions/7808180/intersection-of-two-linked-lists-clean-c-vx7l)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* getIntersectionNode(struct ListNode* headA,
                                     struct ListNode* headB) {
    struct ListNode* skipA = headA;
    struct ListNode* skipB = headB;

    while (skipA != skipB) {
        if (skipA == NULL) {
            skipA = headB;
        } else {
            skipA = skipA->next;
        }
        if (skipB == NULL) {
            skipB = headA;
        } else {
            skipB = skipB->next;
        }
    }
    return skipA;
}
```

### Brute Force Approach

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* getIntersectionNode(struct ListNode* headA,
                                     struct ListNode* headB) {
    struct ListNode* skipA = headA;
    struct ListNode* skipB = headB;

    while (skipA != NULL) {
        skipB = headB;

        while (skipB != NULL) {
            if (skipA == skipB) {
                return skipA;
            }
            skipB = skipB->next;
        }

        skipA = skipA->next;
    }
    return NULL;
}
```
