# 정규화 : normalization
# 중복을 줄이고 데이터 무결성 유지를 위한 프로세스

# First Normal Form (1NF)
#   모든 레코드는 고유해야 한다
#   원자성 보장(모든 속성은 단일 값만 가져야한다)

# Second Normal Form (2NF)
#   1NF 만족하고
#   부분적 함수 종속이 없어야함

# Third Normal Form (3NF)
#   2NF 만족하고
#   이행적 종속이 없어야함


USE db1;
#   모든 레코드는 고유해야 한다
# Primary Key 컬럼이 있어야한다
# 적어도 하나의 UNIQUE NOT NULL 컬럼이 있어야함
CREATE TABLE my_table30
(
    title  VARCHAR(20),
    author VARCHAR(20),
    price  INT
);
INSERT INTO my_table30
VALUES ('소년이 온다', '한강', 10000),
       ('채식주의자', '한강', 20000),
       ('git', 'linus', 30000);
SELECT *
FROM my_table30;
INSERT INTO my_table30
    VALUE ('소년이 온다', '한강', 10000);

ALTER TABLE my_table30
    ADD COLUMN isbn VARCHAR(10) UNIQUE;
ALTER TABLE my_table30
    MODIFY COLUMN isbn VARCHAR(10) UNIQUE NOT NULL;
DROP TABLE my_table30;
CREATE TABLE my_table30
(
    isbn   VARCHAR(10) UNIQUE NOT NULL,
    title  VARCHAR(20),
    author VARCHAR(20),
    price  INT
);
INSERT INTO my_table30
VALUES ('1341324', '소년이 온다', '한강', 10000),
       ('1234123', '채식주의자', '한강', 20000),
       ('1451312', 'git', 'linus', 30000),
       ('6212344', '소년이 온다', '한강', 10000);
SELECT *
FROM my_table30;
DESC my_table30;
CREATE TABLE my_table31
(
    isbn   VARCHAR(10) PRIMARY KEY,
    title  VARCHAR(20),
    author VARCHAR(20),
    price  INT
);
DESC my_table30;
DESC my_table31;

CREATE TABLE my_table32
(
    student_number INT PRIMARY KEY,
    name           VARCHAR(20),
    gender         VARCHAR(1),
    age            INT
);

# Primary Key 조건
#   Null이 될 수 없음
#   레코드 삽입시 생성되어야함
#   가능한 compact(간단) 해야함
#   변경되지 않아야함
#   -> 가장 좋은 PK는 인위적으로 생성된 컬럼

CREATE TABLE my_table33
(
    id      VARCHAR(10) PRIMARY KEY,
    ssn     VARCHAR(13),
    name    VARCHAR(20),
    address VARCHAR(20),
    gender  VARCHAR(20)
);
INSERT INTO my_table33
VALUES (1, '1234', 'kim', 'seoul', 'm'),
       (2, '3456', 'lee', 'london', 'f'),
       (3, '6789', 'choi', 'jeju', 'm');

SELECT *
FROM my_table33;

# AUTO_INCREMENT
CREATE TABLE my_table34
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20)
);
INSERT INTO my_table34
    (name)
VALUES ('kim'),
       ('lee'),
       ('choi');
SELECT *
FROM my_table34;
INSERT INTO my_table34
    (name)
VALUES ('park');


# 모든 속성은 단일 값을 가져야한다(원자성, atomic)
DROP TABLE my_table35;
CREATE TABLE my_table35
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30)
);
CREATE TABLE my_table36
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    t35_id INT,
    skill  VARCHAR(100)
);
# kim : java, css, js
# lee : java, html
# park : js, react
# choi : java
INSERT INTO my_table35
    (name)
VALUES ('kim'),
       ('lee'),
       ('park'),
       ('choi');
SELECT *
FROM my_table35;
SELECT *
FROM my_table36;
INSERT INTO my_table36
    (t35_id, skill)
VALUES (1, 'java'),
       (1, 'css'),
       (1, 'js'),
       (2, 'java'),
       (2, 'html'),
       (3, 'js'),
       (3, 'react'),
       (4, 'java');

SELECT *
FROM my_table36;

# 정규화로 여러 테이블이 생성되었을 때
# 여러 테이블을 결합(JOIN) 해서 조회
SELECT t35.name, t36.skill
FROM my_table35 t35
         JOIN my_table36 t36 ON t35.id = t36.t35_id;

CREATE TABLE my_table37
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30)
);
CREATE TABLE my_table38
(
    t37_id INT REFERENCES my_table37 (id), -- Foreign Key (외래키)
    tel    VARCHAR(30)
);
INSERT INTO my_table37
    (name)
VALUES ('kim'),
       ('lee');
SELECT *
FROM my_table37;
INSERT INTO my_table38
    (t37_id, tel)
VALUES (1, '222-3333'),
       (1, '333-4444'),
       (2, '555-6666');
SELECT *
FROM my_table38;
INSERT INTO my_table38
    (t37_id, tel)
VALUES (3, '999-0000');



#   부분적 함수 종속이 없어야함
# 부분적 함수 종속 : 키가 아닌 컬럼이 키컬럼 일부에 종속됨

# -> 인위적 PK 컬럼 생성시 2NF 만족


#   이행적 종속이 없어야함
# 이행적 종속 : 키가 아닌 컬럼끼리 종속
# -> 새 테이블 생성



