**Theatre Booking System (Java Console Application)**

A simple Java-based console application that allows users to view seat availability, book tickets, and view booking statistics for a theatre.
This project demonstrates core Java concepts like arrays, loops, conditional statements, and user input handling.

**Project Overview**

The Theatre Booking System is a console program that simulates a small theatre with a fixed number of rows and seats.
Users can:

View current seat availability

Book seats

See booking statistics such as total income and available seats

This project is ideal for beginners learning Java programming and basic object-oriented logic.

**Features**

Display seating arrangement (Available & Booked seats)
Book a ticket by choosing row and seat number
Prevent double-booking of seats
Show booking statistics (total, booked, and available seats + income)
Simple menu-driven interface

**Concepts Used**

2D Arrays (boolean[][])

Loops (for, do-while)

Conditional statements (if-else, switch)

User input handling using Scanner

Constants and static methods

**System Requirements**
Requirement	Description
Language	Java (JDK 8 or higher)
IDE (optional)	IntelliJ IDEA / NetBeans / VS Code
Execution	Runs on Command Line / Terminal

**Project Structure**
TheatreBookingSystem/
│
├── TheatreBookingSystem.java   # Main source file
├── README.md                   # Project documentation
└── (Optional) screenshots/     # Console screenshots

** How to Run the Program**
1. Compile the code
javac TheatreBookingSystem.java

2. Run the program
java TheatreBookingSystem

** Menu Options**
Option	Description
1. Show Seats	Displays seat availability (O = Available, X = Booked)
2. Book Ticket	Allows user to select a seat to book
3. Show Statistics	Shows total seats, booked seats, available seats, and total income
4. Exit	Exits the program
 
 **Ticket Details**

Ticket Price: ₹150 per seat

Total Seats: 5 rows × 10 seats = 50 seats

** Example Output**
THEATRE BOOKING SYSTEM
1. Show Seats
2. Book Ticket
3. Show Statistics
4. Exit
Enter your choice: 1

Seating Arrangement (O = Available, X = Booked)
    1  2  3  4  5  6  7  8  9 10
    
R1  O  O  O  O  O  O  O  O  O  O

R2  O  O  O  O  O  O  O  O  O  O

...

Enter row number (1-5): 2
Enter seat number (1-10): 4
Ticket booked successfully! Price: ₹150

Booking Statistics:
Total Seats: 50
Booked Seats: 5
Available Seats: 45
Total Income: ₹750

** Possible Enhancements**

 Future improvements you can add:

Add seat categories (Premium, Normal, Balcony)

Allow dynamic pricing per row

Add user login system

Store booking data in a file or database (MySQL)

Implement a GUI (Swing/JavaFX) version

 Author

Prithivrajan T
 Email: prithiv1999t@gmail.com

 GitHub: PRITHIV238734

 LinkedIn: prithivrajan-t-641178219


