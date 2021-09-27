-- 집계(그룹) 함수
select sum(height), sum(weight) from student;
select avg(height) as 평균키, avg(weight) as 평균몸무게, max(height) as "가장 큰 키", min(height) as "가장 작은 키" from student;

select count(*) from professor;  -- count(*)로 하면 null값을 포함한 전체갯수가 나온다.
select count(bonus), count(name) from professor; 

select rank(68000000) within group(order by pay desc)
    from emp2;
    
select rank(490) within group(order by pay desc)
    from professor;    
    
select name, pay from professor order by pay desc;

select * from professor; 

select rank(90) within group(order by bonus desc)
    from professor
    where bonus is not null;    
        
-- oracle 은 null값이 우선순위가 높다.
-- mysql은 null값이 우선순위가 낮다
select name, pay, bonus from professor order by bonus desc;    

-- 학생 문제 1, 2, 3]
-- student 테이블
-- 키가 168인사람은 몇 번째로 큰지 확인
select rank(168) within group(order by height desc)
    from student
    where height is not null;    

-- 몸무게가 58인 사람은 몇 번째인지 등수 구하기
select rank(58) within group(order by weight desc)
    from student
    where weight is not null;    

-- gift table
-- g_end가 200000, 600000 보다 작은 값 출력 (any 사용할 것)
--select * from gift where g_end >= any(200000) and g_end <= any(600000);
select * from gift where g_end < any(200000, 600000);
select * from gift where g_end > any(200000, 600000);

select * from gift where g_end < all(200000, 600000);
select * from gift where g_end > all(200000, 600000);

select * from gift;

--8. 제약조건 종류
--NOT NULL 해당 컬럼에 NULL을 입력할 수 없도록	컬럼
--UNIQUE	해당 컬럼 또는 컬럼 조합 값이 유일하도록	컬럼, 테이블
--PRIMARY KEY	각 행을 유일하게 식별할 수 있도록	컬럼, 테이블
--FOREIGN KEY	다른 테이블의 기본키를 참조	컬럼, 테이블
--CHECK	해당 컬럼에 특정 조건을 항상 만족시키도록	컬럼, 테이블
--constraint 별칭 primary key, 별칭 : 테이블명_필드명_성격 예)board_id_pk
create table userlist(
    id varchar2(10) constraint id_pk primary key, -- 기본키, 중복안되고 NOT NULL 임
    name varchar2(10) -- not null 
);

select * from userlist;
insert into userlist values('kingsmile', 'doyeon');
insert into userlist(id) values('gildong');
insert into userlist(name) values('hello');

CREATE TABLE fk_member(
    code number(2) NOT NULL,
    id VARCHAR2(20) NOT NULL
    CONSTRAINT id_fk REFERENCES MEMBER(id),
    etc VARCHAR2(10)
);

select * from member;
desc member;

CREATE TABLE userlist2(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY KEY, -- 중복 안됨, null 허용 안됨
    jumin char(13) CONSTRAINT jumin_un unique -- null 허용, 중복은 안됨
);

select * from userlist2;
insert into userlist2 values('kingsmile', '1234');
insert into userlist2(id) values('gildong');
insert into userlist2(id, jumin) values('gildong2', '12345');
insert into userlist2 values('happy', '1004');

