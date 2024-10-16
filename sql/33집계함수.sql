# 집계함수(Aggregate Function)
# COUNT, AVG, SUM, MAX, MIN
# 집계함수 사용 시 NULL 포함되지 않음

USE w3schools;
# COUNT 갯수
SELECT COUNT(*)
FROM Customers;
SELECT COUNT(CustomerID)
FROM Customers;
SELECT COUNT(CustomerName)
FROM Customers;
SELECT COUNT(ContactName)
FROM Customers;
DESC Customers;
INSERT INTO Customers
    (CustomerName) VALUE ('흥민');

SELECT COUNT(Country)
FROM Customers;
SELECT COUNT(DISTINCT Country)
FROM Customers;

SELECT SUM(Price)
FROM Products;
SELECT AVG(Price)
FROM Products;
SELECT MAX(Price)
FROM Products;
SELECT MIN(Price)
FROM Products;

DELETE
FROM Customers
WHERE CustomerID = 92;

# GROUP BY : 소계시 사용
SELECT COUNT(CustomerName)
FROM Customers;
SELECT Country, COUNT(CustomerID) 인원
FROM Customers;
SELECT Country, COUNT(CustomerID) 인원
FROM Customers
GROUP BY Country
ORDER BY 인원 DESC;
SELECT Country, COUNT(CustomerID) 인원
FROM Customers
GROUP BY Country
ORDER BY 인원 DESC
LIMIT 5;

# 카테고리별 평균 상품 가격
SELECT p.CategoryID, c.CategoryName, AVG(Price) 평균가격
FROM Products p
         join Categories c
              ON p.CategoryID = c.CategoryID
group by CategoryID;

# 직원별 주문처리건수 (Employees, Orders)
# 직원의 이름과 처리건수 조회 직원 first name 순 정렬
SELECT e.FirstName, e.LastName, COUNT(e.EmployeeID)
FROM Employees e
         JOIN Orders o
              ON e.EmployeeID = o.EmployeeID
GROUP BY e.EmployeeID
ORDER BY FirstName;

# 고객별 주문 건수(주문하지 않은 고객도 포함)
SELECT c.CustomerID, c.CustomerName, COUNT(o.OrderID)
FROM Orders o
         RIGHT JOIN Customers c
                    ON o.CustomerID = c.CustomerID
GROUP BY c.CustomerID
ORDER BY 3 DESC;

# 한번도 주문하지 않은 고객
SELECT *
FROM Customers c
         LEFT JOIN Orders o
                   ON c.CustomerID = o.CustomerID
WHERE o.OrderID IS NULL;

# 1997년 1월에 주문 처리건수를 직원별로 조회
SELECT e.EmployeeID, e.FirstName, e.LastName, COUNT(e.EmployeeID)
FROM Orders o
         JOIN Employees e
              ON o.EmployeeID = e.EmployeeID
WHERE OrderDate BETWEEN '1997-01-01' AND '1997-01-31'
GROUP BY e.EmployeeID;

SELECT e.EmployeeID, e.FirstName, COUNT(OrderID)
FROM (SELECT *
      FROM Orders
      WHERE OrderDate BETWEEN '1997-01-01' AND '1997-01-31') AS JanOrders
         RIGHT JOIN Employees e
                    ON JanOrders.EmployeeID = e.EmployeeID
GROUP BY e.EmployeeID;

