USE negozio_db;

-- recuperare i prodotti acquistati dagli utenti
WITH
	TableA AS (
		SELECT o.EmailCliente, o.IDordine, c.Username  
		FROM cliente c 
		LEFT JOIN ordine o 
			ON o.EmailCliente = c.EmailCliente 
	),
	TableB AS (
		SELECT  OP.IDordine, p.Marca, p.Modello  
		FROM ordini_prodotti op  
		JOIN prodotto p 
			ON p.IDprodotto = op.IDprodotto 
	)
SELECT TableA.Username, TableA.IDordine , TableB.Marca, TableB.Modello
FROM TableA
LEFT JOIN TableB 
	ON TableB.IDordine = TableA.IDordine;

-- recuperare tutti i prodotto che costano più di 15€
SELECT * 
FROM prodotto p 
WHERE p.Prezzo > 15; 

-- recuperare i prodotti eventualmente comperati
SELECT p.*, IFNULL(o.IDordine, 'Mai ordinato') AS Ordine 
FROM prodotto p 
LEFT JOIN ordini_prodotti op 
	ON op.IDprodotto = p.IDprodotto 
LEFT JOIN ordine o 
	ON o.IDordine = op.IDordine;
		-- creare una view di questo risultato
		CREATE OR REPLACE VIEW prodottiEventualmenteComprati AS 
			SELECT p.*, IFNULL(o.IDordine, 'Mai ordinato') AS Ordine 
			FROM prodotto p 
			LEFT JOIN ordini_prodotti op 
				ON op.IDprodotto = p.IDprodotto 
			LEFT JOIN ordine o 
				ON o.IDordine = op.IDordine;
		-- creare una view per i prodotti mai comprati
		CREATE OR REPLACE VIEW prodottiMaiComprati AS
			SELECT *
			FROM prodottieventualmentecomprati p
			WHERE P.Ordine = 'Mai ordinato';
		-- creare una view per i prodotti effettivamente comprati
		CREATE OR REPLACE VIEW prodottiComprati AS
			SELECT *
			FROM prodottieventualmentecomprati p
			WHERE P.Ordine != 'Mai ordinato';
		
