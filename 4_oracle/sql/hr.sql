select * from tab;
select * from emp2;
select * from dept2;
select sysdate from emp2; -- 

/*
create table 테이블이름(
컬럼명 datatype [ null | not null ] [ constraint 별칭제약조건] ,
컬럼명 datatype [ null | not null ] [ constraint 별칭제약조건] ,
.....
)
*/

select * from test;
create table Test (
    name VARCHAR2(10), 
    age number(3)
);
-- insert
-- INSERT INTO 테이블명 VALUES (전체 COLUMN에 넣을 VALUE_LIST);
insert into test values('aa', 10);
insert into test(age, name) values(20, 'bb');
delete from test where name='bb';

insert into test(name) values('cc');
insert into test(age) values(33);

-- 테이블 제거 drop
drop table test;
select * from test;
create table Test (
    name VARCHAR2(10) not null, 
    age number(3)
);

-- select 명령어
select * from emp2;
select empno, name, deptno from emp2;

select * 
    from emp2
    where name like '이%'; -- % : 모든, _ : 한문자 <== like 와 함께 사용
    
select * 
    from emp2
    where name like '_정_';

select * 
    from emp2
    where name like '___'; -- 이름이 세글자인 사람 검색
    
select * 
    from professor
    where name like '__'; -- 이름이 두글자인 사람 검색
    
select * 
    from professor    
    order by name; -- 정렬 - 오름차순 : asc , 내림차순 : desc  -- 생략시 오름차순
    
select * 
    from professor    
    order by name desc, pay desc, position; -- 정렬 - 내림차순    
    
select * 
    from professor    
    order by 2 desc, 5 desc, 4;
    
select * 
    from professor    
    where deptno like '1%'
    order by 2 desc, 5 desc, 4;    
    
select name, empno--, position
    from emp2
    where position='부장';
    
select *
    from professor
    where pay >= 350
    -- where pay <= 350;
    order by pay; -- asc : 오름차순 , desc
    
select *
    from emp2
    where hobby = '독서' or hobby='등산';
    
select *
    from emp2
    where emp_type='정규직' and hobby='독서';   
    
-- as, ""등을 이용해서 별칭 만들어 두기
select empno as "사원번호", name "성   명", position 직급, pay "급   여"    
    from emp2;
    
-- || 파이프기호를 이용해 출력을 정리할 수 있다.
select name || ' ' || position || '님'
    from professor;
    
select emp_type from emp2;    
-- distinct 중복 제거
select distinct emp_type from emp2; 
    

    







