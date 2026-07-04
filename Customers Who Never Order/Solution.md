## LeetCode Solutions

### Customers Who Never Order
- **Problem:** Customers Who Never Order 
- **Platform:** LeetCode  
- **Language:** mysql 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/customers-who-never-order/submissions/2056084683)

#### Code
```java
SELECT name AS Customers 
FROM Customers 
WHERE Customers.id 
NOT IN (SELECT CustomerId FROM Orders);
```
