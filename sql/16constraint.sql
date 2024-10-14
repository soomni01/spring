USE db1;
DESC my_table16;

#Constraints (제약사항)

# NULL 허용 여부
CREATE TABLE my_table17
(
    col1 VARCHAR(3),         -- NULL 허용
    col2 VARCHAR(3) NOT NULL -- NULL 허용안함
);
INSERT INTO my_table17
    (COL2) VALUE ('어떤값');
INSERT INTO my_table17
    (COL1) VALUE ('어떤값');
# 명시적 NULL
INSERT INTO my_table17
    (col1, col2) VALUE (NULL, '또다른');
INSERT INTO my_table17
    VALUE (NULL, 'abc');
INSERT INTO my_table17
    VALUE ('', '');
INSERT INTO my_table17
    VALUE (NULL, NULL);

DESC my_table17;

CREATE TABLE my_table18
(
    name  VARCHAR(100) NOT NULL,
    price INT
);



