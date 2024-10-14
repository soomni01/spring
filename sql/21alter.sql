USE db1;
CREATE TABLE my_table29
(
    name VARCHAR(2),
    age  INT
);

DESC my_table29;

# 컬럼 추가
ALTER TABLE my_table29
    ADD COLUMN address VARCHAR(100) NOT NULL UNIQUE;

INSERT INTO my_table29
    VALUE ('S', 22, 'london');
ALTER TABLE my_table29
    ADD COLUMN email VARCHAR(50) NOT NULL;

ALTER TABLE my_table29
    ADD COLUMN country VARCHAR(30) NOT NULL;

# 중간에 컬럼 추가하기
ALTER TABLE my_table29
    ADD COLUMN city VARCHAR(10) AFTER email;
ALTER TABLE my_table29
    ADD COLUMN ssn VARCHAR(10) FIRST;