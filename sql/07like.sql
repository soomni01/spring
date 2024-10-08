USE w3schools;

# LIKE : ~같은
SELECT *
FROM Customers
WHERE CustomerName = 'Alfreds Futterkiste';
SELECT *
FROM Customers
WHERE CustomerName LIKE '%ed%';

# % : 0개 이상의 임의의 문자들
SELECT *
FROM Customers
WHERE CustomerName LIKE 'A%';
SELECT *
FROM Customers
WHERE CustomerName LIKE '%A%';

# _ : 임의의 한글자
SELECT *
FROM Employees
WHERE BirthDate LIKE '195_-__-__';
SELECT *
FROM Employees
WHERE BirthDate LIKE '195_-02-__';

SELECT *
FROM Customers
WHERE CustomerName LIKE '%OR%';
SELECT *
FROM Customers
WHERE ContactName LIKE 'A%O';
SELECT *
FROM Employees
WHERE BirthDate LIKE '____-07-__';

