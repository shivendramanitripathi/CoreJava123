CREATE TABLE COUNTRY2 ( 
country_id NUMBER (20),
country_name VARCHAR2 (30),
country_population NUMBER (3),
CONSTRAINT pk30 PRIMARY KEY(country_id )
);
CREATE TABLE STATE7 (
state_id NUMBER (20),
state_name VARCHAR2 (24),
state_population NUMBER (25),
CONSTRAINT pk32 PRIMARY KEY(state_id ),
 CONSTRAINT  fk5000 FOREIGN KEY(state_id) references COUNTRY1(country_id)
); 
CREATE TABLE CITY4(
city_id NUMBER (20),
city_name VARCHAR2 (44),
city_population NUMBER (4),
CONSTRAINT pk4002 PRIMARY KEY (city_id),
CONSTRAINT fk30002 FOREIGN KEY (city_id) REFERENCES STATE7(state_id)
);
insert into COUNTRY1(country_id, country_name) values(11, 'india');
insert into STATE7(state_id, state_name) values(13, 'Bangalore');
select*from COUNTRY1;
select*from STATE7;