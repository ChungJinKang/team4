-- SELF JOIN
1. ������ �̸��� ������ �̸��� ��ȸ�Ͻÿ�.
SELECT e.first_name �����̸�, m.first_name �������̸�
FROM employees e, employees m
WHERE e.manager_id = m.employee_id;

SELECT e.first_name �����̸�, m.first_name �������̸�
FROM employees e JOIN employees m
ON e.manager_id = m.employee_id;


2. ������ �̸��� ������ �̸��� ��ȸ�Ͻÿ�.
�����ڰ� ���� ���������� ��� ����Ͻÿ�.
SELECT e.first_name �����̸�, m.first_name �������̸�
FROM employees e LEFT OUTER JOIN employees m
ON e.manager_id = m.employee_id;


3. ������ �̸��� �����ڰ� �����ϴ� ������ ���� ��ȸ�Ͻÿ�.
��, ������������ 3�� �̻��� �����ڸ� ��µǵ��� �Ͻÿ�.
SELECT m.first_name �������̸�, count(e.first_name) ����������
FROM employees e, employees m
WHERE e.manager_id = m.employee_id
GROUP BY rollup(m.first_name)
HAVING count(e.first_name) >= 3
ORDER BY ���������� ASC


SELECT m.first_name �������̸�, count(m.first_name) ����������
FROM employees e, employees m
WHERE e.manager_id = m.employee_id
GROUP BY m.first_name
HAVING count(m.first_name) >= 3
ORDER BY ���������� ASC
















