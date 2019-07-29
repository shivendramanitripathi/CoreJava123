CREATE TABLE grand_parents2 ( 
grandparents_id NUMBER (14),
grandparents_name VARCHAR2 (20),
grandparents_address VARCHAR2 (30),
grandparents_no NUMBER (10),
CONSTRAINT pk1000 PRIMARY KEY(grandparents_id )
);
CREATE TABLE parents2 (
parents_id NUMBER (10),
parents_name VARCHAR2 (20),
parents_no NUMBER (10),
CONSTRAINT pk1001 PRIMARY KEY(parents_id ),
 CONSTRAINT  fk1000 FOREIGN KEY(parents_id) references grand_parents2(grandparents_id)
);
CREATE TABLE child2 ( 
child_id NUMBER (10),
child_name VARCHAR2 (19),
child_no NUMBER (10),
CONSTRAINT fk1001 FOREIGN KEY(child_id)
REFERENCES parents2(parents_id)
);
insert into grandparents(Grandparents_id, action);
commit;insert into Grand parents (Grandparents_id, Grandparents_name, Grandparents_no, Grandparents_Address) values(1, 'Shivendra', 9988765423, 'bangalore');
select * from Grand parents ;

