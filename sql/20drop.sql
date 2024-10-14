USE db1;

CREATE TABLE my_table27
(
    col1 INT
);
# 매우 주의!
DROP TABLE my_table27;

CREATE TABLE my_table28
(
    col1 INT UNIQUE,
    col2 VARCHAR(10)
);
DROP TABLE my_table28;
