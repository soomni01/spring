USE db1;
CREATE TABLE my_table58
(
    name  VARCHAR(30),
    money INT
);

INSERT INTO my_table58
VALUES ('kim', 10000),
       ('lee', 10000);

# kim -> lee 500원 송금
UPDATE my_table58
SET money = money - 500
WHERE name = 'kim';
UPDATE my_table58
SET money = money + 500
WHERE name = 'lee';

SELECT *
FROM my_table58;

# transaction : 하나의 업무단위(모두 실패, 또는 모두 성공)

COMMIT; # 반영
ROLLBACK;
# 되돌리기

# kim -> lee 500원 송금
UPDATE my_table58
SET money = money - 500
WHERE name = 'kim';

UPDATE my_table58
SET money = money + 500
WHERE name = 'lee';

# db에 반영
COMMIT;

# 마지막 커밋으로 되돌리기
ROLLBACK;

# kim -> lee 1000원 송금
# 시나리오1) kim 계좌에서 1000원 차감되고 롤백
# 시나리오2) kim 계좌에서 1000원 차감, lee 계좌에서 1000원 증액 커밋
