## LeetCode Solutions

### Delete Duplicate Emails

- **Problem:** Delete Duplicate Emails  
- **Platform:** LeetCode  
- **Language:** Python 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/delete-duplicate-emails/submissions/2000479933)

#### Code
```python
import pandas as pd

def delete_duplicate_emails(person: pd.DataFrame) -> None:
    person.sort_values(by='id',ascending=True,inplace=True)
    person.drop_duplicates(subset='email', keep='first', inplace=True)
```
