USE w3schools;
DESC Orders;
SELECT o.OrderID, o.OrderDate, c.CustomerName, e.FirstName, e.LastName, s.ShipperName
FROM Orders o
         JOIN Customers c
              ON o.CustomerID = c.CustomerID
         JOIN Employees e
              ON o.EmployeeID = e.EmployeeID
         JOIN Shippers s
              ON o.ShipperID = s.ShipperID
WHERE OrderDate BETWEEN '1997-07-01' AND '1997-07-07'
ORDER BY o.OrderDate;

USE db1;
CREATE TABLE my_table51
(
    id   INT,
    name VARCHAR(10)
);
CREATE TABLE my_table52
(
    id      INT,
    address VARCHAR(10)
);
CREATE TABLE my_table53
(
    id    INT,
    c_id  INT,
    a_id  INT,
    email VARCHAR(10)
);

INSERT INTO my_table51
    (id, name)
VALUES (1, 'kim'),
       (2, 'lee'),
       (3, 'park');

INSERT INTO my_table52
    (id, address)
VALUES (10, 'seoul'),
       (20, 'jeju'),
       (30, 'dokdo'),
       (40, 'busan');

INSERT INTO my_table53
    (id, c_id, a_id, email)
VALUES (1, 1, 20, 'gmail'),
       (2, 2, 30, 'yahoo'),
       (3, 3, 40, 'duck'),
       (4, 3, 10, 'naver');

SELECT *
FROM my_table53
         JOIN my_table51
              ON my_table53.c_id = my_table51.id
         JOIN my_table52
              ON my_table53.a_id = my_table52.id;