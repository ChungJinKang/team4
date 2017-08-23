========================================
		JOIN
========================================

1.�������� �̸��� ���޸�(job_title)�� ��ȸ�Ͻÿ�.
SELECT first_name, job_title
FROM employees JOIN jobs
USING(job_id)

2.�μ��̸��� �μ��� ���� ���ø�(city)�� ��ȸ�Ͻÿ�.
SELECT department_name, city
FROM departments JOIN locations USING(location_id)

3. ������ �̸��� �ٹ��������� ��ȸ�Ͻÿ�. (employees, departments, locations,countries)
SELECT first_name, country_name
FROM employees JOIN departments USING(department_id)
			JOIN locations USING(location_id)
			JOIN countries USING(country_id)


4. ��å(job_title)�� 'manager' �� ����� �̸�, ��å, �μ����� ��ȸ�Ͻÿ�.
SELECT first_name, job_title, department_name
FROM employees, jobs, departments
WHERE job_title LIKE '%Manager'
AND employees.department_id = departments.department_id
AND employees.job_id = jobs.job_id;
-------------------------------------------------------------
SELECT first_name, job_title, department_name
FROM employees JOIN jobs USING(job_id) 
								JOIN departments USING(department_id)
WHERE job_title LIKE '%'|| initcap('manager')
-------------------------------------------------------------
SELECT first_name, job_title, department_name
FROM employees JOIN jobs USING(job_id) 
								JOIN departments USING(department_id)
WHERE substr(job_title, -7.7) = initcap('manager')
-------------------------------------------------------------

5. �������� �̸�, �Ի���, �μ����� ��ȸ�Ͻÿ�.
SELECT first_name, hire_date, department_name
FROM employees JOIN departments USING(department_id)


6. �������� �̸�, �Ի���, �μ����� ��ȸ�Ͻÿ�.
��, �μ��� ���� ������ �ִٸ� �� ���������� ��°���� ���Խ�Ų��.
SELECT first_name, hire_date, department_name
FROM employees LEFT OUTER JOIN departments USING(department_id)

SELECT first_name, hire_date, department_name
FROM employees, departments 
WHERE employees.department_id = departments.department_id(+);

7. ������ �̸��� ��å(job_title)�� ����Ͻÿ�.
��, ������ �ʴ� ��å�� �ִٸ� �� ��å������ ��°���� ���Խ�Ű�ÿ�.
SELECT first_name, job_title
FROM employees RIGHT OUTER JOIN jobs USING(job_id)

SELECT first_name,  job_title
FROM employees,  jobs
WHERE employees.job_id(+) =  jobs.job_id;


