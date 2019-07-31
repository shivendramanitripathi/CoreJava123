SQL> describe hr.vegetable_stock;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 VEGETABLE_ID                              NOT NULL NUMBER(10)
 VEGETABLE_SHOP_NAME                                VARCHAR2(15)

SQL> describe hr.brinjal;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 VEGETABLE_ID                                       NUMBER(10)
 BRINJAL_PRICE                                      NUMBER(15)
 BRINJAL_COLOR                                      VARCHAR2(10)

SQL> describe hr.beans;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 VEGETABLE_ID                                       NUMBER(10)
 BEANS_ID                                           NUMBER(15)
 BEANS_COLOR                                        VARCHAR2(10)

SQL> select * from hr.vegetable_stock;

VEGETABLE_ID VEGETABLE_SHOP_
------------ ---------------
           1 loyal bazaar
           2 loyal bazaar
           3 loyal bazaar

SQL> select * from hr.brinjal;

VEGETABLE_ID BRINJAL_PRICE BRINJAL_CO
------------ ------------- ----------
           1            50 blue

SQL> select * from hr.beans;

VEGETABLE_ID   BEANS_ID BEANS_COLO
------------ ---------- ----------
           2         90 green

SQL> select * from hr.carrot;

VEGETABLE_ID  CARROT_ID CARROT_COL
------------ ---------- ----------
           3         35 orange