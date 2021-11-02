SELECT
    select_list
FROM
    table_name
LIMIT [offset,] row_count;

select salary from employee limit 1,1; --first largest
select salary from employee limit 2,1; --second largest
select salary from employee order by salary desc limit 3,1; --third largest