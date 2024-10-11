USE w3schools;
DESC Customers;

INSERT INTO Customers
    (CustomerID, CustomerName)
    VALUE (92, '흥민');

SELECT *
FROM Customers
ORDER BY CustomerID DESC;

INSERT INTO Customers
    (CustomerID, CustomerName, ContactName)
    VALUE (93, '강인', '미드필더');

INSERT INTO Customers
    (CustomerID, CustomerName)
VALUES (94, '희찬'),
       (95, '하성'),
       (96, '오타니');

INSERT INTO Customers
    (CustomerID, CustomerName)
    VALUE ('97', '범근');

INSERT INTO Customers
    (CustomerName)
    VALUE ('지성');

# Customers 테이블에 2개의 레코드 입력하기
INSERT INTO Customers
    (CustomerID, CustomerName)
VALUES (99, '레코드1'),
       (100, '레코드2');
# Products 테이블에 2개의 레코드 입력하기
INSERT INTO Products
    (ProductName)
VALUES ('상품1'),
       ('상품');
select *
from Products
order by ProductID desc;
