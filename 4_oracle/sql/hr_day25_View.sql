-- View --------------------------------------
/*
CREATE or REPLACE VIEW 뷰이름
    AS SELECT ~
*/

CREATE OR REPLACE VIEW v_emp
    AS SELECT empno, ename, deptno FROM emp;

SELECT * FROM v_emp;    

-- emp 테이블 제거하면 v_emp ? O
-- v_emp 테이블 제거하면 emp ? X

CREATE VIEW v_emp_30
    AS SELECT job, ename, sal FROM emp WHERE deptno=30;

SELECT * FROM v_emp_30;

--문제1] 30번 부서 사원들의 직위, 이름, 월급을 담은 view  테이블 만들기, 별칭 직위, 사원이름, 급여로 Alias 주고
--    월급이 2000보다 많은 사원들만 추출해서 뷰 만들기
CREATE VIEW v_emp_quiz1
    AS SELECT job "직위", ename "사원이름", sal "급여" FROM emp WHERE deptno=30 and sal>2000;
SELECT * FROM v_emp_quiz1;    

--문제2] 부서별(부분합==소계) 최대급여, 최소급여, 평균급여를 갖는 뷰 만들기
CREATE VIEW v_emp_quiz2
    AS SELECT deptno, max(sal) 최대급여, min(sal) 최소급여, round(avg(sal), 2) 평균급여
    FROM emp
    GROUP BY deptno;
    
--문제3] 부서별 평균급여를 갖는 뷰를 만드는데, 평균 급여가 2000이상인 부서만 출력하세요.
CREATE VIEW v_emp_quiz3
    AS SELECT deptno "부서번호", round(avg(sal), 2) "평균급여"
    FROM emp
    GROUP BY deptno HAVING avg(SAL)>2000;

--문제4] 직위별 총급여를 갖는 뷰 테이블 만들고, 직위(job)가 manager인 사원들은 제외하고 총급여가 3000이상인 사원들 출력하기
create view v_emp_quiz4
    AS SELECT job, sal "총급여"
    FROM (SELECT job, sum(sal) sal FROM emp WHERE job != 'MANAGER' AND sal >= 3000 GROUP BY job);

-- SQL 질의어 명령은 대소문자 구분 안한다. 레코드에 대한 것은 대소문자 구분함. (오라클)

-- rownum / rowid ---------------------------
SELECT ROWNUM, ename, sal FROM emp;
SELECT ROWNUM, ename, sal FROM emp where rownum = 1;
SELECT ROWNUM, ename, sal FROM emp where rownum = 1;

SELECT ROWNUM, ename, rowid FROM emp; -- 게시판에 페이징 처리할때 사용  rownum cf) mysql - limit


-- sequence -------------
create sequence 시퀀스이름 -- 1부터 시작
    [start with 시작값]
    [increment by 증가치]
    [maxvalue 최대값]
    [minvalue 최소값]
    [cycle | nocycle ]
    [cache | nocycle ];
    
DROP SEQUENCE autonum;    
CREATE SEQUENCE autonum; -- 1부터 시작해서 1씩 증가한다

SELECT autonum.nextval FROM dual;
SELECT autonum.currval FROM dual;

CREATE TABLE kosa_tab (NO NUMBER, NAME VARCHAR2(10) );
DELETE kosa_tab;

INSERT INTO kosa_tab VALUES(autonum.nextval, 'aa');
INSERT INTO kosa_tab VALUES(autonum.nextval, 'bb');
INSERT INTO kosa_tab VALUES(autonum.nextval, 'bccc');
INSERT INTO kosa_tab VALUES(autonum.nextval, 'dd');

SELECT * FROM kosa_tab;

DROP SEQUENCE seq_board;
CREATE SEQUENCE seq_board
    START WITH 10
    INCREMENT BY 10
    MINVALUE 2
    MAXVALUE 50
    CYCLE
    NOCACHE;

CREATE TABLE kosa_tab2 (NO NUMBER, NAME VARCHAR2(10));
DELETE kosa_tab2;
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'aa');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'bb');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'bccc');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'dd');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'pppp');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'kkk');

SELECT * FROM kosa_tab2;

-- 문제1] 자동증가 시퀸스명을 seq_test 라고 지정하고 
-- 100으로 시작해서 100씩 증가하는 것을 만들고,
-- 테이블 seq_test 테이블(num, name, phone) 만들기.
-- 레코드 3개 추가해서 확인하기
CREATE SEQUENCE seq_test
    START WITH 100
    INCREMENT BY 100    
    MINVALUE 100
    MAXVALUE 5000
    CYCLE
    NOCACHE;
    
CREATE TABLE kosa_quiz (num NUMBER, name VARCHAR2(10), phone NUMBER);
INSERT INTO kosa_quiz VALUES(seq_test.nextval, '홍길동', 0000000000);
INSERT INTO kosa_quiz VALUES(seq_test.nextval, '홍길서', 0000000001);
INSERT INTO kosa_quiz VALUES(seq_test.nextval, '홍길남', 0000000002);

SELECT * FROM kosa_quiz;


