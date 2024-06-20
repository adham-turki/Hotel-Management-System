# Hotel-management-System
- Students:
- Adham Ibraheem #1210354
- Ayham Ayyash #1210865
# Project Overview
- This project is an API designed to manage a hotel reservation system. The system includes various resources such as users, customers, employees, reservations, rooms, and housekeeping tasks.

# Resources and Descriptions
1. User
- Table: user
- Fields:
- user-id (Primary Key): Unique identifier for the user.
- email: User's email address.
- password: User's password (should be stored securely, typically hashed).
- active: Status indicating whether the user account is active.
- type: Type of user (e.g., admin, customer, employee).
- Description:
The user resource manages the authentication and authorization of users within the system. It includes essential details like email, password, account status, and user type.

2. Customer
- Table: customer
- Fields:
- id (Primary Key): Unique identifier for the customer.
- name: Name of the customer.
- user-id (Foreign Key): Links to the user table.
- phone-number: Contact phone number of the customer.
- Description:
The customer resource stores information specific to customers making reservations. It links to the user resource to manage login credentials and permissions.

3. Employee
- Table: employee

- Fields:
- id (Primary Key): Unique identifier for the employee.
- user-id (Foreign Key): Links to the user table.
- name: Name of the employee.
- position: Job position of the employee (e.g., manager, housekeeping).
- phone-number: Contact phone number of the employee.
- Description:
The employee resource contains information about hotel staff members. It connects to the user table for authentication purposes.

- 4. Reservation
- Table: reservation

- Fields:

- id (Primary Key): Unique identifier for the reservation.
- customer_id (Foreign Key): Links to the customer table.
- date: Date of the reservation.
- status: Current status of the reservation (e.g., booked, checked-in, checked-out).
- total-amount: Total cost of the reservation.
- check-in-date: Scheduled check-in date.
- check-out-date: Scheduled check-out date.
- Description:
The reservation resource handles booking details, linking each reservation to a specific customer and tracking the reservation status and dates.

5. Room
- Table: room

- Fields:

- id (Primary Key): Unique identifier for the room.
- available: Availability status of the room.
- type: Type of room (e.g., single, double, suite).
- price: Price per night for the room.
- capacity: Maximum capacity of the room.
- size: Size of the room.
- features: Additional features of the room.
- Description:
- The room resource manages the details of each room available in the hotel, including availability, type, pricing, and capacity.

6. Reservation-Room
- Table: reservation-room

- Fields:

- room-id (Primary Key, Foreign Key): Links to the room table.
- reservation-id (Primary Key, Foreign Key): Links to the reservation table.
- Description:
  The reservation-room resource maps the relationship between reservations and rooms, indicating which rooms are booked for each reservation.

7. Billing
- Table: billing

- Fields:

- id (Primary Key): Unique identifier for the billing record.
- reservation-id (Foreign Key): Links to the reservation table.
- amount: Billed amount for the reservation.
- status: Billing status (e.g., paid, pending).
- date: Billing date.
- Description:
  The billing resource manages financial transactions related to reservations, tracking amounts and payment statuses.

8. Housekeeping
- Table: house-keeping

- Fields:

- id (Primary Key): Unique identifier for the housekeeping record.
- task-id (Foreign Key): Links to the tasks table.
- room-id (Foreign Key): Links to the room table.
- employee-id (Foreign Key): Links to the employee table.
- status: Status of the housekeeping task.
- Description:
  The housekeeping resource tracks cleaning and maintenance tasks for rooms, assigning tasks to employees and monitoring task status.

9. Tasks
- Table: tasks

- Fields:

- id (Primary Key): Unique identifier for the task.
- task-name: Name of the task.
- description: Description of the task.
- Description:
  The tasks resource defines various housekeeping tasks that need to be performed, such as cleaning, maintenance, and restocking supplies.

10. Room-Features
- Table: room-features

- Fields:

- room-id (Primary Key, Foreign Key): Links to the room table.
- features-id (Primary Key, Foreign Key): Links to the room-features table.
- Description:
  The room-features resource maps additional features to specific rooms, enhancing room descriptions with various amenities.

11. Room Features
- Table: room-features

- Fields:

- id (Primary Key): Unique identifier for the feature.
- feature-name: Name of the feature.
- Description:
  The room-features resource lists all possible features a room can have, such as "Wi-Fi," "Air Conditioning," "Ocean View," etc.
#Database:
-![image](https://github.com/adham-turki/Hotel-management-System/assets/140730348/87b8f787-2643-473b-ae55-ac604e0e70db)

  # Docker
  - First we make a docker file .
  - Then we make the coker compose
  - Clean the maven and install the target
  - push the image into the dockerhub repositry using these commands:
  - docker tag hotel-app adhamturki/hotel:v1.0
  - docker login
  - docker push adhamturki/hotel:v1.0
  - Then run the image from IDE or the docker app
 -  https://hub.docker.com/repository/docker/adhamturki/hotel/general
  # What we have learned in this project
  -This project was one of the important projects that we worked on in our college career ,we learned how to implement and design a good Restfull api and with its security and how to push your project on docker file and run it and make us stronger in database and springboot,ofcourse it was hard to work on this project but we leaned a lot of things to start a new journey for programming after this project.
