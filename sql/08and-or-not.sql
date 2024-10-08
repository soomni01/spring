USE w3schools;

# <, <=, >, >=, <>, !=, LIKE

# AND OR NOT
SELECT *
FROM Products
WHERE Price > 10.00
  AND Price < 20.00
ORDER BY Price;
SELECT *
FROM Customers
WHERE Country = 'Mexico'
   OR Country = 'USA'
ORDER BY Country, City;
SELECT *
FROM Customers
WHERE Country <> 'mexico';
SELECT *
FROM Customers
WHERE NOT Country = 'mexico';

# 멕시코와 usa 가 아닌 고객들
SELECT *
FROM Customers
WHERE NOT (Country = 'mexico'
    OR Country = 'usa');
SELECT *
FROM Customers
WHERE Country != 'mexico'
  AND Country != 'usa';

# AND OR NOT 이 여러번 조합될 시 () 꼭 사용해서 읽기 편하게 작성

# 미국이나 브라질에 사는 이름이 G로 시작하는 고객들
SELECT *
FROM Customers
WHERE CustomerName LIKE 'G%'
  AND (Country = 'USA'
    OR Country = 'Brazil');

# 1950년대 태어난 직원들 조회
SELECT *
FROM Employees
WHERE BirthDate >= '1950-01-01'
  AND BirthDate < '1960-01-01'
ORDER BY BirthDate;
SELECT *
FROM Employees
WHERE BirthDate LIKE '195_-__-__'
ORDER BY BirthDate;
# 가격이 10.00 보다 작거나 100.00보다 큰 상품들
SELECT *
FROM Products
WHERE Price < 10.00
   OR Price > 100.00
ORDER BY Price;
SELECT *
FROM Products
WHERE NOT (Price >= 10.00
    AND Price <= 100.00);
# 1997년 7월에 주문된 주문들 (Orders)
SELECT *
FROM Orders
WHERE OrderDate >= '1997-07-01'
  AND OrderDate < '1997-08-01';
SELECT *
FROM Orders
WHERE OrderDate LIKE '1997-07-__';
# 미국이나 영국에 있는 공급자들(Suppliers)
SELECT *
FROM Suppliers
WHERE Country = 'USA'
   OR Country = 'UK'
ORDER BY Country, City;

