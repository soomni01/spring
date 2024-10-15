USE db1;
# my_table39
# 학생 정보
# 이름, 성별, 연락처(여러개), 나이
CREATE TABLE my_table39
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(30) NOT NULL DEFAULT '홍길동',
    gender VARCHAR(1)  NOT NULL DEFAULT '0',
    age    INT         NOT NULL DEFAULT 0
);
# my_table
# 학생 전화번호
CREATE TABLE my_table40
(
    student_id INT          NOT NULL,
    phone      VARCHAR(100) NOT NULL,
    PRIMARY KEY (student_id, phone),
    FOREIGN KEY fk1 (student_id) REFERENCES my_table39 (id)
);

INSERT INTO my_table39
    (name, gender, age)
VALUES ('kim', 'm', 30),
       ('lee', 'f', 20),
       ('park', 'm', 15);
SELECT *
FROM my_table39;
INSERT INTO my_table40
VALUES (1, '999-8888'),
       (1, '888-7777'),
       (2, '777-6666');