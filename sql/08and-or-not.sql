USE w3schools;

SELECT *
FROM Employees
WHERE BirthDate LIKE '195_-__-__';
SELECT *
FROM Products
WHERE Price < 10.00
   OR Price > 100.00;
SELECT *
FROM Orders
WHERE OrderDate LIKE '1997-07-__';
SELECT *
FROM Suppliers
WHERE Country = 'usa'
   or Country = 'uk'