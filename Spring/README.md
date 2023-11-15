# spring-il-mio-fotoalbum

L'applicazione, utilizzata per gestire un album fotografico, è basata su Spring Boot, Vue.js e utilizza un database MySQL per la persistenza dei dati.

Backend:
AuthConfiguration: Configurazione di Spring Security. Imposta le regole di autorizzazione per le richieste HTTP e gestisce la configurazione per la gestione degli utenti.

ContactApiController: Un controller che gestisce le richieste API relative ai contatti. Implementa una funzione per la creazione di nuovi contatti attraverso richieste POST.

PhotoApiController: Un controller che gestisce le richieste API relative alle foto. Ha funzioni per recuperare tutte le foto e filtrarle per titolo attraverso richieste GET.

Frontend:
App.vue: Il componente principale Vue.js che rappresenta l'interfaccia utente dell'applicazione. Include una barra di navigazione, un elenco di foto filtrabili, e un modulo di contatto.

PhotoComp.vue: Un componente Vue.js che rappresenta singole foto nell'elenco. Visualizza il titolo e la descrizione della foto.

Persistenza dei dati:
Le entità come Category, Contact, Photo, e User sono classi Java annotate con @Entity, indicando che sono entità JPA.
Ci sono repository (CategoryRepo, ContactRepo, PhotoRepo, RoleRepo, UserRepo) che estendono JpaRepository per fornire operazioni CRUD per le entità.
Ci sono servizi (CategoryService, ContactService, PhotoService, RoleService, UserService) che contengono la logica di business e interagiscono con i repository.

Controller Web:
CategoryController: Gestisce le richieste web relative alle categorie, come la visualizzazione, la creazione, l'aggiornamento e l'eliminazione di categorie.

MainController: Reindirizza la richiesta principale alla pagina delle foto.

PhotoController: Gestisce le richieste web relative alle foto, compresa la visualizzazione, la creazione, l'aggiornamento, la ricerca e l'eliminazione di foto.

Inizializzazione dei dati di esempio:
SpringIlMioFotoalbumApplication: Applicazione principale di Spring Boot. Implementa CommandLineRunner per popolare il database con dati di esempio all'avvio dell'applicazione.

# spring-la-mia-pizzeria-crud

Questa è un'applicazione Spring Boot per la gestione di una pizzeria. Gli utenti possono visualizzare, creare, modificare ed eliminare le informazioni sulle pizze attraverso un'interfaccia web.

Controller (PizzaController):
Gestisce le richieste HTTP per le operazioni CRUD (Create, Read, Update, Delete) relative alle pizze.
Le annotazioni @GetMapping e @PostMapping vengono utilizzate per mappare i percorsi delle richieste HTTP ai metodi del controller.
Ad esempio, /pizza/{id} visualizza i dettagli di una pizza specifica.

Model (Pizza):
Rappresenta il modello di una pizza con attributi come name, description, picture, e price.
Viene utilizzata l'annotazione @Entity per indicare che questa classe è una classe di persistenza gestita da JPA.
La validazione viene effettuata utilizzando annotazioni come @NotBlank, @Size, @NotNull, e @Min.

Repository (PizzaRepo):
Estende JpaRepository di Spring Data JPA, semplificando le operazioni CRUD sul database.
Contiene metodi personalizzati come findByNameContaining per la ricerca di pizze per nome.

Service (PizzaService):
Fornisce metodi di servizio che chiamano i metodi del repository per eseguire operazioni sul database.
Questo strato di servizio può contenere logica aziendale aggiuntiva, ma in questo caso, sembra principalmente inoltrare le chiamate al repository.

Application (SpringLaMiaPizzeriaCrudApplication):
Punto di ingresso dell'applicazione Spring Boot.
Implementa l'interfaccia CommandLineRunner, che consente di eseguire il codice al momento dell'avvio dell'applicazione. In questo caso, alcune pizze di esempio vengono inserite nel database al momento dell'avvio.

Risorse HTML (src/main/resources/templates):
Contiene file HTML Thymeleaf per le pagine web, come la visualizzazione delle pizze, la creazione, l'aggiornamento e la visualizzazione dei dettagli di una pizza.

Proprietà dell'applicazione (application.properties):
Configurazione del database MySQL, con URL, nome utente e password.
spring.jpa.hibernate.ddl-auto=create indica che Hibernate creerà il database all'avvio dell'applicazione. In un ambiente di produzione, questo dovrebbe essere impostato su un valore più sicuro, come update o none.

# spring-la-mia-pizzeria-webapi

Un'applicazione web completa sviluppata per semplificare la gestione delle attività di pizzerie. Questa piattaforma offre un'esperienza intuitiva e potente, permettendo agli utenti di eseguire operazioni CRUD (Create, Read, Update, Delete) per le pizze, gli ingredienti e le offerte speciali.

Frontend (Vue.js)
Il frontend, costruito con Vue.js, presenta una struttura chiara e ben organizzata. Al centro di tutto c'è App.vue, che funge da nucleo dell'applicazione. Qui, troverai una barra di ricerca intelligente, denominata "PizzaFilter", progettata per semplificare la navigazione tra le numerose pizze disponibili. Accanto a questa, una lista di pizze in continua evoluzione grazie a una chiamata all'API REST fornita dal robusto backend Spring.
Ciascuna pizza nella lista è dotata di un pulsante "DELETE", consentendo una gestione flessibile direttamente dal frontend. Le richieste di eliminazione vengono elaborate dal backend attraverso un dedicato PizzaApiController.

Backend (Spring Boot)
Il backend, sviluppato utilizzando il framework Spring Boot, gestisce le richieste relative alle pizze attraverso il PizzaApiController, garantendo una gestione fluida e efficiente. Le informazioni sulle pizze sono immagazzinate in un database MySQL, e la persistenza è gestita con attenzione tramite i servizi PizzaService e PizzaRepo.
Gli ingredienti e le offerte speciali seguono lo stesso approccio, con rispettivi servizi e repository dedicati. Ogni aspetto del backend è progettato per offrire prestazioni ottimali e una scalabilità robusta.

Sicurezza
La sicurezza è una priorità, gestita attraverso Spring Security. Regole di accesso basate su ruoli (USER, ADMIN) assicurano che ogni utente abbia il livello di autorizzazione appropriato. Il sistema di autenticazione basato su form login e la crittografia delle password con BCrypt contribuiscono a una sicurezza solida e affidabile.

Database
Il database MySQL è il custode delle informazioni vitali per la pizzeria. Da ingredienti a offerte speciali, da ruoli a utenti, ogni entità è mappata in modo trasparente alle rispettive tabelle nel database, garantendo coerenza e affidabilità.

Pagine Web Dinamiche
L'aspetto visivo è gestito da controller Spring dedicati come PizzaController, IngredientController, e SpecialOfferController. Le pagine sono rese dinamiche grazie all'uso intelligente di template Thymeleaf, offrendo una user experience ricca e coinvolgente.

Inizializzazione del Database e Altre Configurazioni
All'avvio dell'applicazione, il database viene arricchito con dati di esempio attraverso SpringLaMiaPizzeriaCrudApplication. Una serie di ingredienti, pizze, offerte speciali, ruoli e utenti di esempio vengono inseriti, permettendoti di esplorare immediatamente tutte le funzionalità.

Ulteriori configurazioni, inclusa la sicurezza e il database, sono gestite rispettivamente in AuthConfiguration e application.properties. Il frontend è modulare, con componenti chiave come PizzaComp e PizzaFilter che rendono l'applicazione estremamente flessibile e personalizzabile.
