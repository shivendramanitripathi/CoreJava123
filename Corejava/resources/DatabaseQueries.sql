 --set oracle_sid=XE
--net start oracleserviceXE

select * from hr.countries;

select country_id , country_name from hr.countries;

CREATE TABLE enroll (
enroll_id    NUMBER (10),
enroll_name  VARCHAR2 (15),
enroll_no NUMBER(10),
enroll_look  VARCHAR2 (10),
CONSTRAINT PRIMARY KEY(enroll_id));

CREATE TABLE admin (
enroll_id    NUMBER (10),
action  VARCHAR2 (3),
CONSTRAINT fk FOREIGN KEY(enroll_id)
REFERENCES enroll(enroll_id)



insert into admin(enroll_id, action) values(1, 'ADD');
commit;insert into enroll1(enroll_id, enroll_name, enroll_no, enroll_look) values(1, 'Shivendra', 9988765423, 'fair');

select * from enroll;
select * from admin;

