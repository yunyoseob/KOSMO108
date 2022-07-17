--��û������                                       
                                                                                        not null
1 	ȸ����ȣ	    MNUM	VARCHAR2	    (20)	        O		
2 	ȸ���̸�	    MNAME	VARCHAR2	    (50)			
3 	���̵�	    MID	    VARCHAR2	    (50)			     O
4 	�н�����	    MPW	    VARCHAR2	    (300)		 O
5 	�ڵ�����ȣ	MHP	    VARCHAR2	    (16)			 O
6 	�̸���	    MEMAIL	VARCHAR2	    (200)		 O
7 	����	        MGENDER	VARCHAR2	    (10)			
8 	���  	    MHOBBY	VARCHAR2	    (100)			
9 	����	        MLOCAL	VARCHAR2	    (200)			
10 	����	        MMSG	VARCHAR2	    (2000)			
11 	ȸ������	    DELETEYN	VARCHAR2      1	  O
12 	�����	    INSERTDATE	DATE	      -			
13 	������	    UPDATEDATE	DATE	      -		


CREATE TABLE KOS_MEMBER (
     MNUM	    VARCHAR2(20)	PRIMARY KEY  --ȸ����ȣ
    ,MNAME      VARCHAR2(20)                 --ȸ���̸�
    ,MID	    VARCHAR2(50)	NOT NULL     --���̵�	           
    ,MPW	    VARCHAR2(300)	NOT NULL     --�н�����
    ,MHP	    VARCHAR2(16)	NOT NULL     --�ڵ�����ȣ	
    ,MEMAIL	    VARCHAR2(200)	NOT NULL     --�̸���  
    ,MGENDER	VARCHAR2(10)                 --����
    ,MHOBBY	    VARCHAR2(100)                --���
    ,MLOCAL	    VARCHAR2(200)                --����
    ,MMSG	    VARCHAR2(2000)               --����
    ,DELETEYN	VARCHAR2(1)	    NOT NULL     --ȸ������
    ,INSERTDATE	DATE                         --�����
    ,UPDATEDATE	DATE                         --������
);

--TEST ���� 
INSERT INTO KOS_MEMBER(MNUM,MNAME,MID,MPW,MHP,MEMAIL,MGENDER,MHOBBY,MLOCAL,MMSG,DELETEYN,INSERTDATE,UPDATEDATE)
VALUES (123,'PGW','RIVEF','123','01023351912','RIVENF@NAVER.COM','M','BIKE','SEOUL','MSG','Y',SYSDATE,SYSDATE);
COMMIT;

--@@@@@@@@@��üȸ���˻�(����������) getKOSSelectAll()@@@@@@@@@
--'Y'ȸ���� �˻�
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM KOS_MEMBER A
WHERE DELETEYN='Y';

--@@@@@@@@@ȸ����ȣ�˻� getKOSSelectNum()@@@@@@@@@
--Yȸ�����˻�, LIKE�˻�
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM    KOS_MEMBER A
WHERE   1+1=2
AND     DELETEYN='Y';
AND     A.MNUM LIKE '%?%';

--@@@@@@@@@ȸ���̸��˻� getKOSSelectName()@@@@@@@@@
--Yȸ���� �˻�, LIKE�˻�
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM  KOS_MEMBER A
WHERE 1+1=2
AND   DELETEYN='Y';
AND   A.MNAME LIKE UPPER('%?%');

--@@@@@@@@@ȸ����¥�˻� getKOSSelectDate();@@@@@@@@@
--YYYY-MM-DD���
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM  KOS_MEMBER A
WHERE 1+1=2
AND   DELETEYN='Y';
AND   TO_CHAR(TO_DATE(A.INSERTDATE),'YYYY-MM-DD')>=TO_CHAR(TO_DATE(?),'YYYY-MM-DD')
AND   TO_CHAR(TO_DATE(A.INSERTDATE),'YYYY-MM-DD')<=TO_CHAR(TO_DATE(?),'YYYY-MM-DD');

--@@@@@@@@@ȸ���߰� getKOSInsert(); @@@@@@@@@
--���̺���� �Ұ���, UPDATEDATEĮ���� NULL�� ó��(UPDATE�� SYSDATE�� �����ϵ��� ��)
--�ű� �ߺ�ȸ���� PK�� ������ ��
INSERT INTO KOS_MEMBER
            (
             MNUM    ,MNAME    ,MID
            ,MPW     ,MHP      ,MEMAIL
            ,MGENDER ,MHOBBY   ,MLOCAL
            ,MMSG    ,DELETEYN ,INSERTDATE
            ,UPDATEDATE
            )
VALUES      (
             '?',   UPPER('?')  ,'?'
            ,'?'      ,'?'      ,'?' 
            ,'?'      ,'?'      ,'?'
            ,'?'      ,'?'      ,SYSDATE
            ,NULL
            );

--@@@@@@@@@ȸ��������Ʈ getKOSUpdate();@@@@@@@@@
--������Ʈ �� �ʱ� NULL�� SYSDATE�� �����ϰ� ��
UPDATE  KOS_MEMBER A
SET     
        A.MNAME   =  UPPER('?')    
        A.MID     =  '?'
        A.MPW     =  '?'
        A.MHP     =  '?'
        A.MEMAIL  =  '?'
        A.MGENDER =  '?'
        A.MHOBBY  =  '?'
        A.MLOCAL  =  '?'
        A.MMSG    =  '?'
        A.UPDATEDATE = SYSDATE
WHERE   1+1=2
AND     A.MID = '?'
AND     A.MPW = '?';

--@@@@@@@@@ȸ������ getKOSDelete();@@@@@@@@@
--Yȸ���� �˻�
UPDATE  KOS_MEMBER A
SET     A.DELETEYN='N'
       ,A.UPDATEDATE=SYSDATE
WHERE   1+1=2
AND     A.DELETEYN='Y'
AND     A.MID = '?'
AND     A.MPW = '?';

