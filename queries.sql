## Part 1: Test it with SQL
    SELECT *
    FROM job;
        id int(11)
        employer varchar(255)
        name varchar(255)
        skills varchar(255)


## Part 2: Test it with SQL
    SELECT name
    FROM employer
    WHERE location = "St. Louis City";


## Part 3: Test it with SQL
    DROP TABLE techjobs.job;

## Part 4: Test it with SQL
    SELECT name, description
    FROM skill
    WHERE job IS NOT NULL
    ORDER BY job;