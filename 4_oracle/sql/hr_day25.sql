-- decode
SELECT deptno, DECODE(deptno, 10 , 'ACCOUNTING' ,
                              20 , 'RESEARCH' ,
                              30 , 'SALES', 'OPERATIONS') name
  FROM dept;


SELECT deptno, DECODE(deptno, 10 , SUM(sal),
??????????????????????????????20 , MAX(sal),
??????????????????????????????30 , MIN(sal),
                              40 , avg(sal)) sal
??FROM emp
?GROUP BY deptno; 

SELECT deptno, DECODE(deptno, 10 , SUM(sal),
??????????????????????????????20 , MAX(sal),
??????????????????????????????30 , MIN(sal)) sal
??FROM emp
?GROUP BY deptno; 


SELECT deptno, 
       CASE deptno
         WHEN 10 THEN 'ACCOUNTING'
         WHEN 20 THEN 'RESEARCH'
         WHEN 30 THEN 'SALES'
         ELSE 'OPERATIONS'
       END as "Dept Name"
  FROM dept;

 
SELECT * FROM emp;

-- 테이블 복사   
/* 형식>
create table 테이블이름
    select 컬럼명, ... from 테이블이름
*/


create table c_emp
    as select * from emp;
    
create table c_emp_20
    as select * from emp where deptno=20;
    
create table c_emp_30
    as select empno 번호, ename 이름, job 직업, sal 급여
        from emp where deptno=30;
    
--문제1] 교수테이블에서 전임강사만 추출해서 테이블 생성하기
select * from professor;

create table professor2
    as select * from professor where position='전임강사';

select * from professor2;

--문제2] emp(직원) 테이블에서 mgr(매니저번호)가 7566번인 사람만 추출해서 새로운 테이블 생성하기
select * from emp;
    
create table c_emp_7566
    as select * from emp where mgr=7566;
    
select * from c_emp_7566;    

create table c_emp3
    as select * from emp where 1=0;
    
create table c_emp4
    as select * from emp
        order by ename desc, sal desc, empno asc;
    
select * from c_emp4;

desc demp2;

select * from c_emp; -- 전체복사
select * from c_emp_20; -- 조건(부서번호가 20번인 레코드) 에 맞게 테이블 생성
select * from c_emp3; -- 구조물만 복사 (레코드 복사 제외)
select * from c_emp_30; -- empno, ename, job, sal 원하는 필드만 복사

-- UNION -- pk / fk 아닌 상태 테이블 합치기 -----------------------------------
SELECT * FROM emp
    UNION -- 중복 레코드 제거하고 합쳐서 보여줌
SELECT * FROM c_emp;

insert into c_emp(empno, ename, deptno) values(303, '도연', 40);

SELECT * FROM emp
    UNION All -- 중복 레코드 포함해서 합쳐서 보여줌
SELECT * FROM c_emp;

SELECT * FROM emp -- #error# 필드 개수 맞춰야 함.
    UNION
    SELECT * FROM c_emp_30;

SELECT empno, ename, job, sal FROM emp -- 필드 개수
    UNION
    SELECT * FROM c_emp_30;
    
desc emp;    

--문제4] 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되
--    컬럼명을 New Salary로 지정하여 출력하시오.
SELECT empno "사원번호", ename "이름", sal "급여" , round((sal*1.15), 0) "NEW Salary"
    FROM emp;
    
--문제5]각 사원의 이름을 표시하고, 근무 달 수를 계산하여 컬럼명을 
--     Months_Works로 지정하고, 근무 달수를 기준으로 오래된 사람부터
--     정렬하여 출력하시오.
SELECT emp.ename "이름", hiredate, TRUNC(MONTHS_BETWEEN(TO_DATE(emp.HIREDATE, 'YY-MM-DD'), SYSDATE)) "Months_Works" 
    FROM DUAL, EMP
    ORDER BY "Months_Works" desc ;
    
--문제6]사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은 
--    사원의 커미션은 'no commission'으로 출력하시오.
SELECT ename "이름", decode(comm, null, 'no commission', comm) "커미션" 
    FROM emp;
    
SELECT ename, nvl(CAST(comm as VARCHAR2(20)), 'no commission') "comm" 
    FROM emp;

/* 형식>
insert into 테이블이름
    select 컬럼명, ... from 테이블이름
*/

SELECT * FROM c_emp3;

INSERT INTO c_emp3
    SELECT * FROM emp;
    
ROLLBACK;
INSERT INTO c_emp3 -- 필드 개수, 타입 맞아야 함
    SELECT empno, ename from emp;
    
CREATE TABLE c_emp5
    AS SELECT empno, hiredate, sal 
    FROM emp
    WHERE 1=0;
    
SELECT * FROM c_emp5;

SELECT * FROM emp2;
INSERT INTO c_emp5 -- 필드 개수, 타입 맞아야함
    SELECT empno, birthday, pay -- 필드와 타입크기까지 맞다면 다른 테이블의 레코드도 삽입 가능
    FROM emp2;
    
    
    
    