-- Write queries to return the following:
-- The following queries utilize the "world" database.

-- 1. The city name, country name, and city population of all cities in Europe with population greater than 1 million
-- (36 rows)

select ci.name as cityname, co.name as countryname, ci.population
from city ci
left join country co
on co.code = ci.countrycode
where co.continent = 'Europe' and ci.population > 1000000;

-- 2. The city name, country name, and city population of all cities in countries where French is an official language and the city population is greater than 1 million
-- (2 rows)

select ci.name as cityname, co.name as countryname, ci.population, cl.language
from city ci
left join country co
on co.code = ci.countrycode
right join countrylanguage cl
on co.code = cl.countrycode
where cl.language = 'French' and cl.isofficial = 'true' and ci.population > 1000000;

-- 3. The name of the countries and continents where the language Javanese is spoken
-- (1 row)

select co.name as countryname, co.continent as continent, cl.language
from country co
left join countrylanguage cl
on co.code = cl.countrycode
where cl.language = 'Japanese' and cl.isofficial = 'true';

-- 4. The names of all of the countries in Africa that speak French as an official language
-- (5 row)

select co.name as countryname, cl.language
from country co
left join countrylanguage cl
on co.code = cl.countrycode
where cl.language = 'French' and cl.isofficial = 'true' and co.continent = 'Africa';

-- 5. The average city population of cities in Europe
-- (average city population in Europe: 287,684)

select trunc(avg(ci.population)) as avgpop
from city ci
left join country co
on ci.countrycode = co.code
where co.continent = 'Europe';

-- 6. The average city population of cities in Asia
-- (average city population in Asia: 395,019)

select trunc(avg(ci.population)) as avgpop
from city ci
left join country co
on ci.countrycode = co.code
where co.continent = 'Asia';

-- 7. The number of cities in countries where English is an official language
-- (number of cities where English is official language: 523)

select count(ci.name) as counter, cl.language
from city ci
left join country co
on co.code = ci.countrycode
right join countrylanguage cl
on co.code = cl.countrycode
where cl.language = 'English' and cl.isofficial = 'true'
group by cl.language;


-- 8. The average population of cities in countries where the official language is English
-- (average population of cities where English is official language: 285,809)
select trunc(avg(ci.population)) as avgpop, cl.language
from city ci
left join country co
on co.code = ci.countrycode
right join countrylanguage cl
on co.code = cl.countrycode
where cl.language = 'English' and cl.isofficial = 'true'
group by cl.language;


-- 9. The names of all of the continents and the population of the continent’s largest city
-- (6 rows, largest population for North America: 8,591,309)

select co.continent, max(ci.population)
from city ci
left join country co
on co.code = ci.countrycode
group by co.continent;


-- 10. The names of all of the cities in South America that have a population of more than 1 million people and the official language of each city’s country
-- (29 rows)

select ci.name, cl.language
from city ci
left join country co
on co.code = ci.countrycode
right join countrylanguage cl
on co.code = cl.countrycode
where cl.isofficial = 'true' and ci.population > 1000000 and co.continent = 'South America';



