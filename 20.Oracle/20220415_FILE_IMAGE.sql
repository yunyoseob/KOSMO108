CREATE TABLE KOS_FILE_IMAGE (    
     FNUM   VARCHAR2(20) PRIMARY KEY 
    ,FNAME  VARCHAR2(200)
    ,FPATH  VARCHAR2(300)
    ,INSERTDATE DATE
    ,UPDATEDATE DATE    
);

DELETE FROM KOS_FILE_IMAGE;
COMMIT;
SELECT * FROM KOS_FILE_IMAGE WHERE FNUM=2;

/*
������ 
CREATE SEQUENCE [��������]
INCREMENT BY [N] -- ���� ����
START WITH [N] -- ���� ����
MINVALUE [N] -- �ּҰ�
MAXVALUE [N] -- �ִ밪                               
CYCLE OR NOCYCLE -- CYCLE ������ �ִ밪�� �����ϸ� �ּҰ����� �ٽ� ���� NOCYCLE ������ �ִ밪 ���� �� ������ ��������
CACHE OR NOCACHE -- CACHE ������ �޸𸮿� ������ ���� �̸� �Ҵ��ϰ� NOCACHE ������ ���������� �޷θ��� �Ҵ����� ����
*/

CREATE SEQUENCE KOS_FILE_IMAGE_SEQ
INCREMENT BY 1
START WITH 1
MAXVALUE 9999;

-- ��ȯ���� ���� 
-- �޸𸮿� �������� �̸� �Ҵ�;

INSERT INTO KOS_FILE_IMAGE (FNUM, FNAME, FPATH, INSERTDATE, UPDATEDATE) 
VALUES (KOS_FILE_IMAGE_SEQ.NEXTVAL, '11', '11', SYSDATE, SYSDATE);

--�ش� ������ �� ��ȸ
SELECT KOS_FILE_IMAGE_SEQ.CURRVAL FROM DUAL; 
--��ü ������ ��ȸ
SELECT * FROM USER_SEQUENCES;  

INSERT INTO KOS_FILE_IMAGE (FNUM, FNAME, FPATH, INSERTDATE, UPDATEDATE) VALUES ('11', '11', '11', SYSDATE, SYSDATE);

ROLLBACK;
COMMIT;
UPDATE KOS_FILE_IMAGE SET FNAME = 'test';