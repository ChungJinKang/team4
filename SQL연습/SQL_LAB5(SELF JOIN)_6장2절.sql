-- SELF JOIN
1. 직원의 이름과 관리자 이름을 조회하시오.
SELECT e.first_name 직원이름, m.first_name 관리자이름
FROM employees e, employees m
WHERE e.manager_id = m.employee_id;

SELECT e.first_name 직원이름, m.first_name 관리자이름
FROM employees e JOIN employees m
ON e.manager_id = m.employee_id;


2. 직원의 이름과 관리자 이름을 조회하시오.
관리자가 없는 직원정보도 모두 출력하시오.
SELECT e.first_name 직원이름, m.first_name 관리자이름
FROM employees e LEFT OUTER JOIN employees m
ON e.manager_id = m.employee_id;


3. 관리자 이름과 관리자가 관리하는 직원의 수를 조회하시오.
단, 관리직원수가 3명 이상인 관리자만 출력되도록 하시오.
SELECT m.first_name 관리자이름, count(e.first_name) 관리직원수
FROM employees e, employees m
WHERE e.manager_id = m.employee_id
GROUP BY rollup(m.first_name)
HAVING count(e.first_name) >= 3
ORDER BY 관리직원수 ASC


SELECT m.first_name 관리자이름, count(m.first_name) 관리직원수
FROM employees e, employees m
WHERE e.manager_id = m.employee_id
GROUP BY m.first_name
HAVING count(m.first_name) >= 3
ORDER BY 관리직원수 ASC
















