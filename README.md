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
- API Endpoints:
 - GET /users: Retrieve a list of users.
 - GET /users/{id}: Retrieve a specific user by ID.
 - POST /users: Create a new user.
 - PUT /users/{id}: Update an existing user.
 - DELETE /users/{id}: Delete a user.

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
- API Endpoints:
 - GET /customers: Retrieve a list of customers.
 - GET /customers/{id}: Retrieve a specific customer by ID.
 - POST /customers: Create a new customer.
 - PUT /customers/{id}: Update an existing customer.
 - DELETE /customers/{id}: Delete a customer.

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
- API Endpoints:

 - GET /reservations: Retrieve a list of reservations.
 - GET /reservations/{id}: Retrieve a specific reservation by ID.
 - POST /reservations: Create a new reservation.
 - PUT /reservations/{id}: Update an existing reservation.
 - DELETE /reservations/{id}: Cancel a reservation.
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
- API Endpoints:

 - GET /rooms: Retrieve a list of rooms.
 - GET /rooms/{id}: Retrieve a specific room by ID.
 - POST /rooms: Create a new room.
 - PUT /rooms/{id}: Update an existing room.
 - DELETE /rooms/{id}: Delete a room.
6. Reservation-Room
- Table: reservation-room

- Fields:

- room-id (Primary Key, Foreign Key): Links to the room table.
- reservation-id (Primary Key, Foreign Key): Links to the reservation table.
- Description:
  The reservation-room resource maps the relationship between reservations and rooms, indicating which rooms are booked for each reservation.
- API Endpoints:

 - GET /reservation-rooms: Retrieve a list of reservation-room relationships.
 - GET /reservation-rooms/{room-id}/{reservation-id}: Retrieve a specific reservation-room relationship.
 - POST /reservation-rooms: Create a new reservation-room relationship.
 - PUT /reservation-rooms/{room-id}/{reservation-id}: Update an existing reservation-room relationship.
 - DELETE /reservation-rooms/{room-id}/{reservation-id}: Delete a reservation-room relationship.
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
- API Endpoints:

 - GET /billings: Retrieve a list of billing records.
 - GET /billings/{id}: Retrieve a specific billing record by ID.
 - POST /billings: Create a new billing record.
 - PUT /billings/{id}: Update an existing billing record.
 - DELETE /billings/{id}: Delete a billing record.
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
- API Endpoints:

 - GET /housekeepings: Retrieve a list of housekeeping records.
 - GET /housekeepings/{id}: Retrieve a specific housekeeping record by ID.
 - POST /housekeepings: Create a new housekeeping record.
 - PUT /housekeepings/{id}: Update an existing housekeeping record.
 - DELETE /housekeepings/{id}: Delete a housekeeping record.
9. Tasks
- Table: tasks

- Fields:

- id (Primary Key): Unique identifier for the task.
- task-name: Name of the task.
- description: Description of the task.
- Description:
  The tasks resource defines various housekeeping tasks that need to be performed, such as cleaning, maintenance, and restocking supplies.
- API Endpoints:

 - GET /tasks: Retrieve a list of tasks.
 - GET /tasks/{id}: Retrieve a specific task by ID.
 - POST /tasks: Create a new task.
 - PUT /tasks/{id}: Update an existing task.
 - DELETE /tasks/{id}: Delete a task.
10. Room-Features
- Table: room-features

- Fields:

- room-id (Primary Key, Foreign Key): Links to the room table.
- features-id (Primary Key, Foreign Key): Links to the room-features table.
- Description:
  The room-features resource maps additional features to specific rooms, enhancing room descriptions with various amenities.
- API Endpoints:

 - GET /room-features: Retrieve a list of room-features relationships.
 - GET /room-features/{room-id}/{features-id}: Retrieve a specific room-features relationship.
 - POST /room-features: Create a new room-features relationship.
 - PUT /room-features/{room-id}/{features-id}: Update an existing room-features relationship.
 - DELETE /room-features/{room-id}/{features-id}: Delete a room-features relationship.
11. Room Features
- Table: room-features

- Fields:

- id (Primary Key): Unique identifier for the feature.
- feature-name: Name of the feature.
- Description:
  The room-features resource lists all possible features a room can have, such as "Wi-Fi," "Air Conditioning," "Ocean View," etc.
- API Endpoints:

 - GET /features: Retrieve a list of features.
 - GET /features/{id}: Retrieve a specific feature by ID.
 - POST /features: Create a new feature.
 - PUT /features/{id}: Update an existing feature.
 - DELETE /features/{id}: Delete a feature.
Database
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
