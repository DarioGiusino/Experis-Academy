# java-animals

Questo progetto Java rappresenta un'applicazione di gestione di animali, con un focus particolare sulle interazioni tra diverse categorie di animali. L'applicazione è sviluppata seguendo un'architettura orientata agli oggetti e utilizza interfacce per modellare il comportamento comune tra gli animali.

Struttura del Progetto
org.java.inter: Contiene le interfacce FlyingAnimal e SwimmingAnimal che definiscono il comportamento di volo e nuoto degli animali, rispettivamente.

org.java.obj.abs: Contiene la classe astratta Animal, che fornisce implementazioni di base per il verso, il mangiare e il dormire degli animali.

org.java.obj: Contiene le classi concrete che estendono la classe Animal e implementano le interfacce FlyingAnimal e SwimmingAnimal. Qui troviamo le implementazioni specifiche per il cane, il delfino, l'aquila e il pettirosso.

org.java.main: Include la classe AnimalManager, che gestisce le interazioni tra gli animali, consentendo loro di eseguire azioni specifiche come volare o nuotare.

Nel file Main.java, viene istanziato un array di animali, tra cui cane, delfino, aquila e pettirosso. Successivamente, l'AnimalManager viene utilizzato per coordinare le azioni di volo e nuoto di specifici animali.

L'applicazione dimostra l'utilizzo delle interfacce e delle classi astratte per modellare in modo efficace il comportamento degli animali, rendendo il codice flessibile ed estendibile.

# java-biglietto-treno

Questo repository contiene una serie di semplici progetti Java creati durante il percorso di apprendimento della programmazione in Java.

CalcolaBiglietto
Questo progetto consiste in un'applicazione per il calcolo del prezzo del biglietto del treno in base alla distanza da percorrere e all'età del passeggero. L'utente fornisce i chilometri da percorrere e la propria età, e l'applicazione calcola il prezzo del biglietto, applicando sconti per i passeggeri di età inferiore a 18 anni e superiore a 65 anni.

CheckGuest
CheckGuest è un'applicazione che verifica se un utente è presente o meno nella lista degli invitati. L'utente inserisce il proprio nome, e l'applicazione controlla se è presente nella lista degli invitati per un evento speciale. La verifica viene eseguita attraverso un ciclo while e un array di nomi.

CibiPreferiti
Questo progetto illustra il concetto di array in Java. L'applicazione definisce un array di cibi preferiti e stampa alcune informazioni, come la lunghezza dell'array, il primo e l'ultimo elemento, e l'elemento centrale.

FizzBuzz
FizzBuzz è un classico esercizio di programmazione. In questa versione, l'utente inserisce un numero, e l'applicazione stampa "Fizz" se il numero è divisibile per 3, "Buzz" se è divisibile per 5, e "FizzBuzz" se è divisibile sia per 3 che per 5. Altrimenti, stampa il numero stesso. L'obiettivo è praticare l'uso delle strutture di controllo in Java.

# java-calculator-tester-ex

Questo repository contiene due classi utilitarie in Java che possono essere integrate nei progetti per fornire funzionalità specifiche.

Calculator
La classe Calculator offre un insieme di operazioni matematiche di base. Attualmente, supporta le seguenti operazioni:
add(float num1, float num2): Restituisce la somma di due numeri.
subtract(float num1, float num2): Restituisce la differenza tra due numeri.
multiply(float num1, float num2): Restituisce il prodotto di due numeri.
divide(float num1, float num2): Restituisce il risultato della divisione tra due numeri. Si occupa dell'eccezione di divisione per zero.

Employee
La classe Employee rappresenta un dipendente e include campi per il nome, il cognome, la data di nascita e il ruolo. Fornisce anche metodi di set per ciascun campo, con controlli di validità per garantire dati corretti:
setFirstname(String firstname): Imposta il nome del dipendente, con una verifica sulla lunghezza minima del nome.
setLastname(String lastname): Imposta il cognome del dipendente, con una verifica sulla lunghezza minima del cognome.
setDateOfBirth(LocalDate dateOfBirth): Imposta la data di nascita del dipendente, con una verifica sulla validità della data.
setRole(String role): Imposta il ruolo del dipendente, con una verifica che consenta solo "employee" o "boss" come valori validi.

Entrambe le classi sono progettate per essere utilizzate come utility in progetti più ampi. Le eccezioni sono gestite in modo da garantire un utilizzo sicuro e coerente delle funzionalità offerte da queste classi.

# java-exceptions-books

Questa applicazione Java rappresenta un semplice Sistema di Gestione di una Biblioteca che consente agli utenti di creare e memorizzare informazioni sui libri. L'applicazione utilizza la gestione delle eccezioni per garantire la validità dei dati inseriti.

Classe Book
La classe Book rappresenta un'entità libro con attributi come titolo, numero di pagine, autore ed editore. La classe include metodi setter con gestione delle eccezioni per garantire che durante la creazione dell'oggetto vengano forniti dati validi.

Classe Library
La classe Library è la classe principale che interagisce con l'utente per creare una collezione di libri. Richiede all'utente il numero di libri da creare e raccoglie in modo iterativo le informazioni per ciascun libro, creando oggetti Book. La gestione delle eccezioni assicura che vengano accettati solo dati validi e l'utente viene invitato a riprovare in caso di errori.

Gli oggetti Book creati vengono quindi scritti su un file di testo e il contenuto del file viene visualizzato all'utente, simulando un record di biblioteca di base.

# java-gestore-eventi

Questa applicazione Java rappresenta un sistema di gestione eventi con funzionalità di prenotazione dei posti. L'applicazione è progettata per consentire agli utenti di creare e gestire eventi, prenotare e cancellare posti, e visualizzare informazioni dettagliate sugli eventi.

Pacchetto org.java.main
Main.java: La classe principale dell'applicazione che guida l'utente attraverso la creazione di un nuovo evento. Offre opzioni per prenotare e cancellare posti e visualizzare un riepilogo degli eventi.

Pacchetto org.java.obj
Event.java: Rappresenta un evento generico con attributi come titolo, data, numero totale di posti e posti prenotati. Fornisce metodi per aggiungere e rimuovere posti.
Concert.java: Estende la classe Event e aggiunge attributi specifici per i concerti, come l'orario e il prezzo del biglietto. Fornisce metodi per formattare l'orario e il prezzo.
EventPlan.java: Rappresenta un piano di eventi, contenente una lista di eventi. Offre metodi per aggiungere eventi, visualizzare la lista di eventi in ordine cronologico e altro.

Funzionalità Principali
Creazione di un nuovo evento con titolo, data e numero totale di posti disponibili.
Prenotazione di posti per un evento specifico.
Cancellazione di posti prenotati per un evento.
Visualizzazione di un riepilogo dei posti prenotati e disponibili per un evento.
Creazione di eventi specifici come concerti con attributi aggiuntivi come orario e prezzo del biglietto.
Gestione di un piano di eventi contenente una lista di eventi con ordinamento cronologico.
Visualizzazione dettagliata degli eventi nel piano, inclusi concerti con orario e prezzo.

# java-inheritance-shop

Questa applicazione Java implementa un catalogo elettronico con la possibilità di inserire e visualizzare prodotti di diverse categorie. L'ereditarietà è utilizzata per modellare le relazioni tra i prodotti, facilitando l'aggiunta di nuove categorie in futuro.

Pacchetto org.java.lessons.inheritance
Catalogo.java: La classe principale dell'applicazione che gestisce l'inserimento di prodotti nel catalogo.
Pacchetto org.java.lessons.inheritance
Prodotto.java: La classe base per tutti i prodotti. Genera automaticamente un codice casuale e fornisce informazioni di base come nome, marca, prezzo e IVA.
Smartphone.java: Estende la classe Prodotto e aggiunge attributi specifici per gli smartphone, come IMEI e capacità di memoria.
Televisore.java: Estende la classe Prodotto e aggiunge attributi specifici per i televisori, come dimensioni in pollici e indicazione se è una Smart TV.
Cuffia.java: Estende la classe Prodotto e aggiunge attributi specifici per le cuffie, come colore e indicazione se sono wireless.

Pacchetto org.java.lessons.inheritance
Shop.java: La classe Shop fornisce esempi di creazione di prodotti di diverse categorie e ne mostra l'output.

Funzionalità Principali
Inserimento di prodotti nel catalogo, con scelta tra Smartphone, Televisore, Cuffie o uscita.
Creazione automatica di un codice casuale per ogni prodotto.
Visualizzazione dettagliata dei prodotti inseriti nel catalogo.

# java-nations-db-ex

Questo programma Java si occupa di recuperare informazioni sulle nazioni da un database MySQL. Utilizza la connessione JDBC per interrogare il database e restituire i risultati in base a un parametro di ricerca inserito dall'utente.

Connessione al Database
Viene stabilita una connessione al database MySQL locale utilizzando JDBC.
Le credenziali di accesso al database (URL, nome utente e password) sono configurate come variabili.

Query SQL
Viene utilizzata una query SQL complessa per ottenere informazioni dettagliate sulle nazioni, compreso il nome della nazione, l'ID della nazione, il nome della regione e il nome del continente.
La query include una clausola LIKE per filtrare i risultati in base a un parametro di ricerca inserito dall'utente.
I risultati sono ordinati per nome della nazione.

Input Utente
Viene utilizzato uno scanner per acquisire il parametro di ricerca dall'utente.
Elaborazione dei Risultati
I risultati della query vengono elaborati utilizzando un oggetto ResultSet.
Le informazioni estratte vengono stampate sulla console.

Gestione Eccezioni
La connessione al database e le operazioni di query sono incapsulate in un blocco try-with-resources per garantire la corretta chiusura delle risorse.
In caso di eccezioni durante la connessione o l'esecuzione della query, viene visualizzato un messaggio di errore.

# java-oop-shop

Applicazione di Banca
L'applicazione Bank consente agli utenti di creare un conto bancario personale, effettuare operazioni come deposito e prelievo e visualizzare il saldo del conto. L'utente può interagire con l'applicazione inserendo le sue scelte tramite la console.
Creazione del Conto: L'utente inserisce il proprio nome per creare un nuovo conto bancario.
Operazioni Disponibili:
Aggiungi Denaro: L'utente può inserire denaro nel conto specificando l'importo.
Preleva Denaro: L'utente può prelevare denaro dal conto specificando l'importo.
Uscita: L'utente può uscire dall'applicazione.

Applicazione di Negozio di Prodotti
L'applicazione Shop mostra un esempio di utilizzo di una classe Prodotto che rappresenta un articolo in un negozio. Ogni prodotto ha un ID, un nome, una descrizione, un prezzo, e un'aliquota IVA. L'applicazione crea un prodotto di esempio e lo visualizza sulla console.
Creazione del Prodotto: Viene creato un prodotto di esempio utilizzando la classe Prodotto.
Visualizzazione del Prodotto: Le informazioni del prodotto vengono visualizzate sulla console.

Descrizione Generale
Conto Bancario:
Il conto bancario è rappresentato dalla classe Conto.
Un nuovo conto viene creato con un ID casuale e un saldo iniziale di zero.
L'utente può effettuare operazioni di deposito e prelievo sul conto.
L'applicazione mostra il saldo del conto dopo ogni operazione.
Negozio di Prodotti:
I prodotti sono rappresentati dalla classe Prodotto.
Ogni prodotto ha un ID casuale, un nome, una descrizione, un prezzo e un'IVA.
Viene utilizzata una formattazione speciale per l'ID del prodotto.
Le informazioni del prodotto, inclusi prezzo e IVA, vengono visualizzate sulla console.

# java-snacks

Questo repository contiene una serie di semplici programmi Java denominati "snack", ognuno progettato per affrontare un problema specifico o illustrare un concetto di programmazione.

JavaSnack1
Chiede all'utente di inserire un numero.
Restituisce il numero stesso se è pari, altrimenti restituisce il successivo numero dispari.

JavaSnack2
Genera casualmente coppie di nomi e cognomi da elenchi prestabiliti.
Stampa le coppie generate sulla console.

JavaSnack3
Calcola la somma degli elementi in posizione dispari di un array di numeri interi predefinito.

JavaSnack4
Chiede all'utente di inserire una stringa.
Determina se la stringa è palindroma o meno.

JavaSnack5
Chiede all'utente di inserire un numero.
Genera un array di numeri casuali.
Calcola e mostra diverse statistiche sull'array generato.

JavaSnack6
Chiede all'utente di inserire un valore limite.
Genera numeri casuali e li somma fino a superare il limite.

JavaSnack7
Genera casualmente un numero compreso tra 0 e 100 che sia sia divisibile per 3 che per 5.

JavaSnack8
Genera 10 numeri casuali.
Suddivide i numeri generati in due array separati: uno per i numeri pari e uno per quelli dispari.

JavaSnack9
Chiede all'utente di inserire altezza e base di un rettangolo.
Calcola e mostra l'area e il perimetro del rettangolo.

JavaSnack10
Chiede all'utente di inserire il raggio di un cerchio.
Calcola e mostra l'area e la circonferenza del cerchio.

JavaSnack11
Chiede all'utente di inserire un numero.
Trova e mostra tutti i divisori del numero inserito.

JavaSnack12
Combina due array di numeri interi in un nuovo array.

JavaSnack13
Scambia il primo elemento di due array di numeri interi tra loro.

Ogni snack è progettato per essere eseguito indipendentemente e offre un piccolo esempio di implementazione pratica di un concetto specifico.
