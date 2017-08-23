-- cross join, 표준 문법은 아님. DB vender 문법
SELECT *
FROM employees, departments
ORDER BY 1

-- 107
-- 27
SELECT * FROM departments


-- equi join
SELECT *
FROM employees, departments
WHERE employees.department_id = departments.department_id(+)	-- + 쓰면 outer join
ORDER BY 1

-- ANSI
SELECT *
FROM employees LEFT OUTER JOIN departments	-- INNER는 생략해도 됨, 왼쪽이 기준이면 LEFT OUTER JOIN
ON employees.department_id = departments.department_id
ORDER BY 1

-- ANSI
-- 중복된 부분 하나만?
-- 같은 애는 한번만 쓰기 때문에 누구꺼라고 명시해서 부르면 안됨
SELECT *
-- 오른쪽이 기준인 RIGHT OUTER JOIN
FROM departments RIGHT OUTER JOIN employees USING (department_id)
WHERE department_id > 0	-- 둘다의 것이므로 이렇게 씀
ORDER BY 1


-- first_name이 Steven인 직원의 부서 이름을 출력
SELECT first_name, last_name, salary, hire_date, department_name, employees.department_id
FROM employees, departments
WHERE employees.department_id = departments.department_id
AND first_name = 'Steven'


SELECT e.first_name, e.last_name, e.salary, e.hire_date, department_name, e.department_id
FROM employees e, departments d
WHERE first_name = 'Steven'
AND e.department_id = d.department_id

-- ANSI 표준
SELECT e.first_name, e.last_name, e.salary, e.hire_date, department_name, e.department_id
FROM employees e JOIN departments d
ON e.department_id = d.department_id
WHERE e.first_name = 'Steven';

-- 더 간단하게
-- 나중에 누구 id인줄 모르는 경우가 있을수도?
-- 위에 방법이 더 낫다
SELECT e.first_name, e.last_name, e.salary, e.hire_date, department_name, department_id
FROM employees e JOIN departments d
USING (department_id)		-- 앞에 테이블 이름 쓰지 않음!!!
WHERE e.first_name = 'Steven'


-- scott
SELECT * 
FROM emp

SELECT *
FROM dept

SELECT ename, dname
FROM emp, dept
WHERE job = 'MANAGER'
AND emp.deptno = dept.deptno	-- JOIN 조건

SELECT ename, dname
FROM emp JOIN dept
ON emp.deptno = dept.deptno
WHERE emp.job = 'MANAGER'

SELECT *
FROM salgrade

-- 신기하다
SELECT ename, sal, grade
FROM emp, salgrade
WHERE sal BETWEEN losal AND hisal

-- 입사일 2000/01/01 2002/12/31	'고참'
-- 입사일 2003/01/01 2005/12/31	'선배'
-- 입사일 2006/01/01 2010/12/31	'친구'


-- hr

CREATE TABLE 짬밥(
	title varchar2(6),
	sdate date,
	edate date
)

--- 직원 짬밥의 title을 출력
INSERT INTO 짬밥(title, sdate, edate) values('고참', '2000/01/01', '2002/12/31');
INSERT INTO 짬밥(title, sdate, edate) values('선배', '2003/01/01', '2005/12/31');
INSERT INTO 짬밥(title, sdate, edate) values('친구', '2006/01/01', '2010/12/31');
INSERT INTO 짬밥(title) values('이웃');
INSERT INTO 짬밥(title, sdate) values('동네', '2011/01/01');

SELECT *
FROM 짬밥

SELECT first_name, hire_date, title
FROM employees, 짬밥
WHERE employees.hire_date >= 짬밥.sdate
AND employees.hire_date <= 짬밥.edate

-- table 지우기
DROP TABLE 짬밥;
-- data 지우기
DELETE FROM 짬밥;	



SELECT employee_id, first_name, manager_id
FROM employees
ORDER BY 3


--- SELF JOIN
SELECT 직원.employee_id, 직원.first_name 직원이름, 
	상사.employee_id, 상사.first_name 상사이름
FROM employees 직원, employees 상사
WHERE 직원.manager_id = 상사.employee_id(+) -- 직원은 있는데 상사 쪽이 없는 경우!


--ANSI
SELECT 직원.employee_id, 직원.first_name 직원이름,
	상사.employee_id, 상사.first_name 상사이름
FROM employees 직원 JOIN employees 상사
ON 직원.manager_id = 상사.employee_id

SELECT 직원.employee_id, 직원.first_name 직원이름,
	상사.employee_id, 상사.first_name 상사이름
FROM employees 직원 INNER JOIN employees 상사
ON 직원.manager_id = 상사.employee_id

SELECT 직원.employee_id, 직원.first_name 직원이름,
	상사.employee_id, 상사.first_name 상사이름
FROM employees 직원 LEFT OUTER JOIN employees 상사
ON 직원.manager_id = 상사.employee_id

-- USING은 칼럼이 같을때?!

-- 직원이름, 부서이름
-- 직원이 부서를 참조
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id

-- 11건.... 부서가 직원을 참조
SELECT first_name, department_name
FROM employees, departments
WHERE employees.employee_id = departments.manager_id


-- ORACLE vender
SELECT employees.first_name 직원이름, departments.department_name 부서이름, jobs.job_title 직업이름
FROM employees, departments, jobs
WHERE employees.job_id = jobs.job_id
AND employees.department_id = departments.department_id;


-- ANSI, JOIN USING : 칼럼 이름이 동일할때만?
SELECT employees.first_name 직원이름, departments.department_name 부서이름, jobs.job_title 직업이름
FROM employees JOIN jobs USING(job_id)
	JOIN departments USING(department_id);

-- ANSI, join on
SELECT employees.first_name 직원이름, departments.department_name 부서이름, jobs.job_title 직업이름
FROM employees JOIN jobs ON employees.job_id = jobs.job_id
	JOIN departments ON employees.department_id = departments.department_id;


-- --first_name, country_name

SELECT first_name, country_name
FROM employees JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)

-- 데이비드의 상사 찾기

SELECT 직원.first_name, 상사.first_name, 상사.salary
FROM employees 직원, employees 상사
WHERE 직원.manager_id = 상사.employee_id
AND 직원.first_name = 'David'


SELECT 직원.first_name, 상사.first_name, 상사.salary
FROM employees 직원 JOIN employees 상사
ON 직원.manager_id = 상사.employee_id
WHERE 직원.first_name = 'David'




<---- SCOTT-------------------------------------------------------------
-- manager가 king인 사람들 조회

SELECT e.empno, e.ename, e.JOB,
	m.empno, m.ename, m.job
FROM emp e JOIN emp m ON e.mgr = m.empno
WHERE m.ename = 'KING'

---- SCOTT과 동일한 근무지에서 근무하는 사원의 이름을 출력하시오.
SELECT emp.ename, dept.loc
FROM emp JOIN dept
ON (SELECT emp.deptno FROM emp WHERE emp.ename = 'SCOTT') = dept.deptno

-- 부서
SELECT sc.ename, emp.ename
FROM emp sc, emp
WHERE sc.deptno = emp.deptno
AND sc.ename = 'SCOTT'
AND emp.ename != 'SCOTT'


SELECT * FROM emp
SELECT * FROM dept
---- SCOTT------------------------------------------------------------->

--- 직워의 부서정보 출력
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id

-- 부서가 없는 직원도 포함 시켜라
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id(+)

-- 사용하지 않은 부서가 있다면 출력에 포함한다.(직원이 없는 부서도 출력)
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id(+) = departments.department_id

-- 부서가 없는 직원도 포함 시켜라
-- 사용하지 않은 부서가 있다면 출력에 포함한다.(직원이 없는 부서도 출력)
SELECT first_name, department_name
FROM employees FULL OUTER JOIN departments
ON employees.department_id = departments.department_id

-- 요런 문법은 없음
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id(+) = departments.department_id(+) --(xxx)


6. 사원 테이블과 부서 테이블을 조인하여 사원이름과 부서번호와 부서명을 출력하도록 합시다. 
부서 테이블의 40번 부서와 조인할 사원 테이블의 부서번호가 없지만, 
아래 그림과 같이 40번 부서의 부서 이름도 출력되도록 쿼리문을 작성해 보시오.

SELECT employees.first_name, departments.department_name, departments.department_id
FROM employees RIGHT OUTER JOIN departments
USING(department_id)

--ON employees.department_id = departments.department_id


SELECT ename, dname
FROM emp RIGHT OUTER JOIN dept USING(deptno)



SELECT *
FROM employees
WHERE department_id = 80
AND job_id = 'SA_REP';



