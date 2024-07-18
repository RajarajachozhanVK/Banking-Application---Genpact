# Banking-Application---Genpact

# Banking Application

## Overview
This Banking Application is designed to manage bank accounts for customers and provide administrative functions for bank administrators. The project includes functionalities for customer registration, account management, transaction handling, and more.

## Features
### Admin Roles
- **Login**: Admin can login with a username and password.
- **Customer Registration**: Admin can register a customer with details including:
  - Full name
  - Address
  - Mobile No
  - Email id
  - Type of account (Saving Account or Current Account)
  - Initial Balance (min 1000)
  - Date of Birth
  - Id proof
- **Account Generation**: The system generates an account number and a temporary password for the customer.
- **Customer Management**: Admin can add, delete, modify, and view customer details. Password and balance are not visible to the admin.

### Customer Roles
- **Setup New Password**: Customers can set up a new password using their account number and temporary password provided by the admin.
- **Login/Logout**: Customers can log in and log out using their account number and password.
- **Dashboard**: Customers can view their account details and balance on the dashboard.
- **Transaction History**: Customers can view the last 10 transactions in increasing or decreasing order of date.
- **Deposit**: Customers can deposit money into their account.
- **Withdraw**: Customers can withdraw money from their account.
- **Account Closure**: Customers can close their account after withdrawing all the money.
- **Download Transactions**: Customers can download a PDF of the last 10 transactions.

## Technology Stack
- **IDE**: Eclipse IDE
- **Server**: Tomcat 9 Server
- **Database**: MySQL Server, MySQL Workbench
- **Language**: Java

## Project Structure
Banking-Application/
├── META-INF/
├── WEB-INF/
├── build/
│ └── classes/
├── java/
├── jsp/
│ ├── Acc_Delete.jsp
│ ├── Acc_Modify.jsp
│ ├── AdminDashboard.jsp
│ ├── Admin_Profile.jsp
│ ├── Adminlogout.jsp
│ ├── Customer.jsp
│ ├── Customer1.jsp
│ ├── Customer_Dashboard.jsp
│ ├── Customer_Deposit.jsp
│ ├── Customer_New_Password.jsp
│ ├── Customer_Profile.jsp
│ ├── Customer_Session.jsp
│ ├── Customer_View_Transactions.jsp
│ ├── Customer_Withdraw.jsp
│ ├── Depositmessage.jsp
│ ├── NewFile.jsp
│ ├── NewFile12.jsp
│ ├── NewRegistration.jsp
│ ├── Welcome.jsp
│ ├── accountDeleted.jsp
│ ├── debug.jsp
│ ├── error.jsp
│ ├── login.jsp
│ ├── messagewithdraw.jsp
│ ├── registration-success.jsp
│ └── sessionCheck.jsp
├── .classpath
├── .project
└── README.md

bash
Copy code

## Installation and Setup
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/Banking-Application.git
Import the Project in Eclipse:

Open Eclipse IDE.
Go to File -> Import -> Existing Maven Projects.
Select the cloned repository.
Set Up MySQL Database:

Open MySQL Workbench.
Create a new database for the application.
Import the provided SQL script to set up the required tables.
Configure Tomcat Server:

Add Tomcat 9 Server to your Eclipse IDE.
Add the project to the server.
Run the Application:

Start the Tomcat Server.
Access the application at http://localhost:8080/Banking-Application.
Usage
Admin Login:

Use the admin credentials to log in.
Register new customers and manage existing ones.
Customer Setup:

Customers set up a new password using the account number and temporary password.
Log in to view account details, perform transactions, and manage the account.
Bill of Materials (BOM)
Software:
Eclipse IDE
Tomcat 9 Server
MySQL Server
MySQL Workbench
Java Development Kit (JDK)
Hardware:
Development machine with a minimum of 4GB RAM and 10GB free disk space.


Acknowledgments
Thanks to the mentors for guidance and support.
Open source libraries and tools used in this project.
