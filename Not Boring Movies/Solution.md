## LeetCode Solutions

### Not Boring Movies

- **Problem:** Not Boring Movies
- **Platform:** LeetCode  
- **Language:** MySQL  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/not-boring-movies/submissions/1967414259)

#### Code
```sql
# Write your MySQL query statement below
SELECT * FROM Cinema 
Where (id%2!=0 && description != 'boring')
Order By rating DESC;
