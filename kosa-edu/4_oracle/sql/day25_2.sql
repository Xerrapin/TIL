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















