-- cross join, ǥ�� ������ �ƴ�. DB vender ����
SELECT *
FROM employees, departments
ORDER BY 1

-- 107
-- 27
SELECT * FROM departments


-- equi join
SELECT *
FROM employees, departments
WHERE employees.department_id = departments.department_id(+)	-- + ���� outer join
ORDER BY 1

-- ANSI
SELECT *
FROM employees LEFT OUTER JOIN departments	-- INNER�� �����ص� ��, ������ �����̸� LEFT OUTER JOIN
ON employees.department_id = departments.department_id
ORDER BY 1

-- ANSI
-- �ߺ��� �κ� �ϳ���?
-- ���� �ִ� �ѹ��� ���� ������ ��������� ����ؼ� �θ��� �ȵ�
SELECT *
-- �������� ������ RIGHT OUTER JOIN
FROM departments RIGHT OUTER JOIN employees USING (department_id)
WHERE department_id > 0	-- �Ѵ��� ���̹Ƿ� �̷��� ��
ORDER BY 1


-- first_name�� Steven�� ������ �μ� �̸��� ���
SELECT first_name, last_name, salary, hire_date, department_name, employees.department_id
FROM employees, departments
WHERE employees.department_id = departments.department_id
AND first_name = 'Steven'


SELECT e.first_name, e.last_name, e.salary, e.hire_date, department_name, e.department_id
FROM employees e, departments d
WHERE first_name = 'Steven'
AND e.department_id = d.department_id

-- ANSI ǥ��
SELECT e.first_name, e.last_name, e.salary, e.hire_date, department_name, e.department_id
FROM employees e JOIN departments d
ON e.department_id = d.department_id
WHERE e.first_name = 'Steven';

-- �� �����ϰ�
-- ���߿� ���� id���� �𸣴� ��찡 ��������?
-- ���� ����� �� ����
SELECT e.first_name, e.last_name, e.salary, e.hire_date, department_name, department_id
FROM employees e JOIN departments d
USING (department_id)		-- �տ� ���̺� �̸� ���� ����!!!
WHERE e.first_name = 'Steven'


-- scott
SELECT * 
FROM emp

SELECT *
FROM dept

SELECT ename, dname
FROM emp, dept
WHERE job = 'MANAGER'
AND emp.deptno = dept.deptno	-- JOIN ����

SELECT ename, dname
FROM emp JOIN dept
ON emp.deptno = dept.deptno
WHERE emp.job = 'MANAGER'

SELECT *
FROM salgrade

-- �ű��ϴ�
SELECT ename, sal, grade
FROM emp, salgrade
WHERE sal BETWEEN losal AND hisal

-- �Ի��� 2000/01/01 2002/12/31	'����'
-- �Ի��� 2003/01/01 2005/12/31	'����'
-- �Ի��� 2006/01/01 2010/12/31	'ģ��'


-- hr

CREATE TABLE «��(
	title varchar2(6),
	sdate date,
	edate date
)

--- ���� «���� title�� ���
INSERT INTO «��(title, sdate, edate) values('����', '2000/01/01', '2002/12/31');
INSERT INTO «��(title, sdate, edate) values('����', '2003/01/01', '2005/12/31');
INSERT INTO «��(title, sdate, edate) values('ģ��', '2006/01/01', '2010/12/31');
INSERT INTO «��(title) values('�̿�');
INSERT INTO «��(title, sdate) values('����', '2011/01/01');

SELECT *
FROM «��

SELECT first_name, hire_date, title
FROM employees, «��
WHERE employees.hire_date >= «��.sdate
AND employees.hire_date <= «��.edate

-- table �����
DROP TABLE «��;
-- data �����
DELETE FROM «��;	



SELECT employee_id, first_name, manager_id
FROM employees
ORDER BY 3


--- SELF JOIN
SELECT ����.employee_id, ����.first_name �����̸�, 
	���.employee_id, ���.first_name ����̸�
FROM employees ����, employees ���
WHERE ����.manager_id = ���.employee_id(+) -- ������ �ִµ� ��� ���� ���� ���!


--ANSI
SELECT ����.employee_id, ����.first_name �����̸�,
	���.employee_id, ���.first_name ����̸�
FROM employees ���� JOIN employees ���
ON ����.manager_id = ���.employee_id

SELECT ����.employee_id, ����.first_name �����̸�,
	���.employee_id, ���.first_name ����̸�
FROM employees ���� INNER JOIN employees ���
ON ����.manager_id = ���.employee_id

SELECT ����.employee_id, ����.first_name �����̸�,
	���.employee_id, ���.first_name ����̸�
FROM employees ���� LEFT OUTER JOIN employees ���
ON ����.manager_id = ���.employee_id

-- USING�� Į���� ������?!

-- �����̸�, �μ��̸�
-- ������ �μ��� ����
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id

-- 11��.... �μ��� ������ ����
SELECT first_name, department_name
FROM employees, departments
WHERE employees.employee_id = departments.manager_id


-- ORACLE vender
SELECT employees.first_name �����̸�, departments.department_name �μ��̸�, jobs.job_title �����̸�
FROM employees, departments, jobs
WHERE employees.job_id = jobs.job_id
AND employees.department_id = departments.department_id;


-- ANSI, JOIN USING : Į�� �̸��� �����Ҷ���?
SELECT employees.first_name �����̸�, departments.department_name �μ��̸�, jobs.job_title �����̸�
FROM employees JOIN jobs USING(job_id)
	JOIN departments USING(department_id);

-- ANSI, join on
SELECT employees.first_name �����̸�, departments.department_name �μ��̸�, jobs.job_title �����̸�
FROM employees JOIN jobs ON employees.job_id = jobs.job_id
	JOIN departments ON employees.department_id = departments.department_id;


-- --first_name, country_name

SELECT first_name, country_name
FROM employees JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)

-- ���̺���� ��� ã��

SELECT ����.first_name, ���.first_name, ���.salary
FROM employees ����, employees ���
WHERE ����.manager_id = ���.employee_id
AND ����.first_name = 'David'


SELECT ����.first_name, ���.first_name, ���.salary
FROM employees ���� JOIN employees ���
ON ����.manager_id = ���.employee_id
WHERE ����.first_name = 'David'




<---- SCOTT-------------------------------------------------------------
-- manager�� king�� ����� ��ȸ

SELECT e.empno, e.ename, e.JOB,
	m.empno, m.ename, m.job
FROM emp e JOIN emp m ON e.mgr = m.empno
WHERE m.ename = 'KING'

---- SCOTT�� ������ �ٹ������� �ٹ��ϴ� ����� �̸��� ����Ͻÿ�.
SELECT emp.ename, dept.loc
FROM emp JOIN dept
ON (SELECT emp.deptno FROM emp WHERE emp.ename = 'SCOTT') = dept.deptno

-- �μ�
SELECT sc.ename, emp.ename
FROM emp sc, emp
WHERE sc.deptno = emp.deptno
AND sc.ename = 'SCOTT'
AND emp.ename != 'SCOTT'


SELECT * FROM emp
SELECT * FROM dept
---- SCOTT------------------------------------------------------------->

--- ������ �μ����� ���
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id

-- �μ��� ���� ������ ���� ���Ѷ�
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id(+)

-- ������� ���� �μ��� �ִٸ� ��¿� �����Ѵ�.(������ ���� �μ��� ���)
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id(+) = departments.department_id

-- �μ��� ���� ������ ���� ���Ѷ�
-- ������� ���� �μ��� �ִٸ� ��¿� �����Ѵ�.(������ ���� �μ��� ���)
SELECT first_name, department_name
FROM employees FULL OUTER JOIN departments
ON employees.department_id = departments.department_id

-- �䷱ ������ ����
SELECT first_name, department_name
FROM employees, departments
WHERE employees.department_id(+) = departments.department_id(+) --(xxx)


6. ��� ���̺�� �μ� ���̺��� �����Ͽ� ����̸��� �μ���ȣ�� �μ����� ����ϵ��� �սô�. 
�μ� ���̺��� 40�� �μ��� ������ ��� ���̺��� �μ���ȣ�� ������, 
�Ʒ� �׸��� ���� 40�� �μ��� �μ� �̸��� ��µǵ��� �������� �ۼ��� ���ÿ�.

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



