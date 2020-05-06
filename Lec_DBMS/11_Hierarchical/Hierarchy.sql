-- 계층형 쿼리 (Hierarchical Query)

SELECT * FROM t_dept2;  -- 서로의 계층관계 주목!

SELECT LPAD(dname, 10, '*') 부서명 FROM t_dept2;

SELECT DNAME ,LEVEL FROM T_DEPT2
CONNECT BY PRIOR DCODE =PDEPT 
START WITH dcode=0001
;
SELECT DNAME ,LEVEL FROM T_DEPT2
CONNECT BY DCODE =PRIOR PDEPT 
START WITH dcode=0001
;
SELECT DNAME ,DNAME,PDEPT ,LEVEL FROM T_DEPT2
CONNECT BY DCODE =PRIOR PDEPT 
--START WITH dcode=1005
START WITH dcode=1011
;
SELECT LPAD(dname, LEVEL * 6, '*') FROM T_DEPT2
CONNECT BY PRIOR DCODE = PDEPT 
START WITH dcode=0001
;
SELECT * FROM t_dept2;

SELECT LPAD(e.NAME || ' ' || d.dname || ' ' || nvl(e.POST, '사원'),LEVEL *15, '-') "이름과 직급"
FROM t_emp2 e,(SELECT dname,dcode,pdept FROM t_dept2) d
WHERE e.DEPTNO =d.dcode
CONNECT BY PRIOR e.empno = e.PEMPNO
START WITH e.EMPNO =20000101
;

SELECT LEVEL -1 HR
FROM DUAL
CONNECT BY LEVEL <=24;





