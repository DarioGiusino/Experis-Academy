USE world;

-- visualizzare la città italiana con maggiore popolazione
SELECT c.Name, c.Population 
FROM city c 
WHERE c.CountryCode = 'ITA'
AND c.Population = (SELECT MAX(c.Population)
					FROM city c
					WHERE c.CountryCode = 'ITA');

-- visualizzare per ogni continente la citta con minore surface area ( 1 )
SELECT tableA.Continent, tableA.MinSurfaceArea, tableB.Name
FROM (SELECT Continent, min(SurfaceArea) AS MinSurfaceArea
		FROM Country
		GROUP BY Continent) tableA
JOIN (SELECT Name, SurfaceArea, Continent
		FROM Country) tableB
ON (tableA.Continent = tableB.Continent AND tableA.MinSurfaceArea = SurfaceArea);

-- visualizzare per ogni continente la citta con minore surface area ( 2 )
SELECT c.Continent ,  min(c.SurfaceArea)
FROM country c
GROUP BY c.Continent;

-- visualizzare per ogni continente la citta con minore surface area ( 3 )
SELECT c1.Continent, c1.Name, c1.SurfaceArea
FROM Country c1
WHERE c1.SurfaceArea = (SELECT MIN(c2.SurfaceArea)
					    FROM Country c2
					    WHERE c2.Continent = c1.Continent);

-- visualizzare città che iniziano per 's' e finiscono per 'a'
SELECT Name
FROM city
WHERE name LIKE 's%a'

-- visualizzare le città che hanno il nome di almeno 5 lettere
SELECT Name
FROM city
WHERE length(Name) >= 5;

-- visualizzare le città che hanno almeno 'to' nel nome
SELECT Name
FROM city
WHERE Name Like '%to%';

-- visualizzare le città con almeno 6 caratteri, che al 3° char ci sia la 'n' e che al 5° ci sia la 'm'
SELECT c.Name 
FROM city c 
WHERE c.Name LIKE '__n_m_%';

-- visualizzare le nazioni americane che abbiano l'aspettativa di vita superiore al 70 utilizzando IN
SELECT c.Name, c.Continent, c.LifeExpectancy 
FROM country c
WHERE c.LifeExpectancy > 70 AND c.Continent IN('North America', 'South America')
-- WHERE c.LifeExpectancy > 70 AND c.Continent LIKE '%America'
-- WHERE c.LifeExpectancy > 70 AND (c.Continent = 'North America' OR c.Continent = 'South America')
ORDER BY c.Continent, c.LifeExpectancy DESC;

-- visualizzare tutte le nazioni che abbiano l'anno di indipendenza che va dal 1500 al 1900 e che siano delle repubbliche
SELECT c.Name, c.GovernmentForm, c.IndepYear 
FROM country c 
WHERE c.IndepYear BETWEEN 1500 AND 1900 
	AND c.GovernmentForm LIKE '%republic%'
ORDER BY c.GovernmentForm DESC, c.IndepYear;

-- visualizzare per ogni nazione le lingue parlate con la corrispettiva percentuale. utilizzare JOIN
SELECT c.Name, c2.`Language`, c2.Percentage  
FROM country c 
JOIN countrylanguage c2 
	ON c.Code = c2.CountryCode
ORDER BY c.Name, c2.Percentage DESC;

-- visualizzare per ogni città l'eventuale anno di indipendenza della nazione, utilizzare JOIN
SELECT c.Name AS nome_citta, c2.Name AS nome_nazione, c2.IndepYear  
FROM city c 
JOIN country c2 
	ON c.CountryCode = c2.Code
WHERE c2.IndepYear IS NOT NULL; 

-- visualizzare per ogni nazione le lingue ufficiali
SELECT c.Name, c2.`Language`, c2.IsOfficial 
FROM country c 
JOIN countrylanguage c2 
	ON c.Code = c2.CountryCode 
WHERE c2.IsOfficial = 'T'
ORDER BY c.Name;

-- visualizzare per ogni nazione le lingue ufficiali ( 1 )
SELECT  country.Name, TableA.Language , TableA.IsOfficial
FROM country
LEFT JOIN (SELECT countrylanguage.CountryCode , countrylanguage.Language , countrylanguage.IsOfficial
			FROM countrylanguage
			WHERE countrylanguage.IsOfficial LIKE 'T') TableA 
ON TableA.CountryCode = country.Code;

-- visualizzare la percentuale maggioritaria delle lingue parlate per ogni nazione
SELECT c.Name, c2.`Language`, c2.Percentage  
FROM country c 
JOIN countrylanguage c2 
	ON c.Code = c2.CountryCode
WHERE c2.Percentage = (SELECT MAX(c3.Percentage)
						FROM countrylanguage c3
						WHERE c3.CountryCode = c.Code)
ORDER BY c.Name;

-- visualizzare per ogni nazione un messaggio testuale per indicare se presente o meno una lingua ufficiale
SELECT  c.Name, IFNULL(c3.LANGUAGE, 'non presente') AS Language, IFNULL(c3.IsOfficial, 'non presente') AS Official
FROM country c 
LEFT JOIN (SELECT c2.CountryCode , c2.Language , c2.IsOfficial
			FROM countrylanguage c2
			WHERE c2.IsOfficial LIKE 'T') c3
ON c3.CountryCode = c.Code;
