USE w3schools;
# SELECT 컬럼명들.. FROM 테이블명 WHERE 조건

# 컬럼명 = '값'
SELECT FirstName, LastName, BirthDate
FROM Employees
WHERE BirthDate = '1963-08-30';

# >, <, >=, <=, !=
SELECT *
FROM Employees
WHERE BirthDate > '1963-08-30';
SELECT *
FROM Employees
WHERE BirthDate < '1963-08-30';
SELECT *
FROM Employees
WHERE BirthDate >= '1963-08-30';
SELECT *
FROM Employees
WHERE BirthDate <= '1963-08-30';
SELECT *
FROM Employees
WHERE BirthDate != '1963-08-30';
SELECT *
FROM Employees
WHERE BirthDate <> '1963-08-30';
SELECT *
FROM Products
WHERE Price < 10.00;
SELECT *
FROM Customers
WHERE CustomerID >= 80;
SELECT *
FROM Customers
WHERE CustomerName >= 'D';
SELECT *
FROM Customers
WHERE CustomerName >= 'd';
SELECT *
FROM Customers
WHERE CustomerName < 'd';

# 1998년 1월 1일(포함, OrderDate) 이후에 주문된 건들 (Orders)
SELECT *
FROM Orders
WHERE OrderDate >= '1998-01-01';
# 수량(Quantity)이 10개 미만인 주문상세들(OrderDetails)
SELECT *
FROM OrderDetails
WHERE Quantity < 10;
# 카테고리 번호가 1,2,3 번인 상품들
SELECT DISTINCT CategoryID
FROM Products;
SELECT *
FROM Products
WHERE CategoryID < 4;