USE w3schools;
SELECT *
FROM Products;

# ORDER BY : 조회 결과의 순서를 결정
# ORDER BY 컬럼명
SELECT *
FROM Products
ORDER BY Price;
SELECT *
FROM Employees
ORDER BY BirthDate;
SELECT *
FROM Customers
ORDER BY CustomerName;

SELECT *
FROM Customers
WHERE Country = 'usa'
ORDER BY CustomerName;
SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY Price;

# 오름차순 ASC (생략가능)
# 내림차순 DESC
SELECT *
FROM Products
ORDER BY Price DESC;
SELECT *
FROM Employees
ORDER BY BirthDate DESC;

# 멕시코에 있는 고객 조회 (이름 역순)
SELECT *
FROM Customers
WHERE Country = 'mexico'
ORDER BY CustomerName DESC;
# 주문번호(OrderID)가 10248인 주문상세(OrderDetails)를 수량이 적은 것 부터 조회
SELECT *
FROM OrderDetails
WHERE OrderID = 10248
ORDER BY Quantity;
# 공급자번호(SupplierID)가 1번인 상품(Products)을 이름(ProductName) 순으로 조회
SELECT *
FROM Products
WHERE SupplierID = 1
ORDER BY ProductName ASC;

# ORDER BY 컬럼, 컬럼, 컬럼 : 여러 컬럼 기준으로 정렬
SELECT CustomerName, City, Country
FROM Customers
ORDER BY Country, City;
SELECT CustomerName, City, Country
FROM Customers
ORDER BY Country, City, CustomerName;
SELECT CustomerName, City, Country
FROM Customers
ORDER BY Country ASC, City DESC, CustomerName DESC;

# 1번 카테고리 상품 조회 공급자순,가격이 비싼순
SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY SupplierID, Price DESC;

# 컬럼명 대신 컬럼 인덱스 사용 가능 (SELECT 절의 컬럼 순서)
SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY 3, 6 DESC;
SELECT ProductID, ProductName, SupplierID, CategoryID, Unit, Price
FROM Products
WHERE CategoryID = 1
ORDER BY 3, 6 DESC;
SELECT SupplierID, Price, ProductID, ProductName, CategoryID, Unit
FROM Products
WHERE CategoryID = 1
ORDER BY 1, 2 DESC;