-- employees ���� 107�� ������
SELECT 1 + 2, floor(3.141592) �����ǹ���, 
	trunc(3.941, 1) �����ǹ���2,
	trunc(123.951, -1) �����ǹ���3,
	ceil(3.15) �����������οø�,
	round(3.4) �ݿø�,
	round(3.46, 1) �ݿø�2,
	round(125.46, -1) �ݿø�3
FROM dual;


--concat�� ���ڸ��� �ȵ�
SELECT first_name, lower(first_name), upper(first_name),
	email, initcap(email), initcap('oracle db'),
	first_name||'��'||last_name �̸�,
	concat(concat(first_name, '��'), last_name) �̸�2,
	substr(first_name, 2, 3) "2����3��",
	substr('�����Դϴ�.', 2, 3) "2����3��(2)",
	substrB(first_name, 2, 3) "2����3��(3)",
	substrB('�����Դϴ�.', 4, 3) "2����3��(4)"
FROM employees;

SELECT length('����') ����,
	lengthB('����') ����2,
	instr('Oracle DataBase', 'a', 4, 2) ��ġã��
FROM dual;

SELECT lpad(first_name, 20, '#') ����ä���,
	rpad(first_name, 20, '#') ������ä���
FROM employees;

SELECT ltrim(first_name,'A') �����ڸ���,
	rtrim(first_name, 'n') �������ڸ���,
	trim('n' from 'nnnnnnOraclennnnnnn') �����ڸ���
FROM employees

SELECT sysdate, sysdate - hire_date �ϼ�,
	months_between(sysdate, hire_date) ����,
	months_between(sysdate, hire_date)/12 ���,
	hire_date,
	to_char(hire_date, 'DAY') ����,
	last_day(hire_date) ����,
	next_day(hire_date, '�����'),
	round(hire_date, 'yyyy') �⵵�ݿø�,
	add_months(sysdate, 4) ����add
FROM employees;

SELECT to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss DAY PM')
FROM dual

SELECT first_name, to_char(salary, 'L999,999') �޿�1, 
	first_name, to_char(salary, 'L000,000') �޿�2,
	trunc(hire_date - to_date('1998/01/01')) �ϼ�
FROM employees


-- ������ �μ��� 10�̸� A�μ�, 
-- 20�̸� B�μ�
-- �׷��� ������ �������� C�μ�

-- �޿��� 20000�̻��̸� A, 10000~19999 B, �������� C
SELECT department_id,
	decode(department_id, 10, 'A�μ�',
						20, 'B�μ�',
						'C�μ�') �μ�,
	decode(trunc(salary/10000), 2, 'A', 1, 'B', 0, 'C') ���,
	case when salary >= 20000 THEN 'A'
		when salary >= 10000 AND salary < 20000 THEN 'B'
		else 'C' END ���2
FROM employees;


--------------- ���� �Լ�
SELECT count(*) �Ǽ�,	-- null����
	count(employee_id) �Ǽ�2,
	count(department_id) �Ǽ�3,	-- null ���� �ȵ�
	count(commission_pct) �Ǽ�4,
	count(DISTINCT department_id) �Ǽ�5,	-- null ����
	sum(salary) �޿��հ�,
	avg(salary) �޿����,
	sum(salary) / count(salary),
	max(salary) �ִ�޿�,
	min(salary) �ּұ޿�
FROM employees

SELECT count(DISTINCT department_id)
FROM employees

SELECT salary
FROM employees
ORDER BY salary ASC


SELECT department_id �μ�,
	count(*) �Ǽ�,	-- null����
	count(employee_id) �Ǽ�2,
	count(department_id) �Ǽ�3,	-- null ���� �ȵ�
	count(commission_pct) �Ǽ�4,
	count(DISTINCT department_id) �Ǽ�5,	-- null ����
	sum(salary) �޿��հ�,
	avg(salary) �޿����,
	sum(salary) / count(salary),
	max(salary) �ִ�޿�,
	min(salary) �ּұ޿�
FROM employees
GROUP BY department_id

SELECT job_id, sum(salary), avg(salary), count(*), max(salary)
FROM employees
WHERE employee_id > 0
GROUP BY job_id
HAVING count(*) >= 5	-- GROUP�� ���� ����
ORDER BY 5 DESC


--- �μ���, ������ �޿��հ踦 ����Ѵ�.

SELECT department_id, job_id, sum(salary)
FROM employees
GROUP BY rollup(department_id, job_id)	-- ������ �հ赵 ����
ORDER BY department_id

SELECT department_id, job_id, sum(salary)
FROM employees
GROUP BY cube(department_id, job_id)	-- ��� ����� �հ踦 ����
ORDER BY department_id




















