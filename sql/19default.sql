USE db1;
# DEFAULT : 값을 넣지 않을 때의 기본값
CREATE TABLE my_table24
(
    col1 VARCHAR(1),
    col2 VARCHAR(2) DEFAULT 'x'
);
INSERT INTO my_table24
    (col2) VALUE ('a');
INSERT INTO my_table24
    (col1) VALUE ('a');
INSERT INTO my_table24
    (col1, col2) VALUE ('a', NULL);
DESC my_table24;

CREATE TABLE my_table25
(
    col1 INT NOT NULL UNIQUE DEFAULT 0
);

CREATE TABLE my_table26
(
    ssn     varchar(13) UNIQUE NOT NULL,
    name    varchar(10)        NOT NULL,
    age     Int DEFAULT 0,
    address VARCHAR(300)
)