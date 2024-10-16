USE w3schools;
SELECT *
FROM Orders;
SELECT *
FROM OrderDetails
WHERE OrderID = 10248;

# 1996년 7월 4일에 어떤 고객이 어떤 상품을 몇 개 주문했는지 조회
SELECT o.OrderDate, c.CustomerName, p.ProductName, od.Quantity
FROM Orders o
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Customers c
              ON c.CustomerID = o.CustomerID
         JOIN Products p
              ON od.ProductID = p.ProductID
WHERE OrderDate = '1996-07-04';

# 1996년 7월 4일에 주문된 상품과 카테고리 정보 조회
SELECT p.ProductName, c.CategoryName, o.OrderDate
FROM Orders o
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
         JOIN Categories c
              ON p.CategoryID = c.CategoryID
WHERE OrderDate = '1996-07-04';

# 5번 직원이 처리한 주문의 주문 날짜와 상품들 조회
SELECT e.FirstName, e.LastName, o.OrderDate, p.ProductName, od.Quantity
FROM Employees e
         JOIN Orders o
              ON o.EmployeeID = e.EmployeeID
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
WHERE e.EmployeeID = 5;