## LeetCode Solutions

### Second Highest Salary

- **Problem:** Second Highest Salary 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/2116458332)

#### Code
```sql
# Write your MySQL query statement below
SELECT MAX(Salary) AS SecondHighestSalary
FROM Employee
WHERE Salary < (Select MAX(Salary) FROM Employee);
```
