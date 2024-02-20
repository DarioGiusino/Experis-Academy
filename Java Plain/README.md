# java-animals

This Java project represents an animal management application, with a particular focus on interactions between different categories of animals. The application is developed following an object-oriented architecture and uses interfaces to model common behavior among animals.

Project Structure
org.java.inter: Contains the interfaces FlyingAnimal and SwimmingAnimal, defining the flying and swimming behavior of animals, respectively.
org.java.obj.abs: Contains the abstract class Animal, providing basic implementations for animals' sound, eating, and sleeping behaviors.
org.java.obj: Contains concrete classes extending the Animal class and implementing the FlyingAnimal and SwimmingAnimal interfaces. Here you'll find specific implementations for the dog, dolphin, eagle, and robin.
org.java.main: Includes the AnimalManager class, which manages interactions between animals, allowing them to perform specific actions like flying or swimming.

In the Main.java file, an array of animals is instantiated, including a dog, dolphin, eagle, and robin. Subsequently, the AnimalManager is used to coordinate the flying and swimming actions of specific animals.

The application demonstrates the use of interfaces and abstract classes to effectively model animal behavior, making the code flexible and extensible.

# java-biglietto-treno

This repository contains a series of simple Java projects created during the Java programming learning path.

CalcolaBiglietto
This project is an application for calculating train ticket prices based on the distance to travel and the passenger's age. The user provides the kilometers to travel and their age, and the application calculates the ticket price, applying discounts for passengers under 18 and over 65 years old.

CheckGuest
CheckGuest is an application that checks whether a user is present or not on the guest list. The user enters their name, and the application checks if it is present on the guest list for a special event. The check is performed using a while loop and an array of names.

CibiPreferiti
This project illustrates the concept of arrays in Java. The application defines an array of favorite foods and prints some information, such as the array's length, the first and last elements, and the middle element.

FizzBuzz
FizzBuzz is a classic programming exercise. In this version, the user enters a number, and the application prints "Fizz" if the number is divisible by 3, "Buzz" if it is divisible by 5, and "FizzBuzz" if it is divisible by both 3 and 5. Otherwise, it prints the number itself. The goal is to practice the use of control structures in Java.

# java-calculator-tester-ex

This repository contains two utility classes in Java that can be integrated into projects to provide specific functionalities.

Calculator
The Calculator class offers a set of basic mathematical operations. Currently, it supports the following operations:
add(float num1, float num2): Returns the sum of two numbers.
subtract(float num1, float num2): Returns the difference between two numbers.
multiply(float num1, float num2): Returns the product of two numbers.
divide(float num1, float num2): Returns the result of dividing two numbers. It handles the division by zero exception.

Employee
The Employee class represents an employee and includes fields for the first name, last name, date of birth, and role. It also provides setter methods for each field, with validity checks to ensure correct data:
setFirstname(String firstname): Sets the employee's first name, with a check on the minimum length of the name.
setLastname(String lastname): Sets the employee's last name, with a check on the minimum length of the last name.
setDateOfBirth(LocalDate dateOfBirth): Sets the employee's date of birth, with a check on the validity of the date.
setRole(String role): Sets the employee's role, with a check allowing only "employee" or "boss" as valid values.

Both classes are designed to be used as utilities in larger projects. Exceptions are handled to ensure safe and consistent use of the functionalities offered by these classes.

# java-exceptions-books

This Java application represents a simple Library Management System that allows users to create and store information about books. The application uses exception handling to ensure the validity of the entered data.

Book Class
The Book class represents a book entity with attributes such as title, number of pages, author, and publisher. The class includes setter methods with exception handling to ensure that valid data is provided during object creation.

Library Class
The Library class is the main class that interacts with the user to create a collection of books. It prompts the user for the number of books to create and iteratively gathers information for each book, creating Book objects. Exception handling ensures that only valid data is accepted, and the user is prompted to retry in case of errors.

The created Book objects are then written to a text file, and the file's contents are displayed to the user, simulating a basic library record.

# java-gestore-eventi

This Java application represents an event management system with seat reservation functionality. The application is designed to allow users to create and manage events, book and cancel seats, and view detailed information about events.

Package org.java.main
Main.java: The main class of the application that guides the user through the creation of a new event. It provides options to book and cancel seats and display a summary of events.

Package org.java.obj
Event.java: Represents a generic event with attributes such as title, date, total number of seats, and booked seats. Provides methods to add and remove seats.
Concert.java: Extends the Event class and adds specific attributes for concerts, such as time and ticket price. Provides methods to format time and price.
EventPlan.java: Represents an event plan, containing a list of events. Provides methods to add events, display the list of events in chronological order, and more.

Main Features
Creation of a new event with title, date, and total number of available seats.
Booking seats for a specific event.
Cancellation of booked seats for an event.
Display of a summary of booked and available seats for an event.
Creation of specific events such as concerts with additional attributes like time and ticket price.
Management of an event plan containing a list of events with chronological sorting.
Detailed display of events in the plan, including concerts with time and price.

# java-inheritance-shop

This Java application implements an electronic catalog with the ability to add and display products from different categories. Inheritance is used to model relationships between products, making it easier to add new categories in the future.

Package org.java.lessons.inheritance
Catalogo.java: The main class of the application responsible for handling product insertion into the catalog.

Package org.java.lessons.inheritance
Prodotto.java: The base class for all products. Automatically generates a random code and provides basic information such as name, brand, price, and VAT.
Smartphone.java: Extends the Prodotto class and adds specific attributes for smartphones, such as IMEI and memory capacity.
Televisore.java: Extends the Prodotto class and adds specific attributes for televisions, such as size in inches and indication if it is a Smart TV.
Cuffia.java: Extends the Prodotto class and adds specific attributes for headphones, such as color and indication if they are wireless.

Package org.java.lessons.inheritance
Shop.java: The Shop class provides examples of creating products from different categories and displays their output.

Main Features
Insertion of products into the catalog, with choices between Smartphone, Television, Headphones, or exit.
Automatic creation of a random code for each product.
Detailed display of inserted products in the catalog

.

# java-nations-db-ex

This Java program retrieves information about nations from a MySQL database. It uses JDBC connection to query the database and return results based on a search parameter entered by the user.

Database Connection
Establishes a connection to the local MySQL database using JDBC.
Access credentials to the database (URL, username, and password) are configured as variables.

SQL Queries
A complex SQL query is used to obtain detailed information about nations, including the nation's name, nation ID, region name, and continent name.
The query includes a LIKE clause to filter results based on a search parameter entered by the user.
Results are sorted by nation name.

User Input
A scanner is used to acquire the search parameter from the user.
Results Processing
The query results are processed using a ResultSet object.
Extracted information is printed to the console.

Exception Handling
Database connection and query operations are encapsulated in a try-with-resources block to ensure proper resource closure.
In case of exceptions during connection or query execution, an error message is displayed.

# java-oop-shop

Bank Application
The Bank application allows users to create a personal bank account, perform operations like deposit and withdrawal, and view the account balance. The user can interact with the application by entering their choices via the console.
Account Creation: The user enters their name to create a new bank account.
Available Operations:
Add Money: The user can input money into the account specifying the amount.
Withdraw Money: The user can withdraw money from the account specifying the amount.
Exit: The user can exit the application.

Product Shop Application
The Shop application demonstrates an example usage of a Product class representing an item in a shop. Each product has an ID, name, description, price, and VAT rate. The application creates an example product and displays it on the console.
Product Creation: An example product is created using the Product class.
Product Display: The product information is displayed on the console.

General Description
Bank Account:
The bank account is represented by the Account class.
A new account is created with a random ID and an initial balance of zero.
The user can perform deposit and withdrawal operations on the account.
The application shows the account balance after each operation.
Product Shop:
Products are represented by the Product class.
Each product has a random ID, name, description, price, and VAT.
Special formatting is used for the product ID.
Product information, including price and VAT, is displayed on the console.

# java-snacks

This repository contains a series of simple Java programs called "snacks," each designed to address a specific problem or illustrate a programming concept.

JavaSnack1
Asks the user to enter a number.
Returns the number itself if it is even, otherwise returns the next odd number.

JavaSnack2
Randomly generates pairs of names and surnames from predefined lists.
Prints the generated pairs to the console.

JavaSnack3
Calculates the sum of elements at odd positions in a predefined array of integers.

JavaSnack4
Asks the user to enter a string.
Determines whether the string is a palindrome or not.

JavaSnack5
Asks the user to enter a number.
Generates an array of random numbers.
Calculates and shows various statistics on the generated array.

JavaSnack6
Asks the user to enter a limit value.
Generates random numbers and sums them until the limit is exceeded.

JavaSnack7
Randomly generates a number between 0 and 100 that is divisible by both 3 and 5.

JavaSnack8
Generates 10 random numbers.
Divides the generated numbers into two separate arrays: one for even numbers and one for odd numbers.

JavaSnack9
Asks the user to enter the height and base of a rectangle.
Calculates and shows the area and perimeter of the rectangle.

JavaSnack10
Asks the user to enter the radius of a circle.
Calculates and shows the area and circumference of the circle.

JavaSnack11
Asks the user to enter a number.
Finds and shows all divisors of the entered number.

JavaSnack12
Combines two arrays of integers into a new array.

JavaSnack13
Swaps the first element of two arrays of integers with each other.

Each snack is designed to be run independently and provides a small example of the practical implementation of a specific concept.
