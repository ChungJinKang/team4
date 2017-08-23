-- ���� ������ table���� ����
SELECT * FROM tab;

-- table ���� ����
SELECT * FROM EMPLOYEES;
SELECT first_name, to_char(hire_date, 'mm/dd/yyyy') FROM EMPLOYEES;

-- mm/dd/yy
-- mm/dd/rr		(0~49������ 2000���, 50~99������ 1900���)
-- mm/dd/yyyy

-- table ���� ����
desc EMPLOYEES


SELECT sysdate, 10 + 20 FROM dual;

SELECT employee_id, first_name, salary FROM EMPLOYEES;

-- �������� �ٹ��ϴ� �μ� ����
SELECT DISTINCT department_id FROM EMPLOYEES;

SELECT employee_id as "���� ��ȣ", first_name �̸�, salary �޿�, department_id �μ��ڵ� FROM employees;



SELECT * FROM emp;

-- nvl( , ) null�϶� ���ϴ� ������ ����
SELECT first_name, 
	salary, 
	commission_pct, 
	salary+salary*nvl(commission_pct, 0) �޿� 
	FROM employees
	WHERE commission_pct is not null;

-- nvl2(Į��, Į���� ���� null�� �ƴ� ��� ��ġ��, Į���� ���� null�� ��� ��ġ��)
SELECT first_name, 
	salary, 
	commission_pct, 
	salary+salary*nvl2(commission_pct, 1, 2) �޿� 
	FROM employees;

CREATE TABLE book(
	title varchar2(100) not null,
	price number
);

INSERT INTO book(title) values('�ڹ��� ����');
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
INSERT INTO book2(title, publisher, price) VALUES('����Ŭ', 'ȣ����', 30000);

SELECT title, nvl(price, 0), nvl2(price, 30000, 10000) FROM book2;

SELECT title, length(title), lengthB(title), publisher, price FROM book2;

SELECT first_name ||' '|| last_name �̸� 
FROM employees
WHERE first_name = 'David';

SELECT first_name �̸�, salary �޿� --3
FROM employees			-- 1
WHERE salary >= 5000	-- 2, salary��� �޿� ���� �ȵ�
ORDER BY 2 DESC;	-- 4, salary �������� ��������, �����̳� ��ġ(2)�� ���� �� �ִ� 



SELECT first_name �̸�, salary �޿�, commission_pct
FROM employees
ORDER BY 3 nulls first;

SELECT first_name �̸�, salary �޿�, commission_pct
FROM employees
ORDER BY 3 DESC nulls last;

SELECT *
FROM employees
WHERE hire_date >= to_date('2007/01/01')	-- ����ȯ
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
WHERE salary BETWEEN 5000 AND 10000;	-- �� �����͵� ����

-- OR
SELECT *
FROM employees
WHERE salary BETWEEN 5000 AND 10000	-- �� �����͵� ����
AND (commission_pct = 0.3 OR commission_pct = 0.2 OR commission_pct = 0.1); -- ��ȣ �ʿ�

-- IN
SELECT *
FROM employees
WHERE salary BETWEEN 5000 AND 10000	-- �� �����͵� ����
AND commission_pct in (0.1, 0.2, 0.3);


SELECT *
FROM employees
WHERE first_name LIKE 'A%'
AND last_name LIKE '%n'
AND email LIKE '__U%'	-- 3��° ���ڰ� U���� �Ѵ�,asc


SELECT *
FROM employees
ORDER BY salary DESC,  ASC;


















