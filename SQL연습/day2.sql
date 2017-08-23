-- 현재 계정의 table들을 보기
SELECT * FROM tab;

-- table 내용 보기
SELECT * FROM EMPLOYEES;
SELECT first_name, to_char(hire_date, 'mm/dd/yyyy') FROM EMPLOYEES;

-- mm/dd/yy
-- mm/dd/rr		(0~49까지는 2000년대, 50~99까지는 1900년대)
-- mm/dd/yyyy

-- table 구조 보기
desc EMPLOYEES


SELECT sysdate, 10 + 20 FROM dual;

SELECT employee_id, first_name, salary FROM EMPLOYEES;

-- 직원들이 근무하는 부서 정보
SELECT DISTINCT department_id FROM EMPLOYEES;

SELECT employee_id as "직원 번호", first_name 이름, salary 급여, department_id 부석코드 FROM employees;



SELECT * FROM emp;

-- nvl( , ) null일때 원하는 값으로 지정
SELECT first_name, 
	salary, 
	commission_pct, 
	salary+salary*nvl(commission_pct, 0) 급여 
	FROM employees
	WHERE commission_pct is not null;

-- nvl2(칼럼, 칼럼의 값이 null이 아닌 경우 대치값, 칼럼의 값이 null인 경우 대치값)
SELECT first_name, 
	salary, 
	commission_pct, 
	salary+salary*nvl2(commission_pct, 1, 2) 급여 
	FROM employees;

CREATE TABLE book(
	title varchar2(100) not null,
	price number
);

INSERT INTO book(title) values('자바의 정석');
INSERT INTO book(title, price) VALUES('Oracle', 20000);
SELECT * FROM book;

SELECT title, nvl(price, 0), nvl2(price, 30000, 10000)
	FROM book;

CREATE TABLE book2(
	title varchar2(10) not null,
	publisher char(10),
	price number
);

INSERT INTO book2(title) values('123456789');
INSERT INTO book2(title, publisher, price) VALUES('오라클', '호날두', 30000);

SELECT title, nvl(price, 0), nvl2(price, 30000, 10000) FROM book2;

SELECT title, length(title), lengthB(title), publisher, price FROM book2;

SELECT first_name ||' '|| last_name 이름 
FROM employees
WHERE first_name = 'David';

SELECT first_name 이름, salary 급여 --3
FROM employees			-- 1
WHERE salary >= 5000	-- 2, salary대신 급여 쓰면 안됨
ORDER BY 2 DESC;	-- 4, salary 기준으로 내림차순, 별명이나 위치(2)를 넣을 수 있다 



SELECT first_name 이름, salary 급여, commission_pct
FROM employees
ORDER BY 3 nulls first;

SELECT first_name 이름, salary 급여, commission_pct
FROM employees
ORDER BY 3 DESC nulls last;

SELECT *
FROM employees
WHERE hire_date >= to_date('2007/01/01')	-- 형변환
AND (department_id = 50
OR salary >=5000);

SELECT *
FROM employees
WHERE NOT department_id = 80;

SELECT *
FROM employees
WHERE salary >= 5000 AND salary <= 10000;

-- BETWEEN
SELECT *
FROM employees
WHERE salary BETWEEN 5000 AND 10000;	-- 쓴 데이터도 포함

-- OR
SELECT *
FROM employees
WHERE salary BETWEEN 5000 AND 10000	-- 쓴 데이터도 포함
AND (commission_pct = 0.3 OR commission_pct = 0.2 OR commission_pct = 0.1); -- 괄호 필요

-- IN
SELECT *
FROM employees
WHERE salary BETWEEN 5000 AND 10000	-- 쓴 데이터도 포함
AND commission_pct in (0.1, 0.2, 0.3);


SELECT *
FROM employees
WHERE first_name LIKE 'A%'
AND last_name LIKE '%n'
AND email LIKE '__U%'	-- 3번째 문자가 U여야 한다,asc


SELECT *
FROM employees
ORDER BY salary DESC,  ASC;


















