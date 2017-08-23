-- employees 쓰면 107건 가져옴
SELECT 1 + 2, floor(3.141592) 무조건버림, 
	trunc(3.941, 1) 무조건버림2,
	trunc(123.951, -1) 무조건버림3,
	ceil(3.15) 무조건정수로올림,
	round(3.4) 반올림,
	round(3.46, 1) 반올림2,
	round(125.46, -1) 반올림3
FROM dual;


--concat은 세자리는 안됨
SELECT first_name, lower(first_name), upper(first_name),
	email, initcap(email), initcap('oracle db'),
	first_name||'♡'||last_name 이름,
	concat(concat(first_name, '♡'), last_name) 이름2,
	substr(first_name, 2, 3) "2부터3개",
	substr('정진입니다.', 2, 3) "2부터3개(2)",
	substrB(first_name, 2, 3) "2부터3개(3)",
	substrB('정진입니다.', 4, 3) "2부터3개(4)"
FROM employees;

SELECT length('정진') 길이,
	lengthB('정진') 길이2,
	instr('Oracle DataBase', 'a', 4, 2) 위치찾기
FROM dual;

SELECT lpad(first_name, 20, '#') 왼쪽채우기,
	rpad(first_name, 20, '#') 오른쪽채우기
FROM employees;

SELECT ltrim(first_name,'A') 왼쪽자르기,
	rtrim(first_name, 'n') 오른쪽자르기,
	trim('n' from 'nnnnnnOraclennnnnnn') 양쪽자르기
FROM employees

SELECT sysdate, sysdate - hire_date 일수,
	months_between(sysdate, hire_date) 월수,
	months_between(sysdate, hire_date)/12 년수,
	hire_date,
	to_char(hire_date, 'DAY') 요일,
	last_day(hire_date) 말일,
	next_day(hire_date, '토요일'),
	round(hire_date, 'yyyy') 년도반올림,
	add_months(sysdate, 4) 개월add
FROM employees;

SELECT to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss DAY PM')
FROM dual

SELECT first_name, to_char(salary, 'L999,999') 급여1, 
	first_name, to_char(salary, 'L000,000') 급여2,
	trunc(hire_date - to_date('1998/01/01')) 일수
FROM employees


-- 직원의 부서가 10이면 A부서, 
-- 20이면 B부서
-- 그렇지 않으면 나머지는 C부서

-- 급여가 20000이상이면 A, 10000~19999 B, 나머지는 C
SELECT department_id,
	decode(department_id, 10, 'A부서',
						20, 'B부서',
						'C부서') 부서,
	decode(trunc(salary/10000), 2, 'A', 1, 'B', 0, 'C') 등급,
	case when salary >= 20000 THEN 'A'
		when salary >= 10000 AND salary < 20000 THEN 'B'
		else 'C' END 등급2
FROM employees;


--------------- 집계 함수
SELECT count(*) 건수,	-- null포함
	count(employee_id) 건수2,
	count(department_id) 건수3,	-- null 포함 안됨
	count(commission_pct) 건수4,
	count(DISTINCT department_id) 건수5,	-- null 제거
	sum(salary) 급여합계,
	avg(salary) 급여평균,
	sum(salary) / count(salary),
	max(salary) 최대급여,
	min(salary) 최소급여
FROM employees

SELECT count(DISTINCT department_id)
FROM employees

SELECT salary
FROM employees
ORDER BY salary ASC


SELECT department_id 부서,
	count(*) 건수,	-- null포함
	count(employee_id) 건수2,
	count(department_id) 건수3,	-- null 포함 안됨
	count(commission_pct) 건수4,
	count(DISTINCT department_id) 건수5,	-- null 제거
	sum(salary) 급여합계,
	avg(salary) 급여평균,
	sum(salary) / count(salary),
	max(salary) 최대급여,
	min(salary) 최소급여
FROM employees
GROUP BY department_id

SELECT job_id, sum(salary), avg(salary), count(*), max(salary)
FROM employees
WHERE employee_id > 0
GROUP BY job_id
HAVING count(*) >= 5	-- GROUP에 대한 조건
ORDER BY 5 DESC


--- 부서별, 직업별 급여합계를 출력한다.

SELECT department_id, job_id, sum(salary)
FROM employees
GROUP BY rollup(department_id, job_id)	-- 각자의 합계도 구함
ORDER BY department_id

SELECT department_id, job_id, sum(salary)
FROM employees
GROUP BY cube(department_id, job_id)	-- 모든 경우의 합계를 구함
ORDER BY department_id




















