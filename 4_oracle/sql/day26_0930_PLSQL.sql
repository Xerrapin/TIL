-- PL/SQL
/*
Declare - 선언 (선택)
Begin
    실행(필수)
End;
*/

Begin
    DBMS_output.put_line('jaehyeok'); -- 출력
End;
------------------------------------------------
DECLARE
    vno number(4);
    vname VARCHAR2(20);
BEGIN
    SELECT empno, name 
            INTO vno, vname
        FROM emp2
        WHERE empno = &empno;  -- 변수처럼 가져온다.
        DBMS_OUTPUT.PUT_line('입력값 : ' || vno || ' <---> ' || vname );
END;
------------------------------------------------
SELECT * from emp2;

CREATE OR REPLACE PROCEDURE p_test(name IN VARCHAR2)
IS
    BEGIN
        DBMS_output.put_line(name || '님 시험 합격입니다');
    END;

exec p_test('임재혁');
exec p_test('kingsmile');
------------------------------------------------
SELECT * FROM userlist;
DROP TABLE userlist;

CREATE OR REPLACE PROCEDURE p_userlist(
        id IN userlist.id%TYPE := 'jaehyeok', 
        name IN userlist.name%TYPE DEFAULT '연아',
        age IN userlist.age%TYPE := 10,
        addr in userlist.addr%TYPE := null
    )
IS
    BEGIN
        INSERT INTO userlist values(id, name, age, addr);
        DBMS_output.put_line('insert 정보는 ' || id || name || age || addr);
    END;



--CREATE TABLE userlist(
--    id VARCHAR2(10),
--    name VARCHAR2(20),
--    age NUMBER,
--    addr VARCHAR2(50)
--);

desc emp;    
------------------------------------------------
exec p_userlist('yuna', '강감찬', 20, '서울');   -- 전체 필드 추가    
exec p_userlist;    -- default data input 
exec p_userlist(id=>'박보검', age=>50);    -- 원하는 필드값만 추가 가능
SELECT * FROM userlist;   

BEGIN
    FOR i IN 1..10 LOOP
        INSERT INTO userlist(age) VALUES(i);
    END LOOP;
END;    

------------------------------------------------    
-- 문제] PL/SQL 로
SELECT s.name, p.name, d.dname
    FROM professor p JOIN student s
    ON p.deptno = s.deptno1 JOIN department d
    ON d.deptno = s.deptno1
    -- WHERE s.deptno1 = 103;
    WHERE d.dname = '컴퓨터공학과';
    