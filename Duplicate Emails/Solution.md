## LeetCode Solutions

### Duplicate Emails

- **Problem:** Duplicate Emails  
- **Platform:** LeetCode  
- **Language:** Python
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/duplicate-emails/submissions/1994296878)

#### Code
```python
import pandas as pd

def duplicate_emails(person: pd.DataFrame) -> pd.DataFrame:
    
    duplicate_rows = person[person.duplicated(subset=['email'], keep='first')]
    
   
    unique_duplicates = duplicate_rows['email'].unique()
    
    
    return pd.DataFrame(unique_duplicates, columns=['Email'])
```
