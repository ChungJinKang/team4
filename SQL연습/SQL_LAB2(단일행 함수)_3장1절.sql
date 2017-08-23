========================================
		������ �Լ�
========================================

1. �̸��� 'adam' �� ������ �޿��� �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name, salary, hire_date
FROM employees
WHERE first_name = initcap('adam');
-- first_name�� �ε����� ������� �ִ� ��쿡��
-- �� ������ ����ؼ� ó���ϴ°� ����.
-- �׷��� �ظ��� ��쿡�� �������� ���� ���ϴ°� ����.
--WHERE lower(first_name) = 'adam';


2. ���� ���� 'united states of america' �� ������ ���� �ڵ带 ��ȸ�Ͻÿ�.
SELECT country_name, country_id, region_id
FROM countries
WHERE lower(country_name) = 'united states of america';

3. 'Adam�� �Ի����� 95/11/02 �̰�, �޿��� 7000 �Դϴ�.' �̷� ������ ����
������ ��ȸ�Ͻÿ�.
SELECT first_name||'�� �Ի����� '||hire_date||'�̰� �޿��� '|| salary ||'�Դϴ�.' Adam�Ի���
FROM employees
WHERE lower(first_name) = 'adam';

4. �̸��� 5���� ������ �������� �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name, salary, hire_date
FROM employees
WHERE length(first_name) <= 5;

-- 5����
--WHERE first_name LIKE '_____';

5. 06�⵵�� �Ի��� ������ �̸�, �Ի����� ��ȸ�Ͻÿ�.
SELECT first_name, hire_date
FROM employees
WHERE hire_date LIKE '06%';
-- WHERE to_char(hire_date, 'yyyy') = '2006'
-- >, < �� BETWEEN �ᵵ ��

6. 15�� �̻� ��� �ټ��� �������� �̸�, �Ի���, �޿�, �ٹ������� ��ȸ�Ͻÿ�.
SELECT first_name, hire_date, salary, ceil(months_between(sysdate, hire_date)/12) �ٹ�����
FROM employees
WHERE months_between(sysdate, hire_date)/12 >=15;

-------------------------------------------------------------------



7. �� �μ��� �ο����� ��ȸ�ϵ� �ο����� 5�� �̻��� �μ��� ��µǵ��� �Ͻÿ�.
SELECT department_id �μ�, count(*) �ο���
FROM employees
GROUP BY department_id
HAVING count(*) >= 5;

8. �� �μ��� �ִ�޿��� �ּұ޿��� ��ȸ�Ͻÿ�.
   ��, �ִ�޿��� �ּұ޿��� ���� �μ��� ������ �Ѹ��� ���ɼ��� ���⶧���� 
   ��ȸ������� ���ܽ�Ų��.
SELECT department_id �μ�, max(salary) �ִ�޿�, min(salary) �ּұ޿�
FROM employees
GROUP BY department_id
HAVING max(salary) <> min(salary);
   
9. �μ��� 50, 80, 110 ���� ������ �߿��� �޿��� 5000 �̻� 24000 ���ϸ� �޴�
   �������� ������� �μ��� ��� �޿��� ��ȸ�Ͻÿ�.
   ��, ��ձ޿��� 8000 �̻��� �μ��� ��µǾ�� �ϸ�, ��°���� ��ձ޿��� ����
   �μ����� ��µǵ��� �ؾ� �Ѵ�.

SELECT department_id �μ�, trunc(avg(salary)) ��ձ޿�
FROM employees
WHERE department_id in (50, 80, 110) 
AND salary BETWEEN 5000 AND 24000
GROUP BY department_id
HAVING avg(salary) >= 8000
ORDER BY ��ձ޿� DESC;









