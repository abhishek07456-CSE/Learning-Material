create table emp (eid bigint(8) Auto_increment primary key, name varchar(255) , salary bigint(8)); --autoincrement defined with key
SET GLOBAL max_allowed_packet=size; --maximum insert size
insert into emp(eid , name ,salary ) values (100,"abhi",7),(200,"abhi",8); --last key is 200
insert into emp (name , salary) values ("sahil" , 9);--default next key is 201

--alter add column--
alter table emp add column temp int;
desc emp;

--alter datatype--
alter table emp modify column temp year


--rename column --
--alter table emp rename temp to temp1;
alter table emp change temp  temp1 int;

--rename table
alter table emp rename to employee;
desc employee;

SELECt
    select_list
FROM
    table_name
LIMIT [offset,] row_count;


GRANT ALL PRIVILEGES ON * . * TO 'newuser'@'localhost';
GRANT select , drop ON db.table_name TO 'newuser'@'localhost';

create view vtable as select * from tablename

BACKUP DATABASE testDB
TO DISK = 'D:\backups\testDB.bak';

BACKUP DATABASE testDB
TO DISK = 'D:\backups\testDB.bak'
WITH DIFFERENTIAL; ---backup only part of db that changed

ID primary key;
CONSTRAINT PK_Person PRIMARY KEY (ID,LastName)
ALTER TABLE Persons
ADD CONSTRAINT PK_Person PRIMARY KEY (ID,LastName);



SET FOREIGN_KEY_CHECKS=0;
PersonID int FOREIGN KEY REFERENCES Persons(PersonID)

CONSTRAINT FK_PersonOrder FOREIGN KEY (PersonID)
REFERENCES Persons(PersonID)

ADD CONSTRAINT FK_PersonOrder
FOREIGN KEY (PersonID) REFERENCES Persons(PersonID);

Age int CHECK (Age>=18)
CONSTRAINT CHK_Person CHECK (Age>=18 AND City='Sandnes')


16. sql inection - it web based technique might destroy db by user input;
