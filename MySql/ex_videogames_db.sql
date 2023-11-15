## Query
### SELECT
-- 1- Selezionare tutte le software house americane (3)
SELECT *
FROM software_houses
WHERE `country` LIKE 'United States';

-- 2- Selezionare tutti i giocatori della città di 'Rogahnland' (2)
SELECT *
FROM players
WHERE city LIKE 'rogahnland'

-- 3- Selezionare tutti i giocatori il cui nome finisce per "a" (220)
SELECT *
FROM players
WHERE name LIKE '%a'

-- 4- Selezionare tutte le recensioni scritte dal giocatore con ID = 800 (11)
SELECT *
FROM reviews r 
WHERE player_id LIKE '800'

-- 5- Contare quanti tornei ci sono stati nell'anno 2015 (9)
SELECT count(*)
FROM tournaments t 
WHERE `year` LIKE '2015'

-- 6- Selezionare tutti i premi che contengono nella descrizione la parola 'facere' (2)
SELECT *
FROM awards a 
WHERE description LIKE '%facere%'

-- 7- Selezionare tutti i videogame che hanno la categoria 2 (FPS) o 6 (RPG), mostrandoli una sola volta (del videogioco vogliamo solo l'ID) (287)
SELECT DISTINCT videogames.id 
FROM videogames
JOIN category_videogame cv 
ON videogames.id = videogame_id  
WHERE category_id LIKE '2'
OR category_id LIKE '6'

-- 8- Selezionare tutte le recensioni con voto compreso tra 2 e 4 (2947)
SELECT *
FROM reviews r 
WHERE rating >= 2 AND rating <= 4

-- 9- Selezionare tutti i dati dei videogiochi rilasciati nell'anno 2020 (46)
SELECT * 
FROM videogames v 
WHERE YEAR(release_date) = 2020

-- 10- Selezionare gli id dei videogame che hanno ricevuto almeno una recensione da 5 stelle, mostrandoli una sola volta (443)
SELECT DISTINCT videogames.id 
FROM videogames 
JOIN reviews  
ON videogames.id = videogame_id
WHERE rating LIKE 5 

#### Bonus
-- 11- Selezionare il numero e la media delle recensioni per il videogioco con ID = 412 (review number = 12, avg_rating = 3.16 circa)
SELECT count(reviews.id), avg(rating)  
FROM videogames 
JOIN reviews  
ON videogames.id = videogame_id
WHERE videogames.id LIKE '412'

-- 12- Selezionare il numero di videogame che la software house con ID = 1 ha rilasciato nel 2018 (13)
SELECT count(videogames.id) 
FROM videogames 
WHERE software_house_id  LIKE '1'
AND YEAR(release_date) LIKE '2018'

---

### GROUP BY
-- 1- Contare quante software house ci sono per ogni paese (3)
SELECT count(*), country  
FROM software_houses
GROUP BY country 

-- 2- Contare quante recensioni ha ricevuto ogni videogioco (del videogioco vogliamo solo l'ID) (500)
SELECT count(reviews.id), videogames.id 
FROM reviews
JOIN videogames
ON videogames.id = videogame_id
GROUP BY videogames.id

-- 3- Contare quanti videogiochi hanno ciascuna classificazione PEGI (della classificazione PEGI vogliamo solo l'ID) (13)
SELECT count(videogames.id), pegi_labels.id
FROM videogames
JOIN pegi_label_videogame
ON videogame_id = videogames.id 
JOIN pegi_labels
ON pegi_label_id = pegi_labels.id 
GROUP BY pegi_labels.id 

-- 4- Mostrare il numero di videogiochi rilasciati ogni anno (11)
SELECT count(videogames.id), YEAR(release_date)
FROM videogames
GROUP BY YEAR(release_date)

-- 5- Contare quanti videogiochi sono disponbiili per ciascun device (del device vogliamo solo l'ID) (7)
SELECT count(v.id), d.id 
FROM videogames v
JOIN device_videogame dv 
ON dv.videogame_id  = v.id 
JOIN devices d 
ON dv.device_id = d.id 
GROUP BY d.id 

-- 6- Ordinare i videogame in base alla media delle recensioni (del videogioco vogliamo solo l'ID) (500)
SELECT v.id 
FROM videogames v 
JOIN reviews r 
ON r.videogame_id = v.id
GROUP BY v.id
ORDER BY avg(r.rating) 

---

### JOIN

-- 1- Selezionare i dati di tutti giocatori che hanno scritto almeno una recensione, mostrandoli una sola volta (996)
SELECT DISTINCT p.* 
FROM players p 
JOIN reviews r 
ON p.id = r.player_id 

-- 2- Sezionare tutti i videogame dei tornei tenuti nel 2016, mostrandoli una sola volta (226)
SELECT DISTINCT v.*
FROM videogames v 
JOIN tournament_videogame tv 
ON v.id = tv.videogame_id 
JOIN tournaments t 
ON t.id = tv.tournament_id 
WHERE t.`year` LIKE 2016

-- 3- Mostrare le categorie di ogni videogioco (1718)
SELECT *
FROM categories c 
JOIN category_videogame cv 
ON c.id = cv.category_id 
JOIN videogames v
ON v.id = cv.category_id 

-- 4- Selezionare i dati di tutte le software house che hanno rilasciato almeno un gioco dopo il 2020, mostrandoli una sola volta (6)
SELECT DISTINCT sh.*
FROM software_houses sh
JOIN videogames v 
ON sh.id = v.software_house_id 
WHERE YEAR(v.release_date) LIKE 2020

-- 5- Selezionare i premi ricevuti da ogni software house per i videogiochi che ha prodotto (55)
SELECT a.*
FROM awards a 
JOIN award_videogame av 
ON a.id = av.award_id 
JOIN videogames v 
ON v.id = av.videogame_id 
JOIN software_houses sh 
ON sh.id = v.software_house_id 

-- 6- Selezionare categorie e classificazioni PEGI dei videogiochi che hanno ricevuto recensioni da 4 e 5 stelle, mostrandole una sola volta (3363)
SELECT DISTINCT v.*, c.*, pl.*
FROM categories c 
JOIN category_videogame cv 
ON c.id = cv.category_id 
JOIN videogames v 
ON v.id = cv.videogame_id 
JOIN pegi_label_videogame plv 
ON v.id = plv.videogame_id 
JOIN pegi_labels pl 
ON pl.id = plv.pegi_label_id 
JOIN reviews r 
ON v.id = r.videogame_id 
WHERE r.rating >= 4

-- 7- Selezionare quali giochi erano presenti nei tornei nei quali hanno partecipato i giocatori il cui nome inizia per 'S' (474)
SELECT DISTINCT v.*
FROM videogames v 
JOIN tournament_videogame tv 
ON v.id = tv.videogame_id
JOIN tournaments t 
ON t.id = tv.tournament_id 
JOIN player_tournament pt 
ON t.id = pt.tournament_id 
JOIN players p 
ON p.id = pt.player_id 
WHERE p.name LIKE 'S%'

-- 8- Selezionare le città in cui è stato giocato il gioco dell'anno del 2018 (36)
SELECT v.*, a.*, av.`year`, t.city
FROM awards a 
JOIN award_videogame av 
ON a.id = av.award_id 
JOIN videogames v 
ON av.videogame_id = v.id 
JOIN tournament_videogame tv
ON v.id = tv.videogame_id 
JOIN tournaments t 
ON tv.tournament_id = t.id
WHERE a.name LIKE 'gioco dell\'anno' AND av.`year` = 2018;

-- 9- Selezionare i giocatori che hanno giocato al gioco più atteso del 2018 in un torneo del 2019 (3306)
SELECT p.*
FROM awards a 
JOIN award_videogame av 
ON a.id = av.award_id 
JOIN videogames v 
ON av.videogame_id = v.id 
JOIN tournament_videogame tv
ON v.id = tv.videogame_id 
JOIN tournaments t 
ON tv.tournament_id = t.id
JOIN player_tournament pt 
ON t.id = pt.tournament_id 
JOIN players p 
ON pt.player_id = p.id
WHERE a.name LIKE 'gioco più atteso' AND av.`year` = 2018 AND t.`year` = 2019;


#### Bonus
-- 10- Selezionare i dati della prima software house che ha rilasciato un gioco, assieme ai dati del gioco stesso (software house id : 5)
SELECT sh.*
FROM software_houses sh
JOIN videogames v 
ON sh.id = v.software_house_id
ORDER BY v.release_date
LIMIT 1;

-- 11- Selezionare i dati del videogame (id, name, release_date, totale recensioni) con più recensioni (videogame id : potrebbe uscire 449 o 398, sono entrambi a 20)
SELECT v.id, count(r.id)
FROM videogames v
JOIN reviews r  
ON v.id = r.videogame_id
GROUP BY v.id
ORDER BY count(r.id) DESC
LIMIT 1;

-- 12- Selezionare la software house che ha vinto più premi tra il 2015 e il 2016 (software house id : potrebbe uscire 3 o 1, sono entrambi a 3)
SELECT sh.*, count(av.id)
FROM software_houses sh 
JOIN videogames v  
ON sh.id = v.software_house_id 
JOIN award_videogame av 
ON v.id = av.videogame_id
WHERE av.`year` BETWEEN 2015 AND 2016
GROUP BY sh.id
ORDER BY count(av.id) DESC
LIMIT 1;