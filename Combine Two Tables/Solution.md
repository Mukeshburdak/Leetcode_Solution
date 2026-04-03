## LeetCode Solutions

### Combine Two Tables

- **Problem:** Combine Two Tables  
- **Platform:** LeetCode  
- **Language:** MySQL  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/combine-two-tables/submissions/1967405214)

#### Code
```sql
# Write your MySQL query statement below
SELECT firstName, lastName, city, state
FROM Person
LEFT JOIN Address ON Person.personId = Address.personId;
