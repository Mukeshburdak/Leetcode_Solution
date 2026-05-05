## LeetCode Solutions

### Median of Two Sorted Arrays

- **Problem:** Median of Two Sorted Arrays  
- **Platform:** LeetCode  
- **Language:** Python 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/1737689461)

#### Code
```python
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        self = nums1+nums2
        self.sort()
        if(len(self)%2==0):
            n = (self[int(len(self)/2)-1]    + self[(int(len(self)/2))])/2.0
        else:
            n= self[int(len(self))/2]
        
        return n
```
