DROP DATABASE IF EXISTS negozio_db;
CREATE DATABASE negozio_db;

USE negozio_db;

	-- CREATE TABLE cliente
	-- DROP TABLE IF EXISTS cliente;
	CREATE TABLE cliente(
		EmailCliente varchar(250) NOT NULL,
		Username varchar(250),
		Nome varchar(250),
		Cognome varchar(250),
		Indirizzo varchar(250),
		PRIMARY KEY (EmailCliente)
	);

	-- CREATE TABLE ordine
	-- DROP TABLE IF EXISTS ordine;
	CREATE TABLE ordine(
		IDordine int NOT NULL AUTO_INCREMENT,
		EmailCliente varchar(250),
		DataOrdine date,
		CostoTotale float,
		PRIMARY KEY (IDordine)
	);

	-- CREATE TABLE prodotto
	-- DROP TABLE IF EXISTS prodotto;
	CREATE TABLE prodotto(
		IDprodotto int NOT NULL AUTO_INCREMENT,
		Marca varchar(250),
		Modello varchar(250),
		Descrizione varchar(250),
		Prezzo float,
		Qta int,
		PRIMARY KEY (IDprodotto)
	);

	-- CREATE TABLE ordini_prodotti
	-- DROP TABLE IF EXISTS ordini_prodotti;
	CREATE TABLE ordini_prodotti(
		IDordine int,
		IDprodotto int,
		Qta int
	);
	
	-- ALTER TABLE cliete per aggiungere UNIQUE alla email
	ALTER TABLE cliente 
		ADD UNIQUE(EmailCliente);
		
	-- ALTER TABLE ordine per aggiungere una PRIMARY KEY
	ALTER TABLE ordine
		ADD FOREIGN KEY (EmailCliente) REFERENCES cliente(EmailCliente);
	
	-- ALTER TABLE ordini_prodotti per aggiungere una PRIMARY KEY e due FOREIGN KEY legate alle tabelle ordine e prodotto
	ALTER TABLE ordini_prodotti 
		ADD CONSTRAINT ordine_pk_prodotto PRIMARY KEY (IDordine, IDprodotto);
	ALTER TABLE ordini_prodotti 
		ADD FOREIGN KEY (IDordine) REFERENCES ordine(IDordine);
	ALTER TABLE ordini_prodotti 
		ADD FOREIGN KEY (IDprodotto) REFERENCES prodotto(IDprodotto);
	
	-- INSERT INTO __ VALUES __
	INSERT INTO cliente VALUES ('email1@prova.com','Nickname1','Nome1', 'Cognome1', 'indirizzo, 1');
	INSERT INTO cliente VALUES ('email2@prova.com','Nickname2','Nome2', 'Cognome2', 'indirizzo, 2');
	INSERT INTO cliente VALUES ('email3@prova.com','Nickname3','Nome3', 'Cognome3', 'indirizzo, 3');
	INSERT INTO cliente VALUES ('email4@prova.com','Nickname4','Nome4', 'Cognome4', 'indirizzo, 4');
	INSERT INTO cliente VALUES ('email5@prova.com','Nickname5','Nome5', 'Cognome5', 'indirizzo, 5');
	
	INSERT INTO ordine VALUES (1, 'email4@prova.com', '1999-05-01', 1.23);
	INSERT INTO ordine VALUES (2, 'email3@prova.com', '1999-05-02', 4.56);
	INSERT INTO ordine VALUES (3, 'email5@prova.com', '1999-05-03', 7.89);
	INSERT INTO ordine VALUES (4, 'email2@prova.com', '1999-05-04', 10.11);
	INSERT INTO ordine VALUES (5, 'email1@prova.com', '1999-05-05', 12.13);
	
	INSERT INTO prodotto VALUES (1, 'marca1', 'modello1', 'descrizione1', 5.55, 9);
	INSERT INTO prodotto VALUES (2, 'marca2', 'modello2', 'descrizione2', 18.55, 19);
	INSERT INTO prodotto VALUES (3, 'marca3', 'modello3', 'descrizione3', 163.55, 29);
	INSERT INTO prodotto VALUES (4, 'marca4', 'modello4', 'descrizione4', 6.55, 39);
	INSERT INTO prodotto VALUES (5, 'marca5', 'modello5', 'descrizione5', 12.55, 49);
	
	INSERT INTO ordini_prodotti VALUES (1, 2, 123);
	INSERT INTO ordini_prodotti VALUES (2, 3, 456);
	INSERT INTO ordini_prodotti VALUES (4, 5, 789);
	