## LeetCode Solutions

### Palindrome Linked List

- **Problem:** Palindrome Linked List  
- **Platform:** LeetCode  
- **Language:** C  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/palindrome-linked-list/solutions/7725586/palindrome-linked-list-c-array-approach-pz5zu)

#### Code
```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode* ptr = head;
    int n = 0;

    while (ptr != NULL) {
        n++;
        ptr = ptr->next;
    }

    int arr[n];
    int i = 0;
    ptr = head;

    while (ptr != NULL) {
        arr[i] = ptr->val;
        i++;
        ptr = ptr->next;
    }

    for (int i = 0; i < n; i++) {
        if (arr[i] != arr[n - i - 1]) {
            return false;
        }
    }

    return true;
}
