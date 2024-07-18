<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <!-- Add any necessary CSS styles or meta tags here -->
    <style>
        /* Example CSS styles */
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            background-color: #f0f0f0;
            padding: 20px;
        }
        .dashboard-container {
            max-width: 800px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .dashboard-item {
            margin-bottom: 20px;
        }
        h1, h2, h3 {
            color: #333;
        }
        p {
            margin: 5px 0;
        }
    </style>
</head>
<body>
    <div class="dashboard-container">
        <h1>Welcome to Admin Dashboard</h1>
        
        <!-- Display admin's full name -->
        <h2>Hello, <%= request.getAttribute("adminName") %></h2>
        
        <!-- Display number of accounts -->
        <div class="dashboard-item">
            <h3>Number of Accounts</h3>
            <p><%= request.getAttribute("accountCount") %></p>
        </div>
        
        <!-- Display today's transactions count -->
        <div class="dashboard-item">
            <h3>Today's Transactions Count</h3>
            <p><%= request.getAttribute("todayTransactionCount") %></p>
        </div>
        
        <!-- Display total withdrawals -->
        <div class="dashboard-item">
            <h3>Total Withdrawals</h3>
            <p><%= request.getAttribute("totalWithdrawals") %></p>
        </div>
        
        <!-- Display total deposits -->
        <div class="dashboard-item">
            <h3>Total Deposits</h3>
            <p><%= request.getAttribute("totalDeposits") %></p>
        </div>
        
        <!-- Add more HTML as needed for your dashboard -->
        
    </div>
</body>
</html>
