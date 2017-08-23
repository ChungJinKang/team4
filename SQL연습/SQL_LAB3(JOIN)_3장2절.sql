========================================
		JOIN
========================================

1.직원들의 이름과 직급명(job_title)을 조회하시오.
SELECT first_name, job_title
FROM employees JOIN jobs
USING(job_id)

2.부서이름과 부서가 속한 도시명(city)을 조회하시오.
SELECT department_name, city
FROM departments JOIN locations USING(location_id)

3. 직원의 이름과 근무국가명을 조회하시오. (employees, departments, locations,countries)
SELECT first_name, country_name
FROM employees JOIN departments USING(department_id)
			JOIN locations USING(location_id)
			JOIN countries USING(country_id)


4. 직책(job_title)이 'manager' 인 사람의 이름, 직책, 부서명을 조회하시오.
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

5. 직원들의 이름, 입사일, 부서명을 조회하시오.
SELECT first_name, hire_date, department_name
FROM employees JOIN departments USING(department_id)


6. 직원들의 이름, 입사일, 부서명을 조회하시오.
단, 부서가 없는 직원이 있다면 그 직원정보도 출력결과에 포함시킨다.
SELECT first_name, hire_date, department_name
FROM employees LEFT OUTER JOIN departments USING(department_id)

SELECT first_name, hire_date, department_name
FROM employees, departments 
WHERE employees.department_id = departments.department_id(+);

7. 직원의 이름과 직책(job_title)을 출력하시오.
단, 사용되지 않는 직책이 있다면 그 직책정보도 출력결과에 포함시키시오.
SELECT first_name, job_title
FROM employees RIGHT OUTER JOIN jobs USING(job_id)

SELECT first_name,  job_title
FROM employees,  jobs
WHERE employees.job_id(+) =  jobs.job_id;


