-- Sub Query --------------
-- ex) SELECT * FROM emp WHERE ename = (서브쿼리문장);
SELECT * FROM emp2;
SELECT * FROM emp2 WHERE name='백원만';
SELECT * FROM emp2 WHERE pay > 60000000;
SELECT * FROM emp2 WHERE pay > ( SELECT pay FROM emp2 WHERE name='백원만');

--문제1] emp2 평균 급여보다 작은 직원들을 출력하세요.
SELECT * 
    FROM EMP2 
    WHERE pay < ( SELECT avg(pay) FROM emp2);

--문제2] 학생 테이블에서 1학년(grade) 평균 키보다 큰 사람들 출력하세요
SELECT * 
    FROM student 
    WHERE height > ( SELECT avg(height) FROM student WHERE grade=1);

--문제3] 학생 테이블, 학과 테이블을 사용하여 이윤나 학생과 전공(deptno1)이
--    동일한 학생들의 이름과 학과 이름을 출력하세요
SELECT name "이름", dname "학과이름"
    FROM student LEFT JOIN department
    ON deptno1 = deptno
    WHERE deptno1 = ( SELECT deptno1 FROM student WHERE name='이윤나');


--문제4] 교수 테이블에서 입사일이 송도권 교수보다 나중에 입사한 사람의 이름, 입사일, 학과명을 출력하시오
SELECT NAME "이름", hiredate "입사일", dname "학과명"
    FROM professor LEFT JOIN department
    ON professor.deptno = department.deptno
    WHERE hiredate > ( SELECT hiredate FROM professor WHERE NAME='송도권');


--문제5] 학생 테이블에서 전공이 101인 학과의 평균 몸무게보다 몸무게가 많은 학생들의 이름과 몸무게를 출력하세요.
SELECT NAME "이름", WEIGHT "몸무게"
    FROM student
    WHERE weight > (SELECT AVG(weight) FROM student WHERE deptno1 = 101);
    
-- 서브쿼리의 결과가 한 개 이상 반환될때는 in, any, all 연산자를 사용함.
SELECT empno, name, deptno
    from emp2
    where deptno in (1000, 1001, 1002, 1010, 2000, 2001);
    
SELECT dcode FROM dept2 WHERE area='서울지사';

SELECT empno, name, deptno
    FROM emp2
    WHERE deptno in(select dcode from dept2 where area='서울지사');
    
--1. EMP2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 연봉이 
--    높은 사람의 이름과 직급,연봉을 출력하세요. 
--    단 연봉 출력 형식은 아래와 같이 천 단위 구분기호와 원 표시를 하세요
SELECT * FROM EMP2;
SELECT name "이름", position "직급", TO_CHAR(pay, 'L999,999,999')"연봉" 
    FROM emp2
    WHERE pay > ( SELECT min(pay) FROM emp2 WHERE position='과장');

--2. student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 가장 적게 나가는 학생보다 적은 학생의 이름과 학년과 몸무게를 출력.
SELECT * FROM student;
SELECT name "이름", grade "학년", weight "몸무게"
    FROM student
    WHERE height < ( SELECT min(height) FROM student WHERE grade=4);

--3. student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력.
SELECT grade "학년", name "이름", height "키"
    FROM student
    WHERE (grade, height) in ( SELECT grade, max(height) FROM student group by grade);

--4. professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름, 입사일, 학과명을 출력. 
--    단, 학과명순으로 오름차순 정렬.    

