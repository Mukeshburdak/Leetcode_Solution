## LeetCode Solutions

### Merge Two Sorted Lists

- **Problem:** Merge Two Sorted Lists  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/submissions/1961418298)

#### Code
```c
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* ptr1 = list1;
    struct ListNode* ptr2 = list2;
    struct ListNode* start = NULL;
    struct ListNode* tail = NULL;
    struct ListNode* list3;

    while (ptr1 != NULL && ptr2 != NULL) {
        list3 = (struct ListNode*)malloc(sizeof(struct ListNode));

        if (ptr1->val <= ptr2->val) {
            list3->val = ptr1->val;
            ptr1 = ptr1->next;
        } else {
            list3->val = ptr2->val;
            ptr2 = ptr2->next;
        }

        list3->next = NULL;

        if (start == NULL) {
            start = list3;
            tail = list3;
        } else {
            tail->next = list3;
            tail = list3;
        }
    }

    while (ptr1 != NULL) {
        list3 = (struct ListNode*)malloc(sizeof(struct ListNode));
        list3->val = ptr1->val;
        list3->next = NULL;

        if (start == NULL) {
            start = list3;
            tail = list3;
        } else {
            tail->next = list3;
            tail = list3;
        }
        ptr1 = ptr1->next;
    }

    while (ptr2 != NULL) {
        list3 = (struct ListNode*)malloc(sizeof(struct ListNode));
        list3->val = ptr2->val;
        list3->next = NULL;

        if (start == NULL) {
            start = list3;
            tail = list3;
        } else {
            tail->next = list3;
            tail = list3;
        }
        ptr2 = ptr2->next;
    }

    return start;
}
