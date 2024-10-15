USE w3schools;

# alias : 별칭
# 컬럼, 테이블에 별칭을 줄 수 있음

SELECT p.ProductName, s.SupplierName
FROM Products AS p
         JOIN Suppliers AS s
              ON p.SupplierID = s.SupplierID
WHERE s.SupplierID = 1;

SELECT ProductName AS 상품명, Unit AS 단위, Price AS 가격
FROM Products;

# AS 생략 가능
SELECT p.ProductName, s.SupplierName
FROM Products p
         JOIN Suppliers s
              ON p.SupplierID = s.SupplierID
WHERE s.SupplierID = 1;

SELECT ProductName 상품명, Unit 단위, Price 가격
FROM Products;

# 카테고리별 상품명 조회
SELECT c.CategoryName 카테고리명, p.ProductName 상품명
FROM Categories c
         JOIN Products p
              ON c.CategoryID = p.CategoryID
ORDER BY c.CategoryID;

# 공급자별 공급하는 상품들 조회
SELECT s.SupplierName 공급자명, p.ProductName 상품명
FROM Suppliers s
         JOIN Products p
              ON p.SupplierID = s.SupplierID;

# 1996년 7월 8일에 주문을 처리한 직원 이름 조회 (Orders, Employees)
SELECT e.LastName 성, e.FirstName 이름
FROM Orders o
         JOIN Employees e
              ON o.EmployeeID = e.EmployeeID
WHERE o.OrderDate = '1996-07-08';