1. char vs varchar
   char - having fixed length

    CREATE TABLE Student(Name VARCHAR(30), Gender CHAR(6));
    INSERT into Student VALUES('Herry', 'Male');
    INSERT into Student VALUES('Mahi', 'Female');
    SELECT LENGTH(Gender) FROM Student;

    LENGTH(Gender)
    6
    6
2. varchar - having variable length
     CREATE TABLE Student(Name VARCHAR(30), Gender VARCHAR(6));
    INSERT into Student VALUES('Herry', 'Male');
    INSERT into Student VALUES('Mahi', 'Female');
    SELECT LENGTH(Gender) FROM Student;
    LENGTH(Name)
    5
    4

so space wise varchar is better and performance wise char.
Because of the fixed field lengths, data is pulled straight from the column without doing any data manipulation and index lookups against varchar are slower than that of char fields. CHAR is better than VARCHAR performance wise, however, it takes unnecessary memory space when the data does not have a fixed-length

3. Timestame vs datetime - both having same functionality difference is convert currenct time to utc while saving, and while retriving convert utc to current timezone

4. SET GLOBAL time_zone = '+8:00';
SET GLOBAL time_zone = 'Europe/Helsinki';
SET @@global.time_zone = '+00:00';

or my my.cnf file .

5.LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/filename.csv'
INTO TABLE tablename
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

6.information schema - INFORMATION_SCHEMA provides access to database metadata, information about the MySQL server such as the name of a database or table, the data type of a column, or access privileges. Other terms that are sometimes used for this information are data dictionary and system catalog.
SELECT table_schema AS 'Database Name',
SUM(data_length + index_length) 'Size in Bytes',
ROUND(SUM(data_length + index_length) / 1024 / 1024, 2) 'Size in MB'
FROM information_schema.tables
WHERE table_schema = 'client_service'
GROUP BY table_schema;


7.select salary from employee order by salary desc limit 3,1; --third largest

8. Ddl - dat defination language
   create , drop , later, trucate , rename

   dql - data query language
   select

   dml - data manipulation language

   insert,update ,delete

   TCL - transection control language
    commit , roollback savepoint
    set transection

    create table hel(id int);
    insert into hel values (1);
    insert into hel values (2);
    savepoint TWO_ROW;
    insert into hel values (3);

    rollback to TWO_ROW;
    ROLLBACK
    select * from hel
    commit

8. delete vs truncate -
   delete is DML  , trucate is ddl command
   rollback not possible in truncate but possible in delete
   trucate reset identity like autoincrement value start from 1, delete didnot
   where not possible with trucate , while possible with delete
   trigger not execute with truncate


9.In MySQL, every statement or query produces a temporary result or relation. A common table expression or CTE is used to name those temporary results set that exist within the execution scope of that particular statement, such as CREATE, INSERT, SELECT, UPDATE, DELETE, etc.

   WITH RECURSIVE cte_name (column_names) AS ( subquery )
   SELECT * FROM cte_name;

   WITH employees_in_california AS (
    SELECT * FROM employees WHERE city = 'California'
    )
    SELECT emp_name, emp_age, city FROM employees_in_california
    WHERE emp_age >= 32 ORDER BY emp_name;

 // print odd number

    WITH RECURSIVE
    odd_num_cte (id, n) AS
    (
    SELECT 1, 1
    union all
    SELECT id+1, n+2 from odd_num_cte where id < 5
    )
    SELECT * FROM odd_num_cte;


10. SELECT SUM(Mark) OVER (PARTITION BY id,firstName ) AS marksum, firstname FROM TableA
select SUM(Mark) marksum,firstname from TableA
group by id,firstName
prtiton by doest not roll up the row_count

11. dense_rank vs rank()
    rank() over (PARTITION by marks order by marks) //doest not skip rank if time
    dense_rank() ..... skip if tie
    row_number() ... given unique value to partition by partition

12.InnoDB is a general-purpose storage engine that balances high reliability and high performance.

13. Mysql - mysql is databse management system , to store manage like update ,delete data
Speed
Ease of use
Query language support
Capability
Connectivity and security
Availability and cost
consistent

12. char - 30 , varchar -255 , tinyint - 1 BOOLEAN   - 1 ,int -4 byte , bigint - 8 byte

13.REGEXP '^[0-9]{10}$'; start with 0-9 10 digits OPTIONALLY
14.select if (age > 10 , yes , no)
15.nvl , nvl2 , decode,coalesce ,nullif , lnnvl  all are single row function
       NVL => return first not null value  nvl('a','b')
       nullif('a','b') => return null if both same otherwise return first 1
       coalesce('a','b','c' ....) contains many arguments and return first not null
       NVL2 (expr1, expr2, expr3)
        if(exp1 != null) expr2
        if(exp1==null) expr3
        decode - work as if else if condition
        eg .apply diff formula according to job type

        SELECT last_name,
        job_id,
        salary,
       DECODE(job_id,
            ’IT_PROG’, 1.10*salary,
            ’ST_CLERK’, 1.15*salary,
            ’SA_REP’, 1.20*salary,salary
       )
     REVISED_SALARY FROM employees;

16.strcmp('A','B') A>B = -1 , B>A 1 , A==A 0

17. mysql export
    ./mysqldump --host=np-db-maria-1.chp9usepkri2.us-east-2.rds.amazonaws.com --port=3406 --user=dba2 --password  suitecrm_staging  > /home/ec2-user/suitecrm_staging_03062020.sql

    --all-databases for all databases

    Import DB
    cd /bin
    ./mysql --host=np-db-maria-1.chp9usepkri2.us-east-2.rds.amazonaws.com --port=3406 --user=dba2 --password
    Pass-Dba2@123

    create database DB_NAME;
    use DB_NAME;
    GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE,EVENT, TRIGGER ON milcrm.* TO 'stgcrmuser'@'%' IDENTIFIED BY 'StgCrm123$';

    source /home/ec2-user/prcrm_bb_19102020.sql

18. Normalization is a database design technique that reduces data redundancy and eliminates undesirable characteristics like Insertion, Update and Deletion Anomalies.

19.GREATEST(3, 12, 34, 8, 25);
20 TRUNCATE(135.375, 2); 135.37

21. automatically involked when solm event trigger like insert update delete on database
    row -level trigger - trigger for each row
    statement -level trigger - trigger on table regardless how many row inserted or deleted

    Advantage
    Triggers help us to validate data even before they are inserted or updated.
    Triggers help us to keep a log of records like maintaining audit trails in tables.
    SQL triggers provide an alternative way to check the integrity of data.
    Triggers provide an alternative way to run the scheduled task.
    Triggers reduce the client-side code that saves time and effort.

    Disadvantage
    Triggers are invoked and executed invisibly from the client application. Therefore, it isnt easy to troubleshoot what happens in the database layer.

    mysql> Create Trigger before_insert_occupation
    BEFORE
    INSERT ON employee
    FOR EACH ROW
    BEGIN
    IF NEW.occupation = 'Scientist' THEN SET NEW.occupation = 'Doctor';
    END IF;
    END //

     create trigger update_cus
       before update on customer
       for each row
      begin
      insert into mini_statement values (old.acc_no, old.avail_balance);
      end;


22. SELECT USER() // root@localhost

23.
Views in SQL are kind of virtual tables. A view also has rows and columns as they are in a real table in the database. We can create a view by selecting fields from one or more tables present in the database.

CREATE VIEW view_name AS (select)

DROP VIEW view_name;

upadate view - no group by or order by

1. Views can hide complexity

    If you have a query that requires joining several tables, or has complex logic or calculations, you can code all that logic into a view, then select from the view just like you would a table.

2. Views can be used as a security mechanism

    A view can select certain columns and/or rows from a table (or tables), and permissions set on the view instead of the underlying tables. This allows surfacing only the data that a user needs to see.

3. Views can simplify supporting legacy code

    If you need to refactor a table that would break a lot of code, you can replace the table with a view of the same name. The view provides the exact same schema as the original table, while the actual schema has changed. This keeps the legacy code that references the table from breaking, allowing you to change the legacy code at your leisure.
    These are just some of the many examples of how views can be useful.