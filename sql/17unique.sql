USE db1;

# UNIQUE : 여러 행이 같은 값을 가질 수 없음

CREATE TABLE my_table19
(
    col1 VARCHAR(2),
    col2 VARCHAR(2) UNIQUE
);

SELECT *
FROM my_table19;
INSERT INTO my_table19
    VALUE ('a', 'b');
INSERT INTO my_table19
    VALUE ('a', 'c');
INSERT INTO my_table19
    VALUE ('d', 'b');
INSERT INTO my_table19
    VALUE (null, 'd');
INSERT INTO my_table19
    VALUE ('a', null);
INSERT INTO my_table19
    VALUE ('b', null); -- ok

DESC my_table19;
CREATE TABLE my_table20
(
    title VARCHAR(20) NOT NULL,
    price INT,
    isbn  VARCHAR(30) UNIQUE
);

CREATE TABLE my_table21
(
    ssn  VARCHAR(13) UNIQUE,
    name VARCHAR(20) NOT NULL,
    age  INT         NOT NULL
);

# NOT NULL UNIQUE
CREATE TABLE my_table22
(
    col1 VARCHAR(1),
    col2 VARCHAR(2) NOT NULL UNIQUE
);
INSERT INTO my_table22
    VALUE (NULL, 'a');
INSERT INTO my_table22
    VALUE (NULL, 'b');
INSERT INTO my_table22
    VALUE (NULL, 'b');
INSERT INTO my_table22
    VALUE ('a', NULL);
DESC my_table22;
DESC my_table21;

