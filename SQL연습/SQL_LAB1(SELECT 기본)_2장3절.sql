
hr/hr
========================================
		SELECT �⺻
========================================

1. �޿��� 15000 �̻��� �������� �̸�, �޿�, �μ�id�� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, department_id �μ�id
FROM employees
WHERE salary >= 15000;


2. ���� �߿��� ������ 170000 �̻��� �������� �̸�, ������ ��ȸ�Ͻÿ�.
   ������ �޿�(salary)�� 12�� ���� ���Դϴ�.
SELECT first_name || ' ' || last_name �̸�, salary * 12 ����
FROM employees
WHERE salary * 12 >= 170000;


3. ���� �߿��� �μ�id�� ���� ������ �̸��� �޿��� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�
FROM employees
WHERE department_id IS null;


4. 2004�� ������ �Ի��� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, hire_date �Ի���
FROM employees
WHERE to_char(hire_date, 'yyyy') <= '2004';
--WHERE hire_date <= to_date('2004/12/31');

-- �������� -- 
1. 80, 50 �� �μ��� ���������鼭 �޿��� 13000 �̻��� ������ �̸�, �޿�, �μ�id
�� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, department_id �μ�id
FROM employees
WHERE department_id in (80, 50) AND salary >= 13000;


2. 2005�� ���Ŀ� �Ի��� ������ �߿��� �޿��� 1300 �̻� 20000 ������ �������� 
�̸�, �޿�, �μ�id, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, department_id �μ�id, hire_date �Ի���
FROM employees 
WHERE hire_date >= '2005/01/01'
AND salary BETWEEN 1300 AND 20000;
--AND (salary >= 1300 AND salary <= 20000);

-- 2005�� ����
--SELECT hire_date, to_char(hire_date, 'yyyy')
--FROM employees
--WHERE to_char(hire_date, 'yyyy') >= 2005;

-- 2005�⸸ ���
--SELECT hire_date, to_char(hire_date, 'yyyy')
--FROM employees
--WHERE hire_date LIKE '05%';

-- SQL �񱳿����� --
1. 80, 50 �� �μ��� ���������鼭 �޿��� 13000 �̻��� ������ �̸�, �޿�, �μ�id
�� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, department_id �μ�id
FROM employees 
WHERE department_id in (80, 50) 
AND salary >= 13000;



2. 2005�� ���Ŀ� �Ի��� ������ �߿��� �޿��� 1300 �̻� 30000 ������ �������� 
�̸�, �޿�, �μ�id, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, department_id �μ�id, hire_date �Ի���
FROM employees 
--WHERE hire_date >= to_date('2005/01/01')
WHERE hire_date >= '2005/01/01'	-- �̰� �� ���� ����̷�(������ ������ ����ϴ� ����̶�)
--WHERE to_char(hire_date, 'yyyy') >= '2005'	-- ������ ������ �Ⱦ��� ������ �ٶ������� ����
AND (salary >= 1300 AND salary <= 30000);


3. 2005�⵵ �Ի��� ������ ������ ����Ͻÿ�.
SELECT *
FROM employees
WHERE hire_date LIKE '05%';
--WHERE hire_date BETWEEN '2005/01/01' AND '2005/12/31';


4. �̸��� D�� �����ϴ� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, hire_date �Ի���
FROM employees 
WHERE first_name LIKE 'D%';

5. 12���� �Ի��� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, hire_date �Ի���
FROM employees 
WHERE hire_date LIKE '%/12/%';
--WHERE to_char(hire_date, 'mm') = 12;
-------------------------

6. �̸��� le �� �� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, hire_date �Ի���
FROM employees 
WHERE first_name || ' ' || last_name LIKE '%le%';
--WHERE first_name LIKE '%le%' OR last_name LIKE '%le%';

7. �̸��� m���� ������ ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, hire_date �Ի���
FROM employees 
WHERE first_name LIKE '%m' OR last_name LIKE '%m';


8. �̸��� ����° ���ڰ� r�� �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, hire_date �Ի���
FROM employees 
WHERE first_name LIKE '__r%' OR last_name LIKE '__r%';


9. Ŀ�̼��� �޴� ������ �̸�, Ŀ�̼�, �޿��� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, commission_pct Ŀ�̼�, salary �޿�
FROM employees
WHERE commission_pct is not null;


10. Ŀ�̼��� ���� �ʴ� ������ �̸�, Ŀ�̼�, �޿��� ��ȸ�Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, commission_pct Ŀ�̼�, salary �޿�
FROM employees
WHERE commission_pct is null;


11. 2000��뿡 �Ի��ؼ� 30, 50, 80 �� �μ��� ���������鼭, 
�޿��� 5000 �̻� 17000 ���ϸ� �޴� ������ ��ȸ�Ͻÿ�. 
��, Ŀ�̼��� ���� �ʴ� �������� �˻� ��󿡼� ���ܽ�Ű��, ���� �Ի��� ������ 
���� ��µǾ�� �ϸ� �Ի����� ���� ��� �޿��� ���� ������ ���� ��µǷ� �Ͻÿ�.
SELECT first_name || ' ' || last_name �̸�, salary �޿�, department_id �μ�id, hire_date �Ի���
FROM employees
WHERE to_char(hire_date, 'yyyy') BETWEEN 2000 AND 2009
AND department_id in (30, 50, 80) 
AND salary BETWEEN 5000 AND 17000
AND commission_pct is not null
ORDER BY hire_date ASC, salary DESC;
--AND (salary >= 5000 AND salary <= 17000);

