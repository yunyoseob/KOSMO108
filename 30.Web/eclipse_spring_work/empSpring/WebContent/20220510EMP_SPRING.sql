CREATE TABLE EMP_SPRING(
    EMPNO VARCHAR2(20),
    ENAME VARCHAR2(100),
    HIREDATE DATE
);

SELECT*FROM EMP_SPRING;

INSERT INTO EMP_SPRING(EMPNO, ENAME, HIREDATE)
VALUES ('1111','1111',SYSDATE);

ROLLBACK;