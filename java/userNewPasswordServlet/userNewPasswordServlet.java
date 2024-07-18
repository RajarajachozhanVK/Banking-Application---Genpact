package userNewPasswordServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userNewPasswordServlet")
public class userNewPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");
        String customerEmail = request.getParameter("customerEmail");

        if (newPassword.equals(confirmPassword)) {
            try {
                // Load MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish database connection
                String jdbcUrl = "jdbc:mysql://localhost:3306/banking_app";
                String dbUser = "root";
                String dbPassword = "Dhanush12345";
                try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
                    // Prepare SQL statement to update password
                    String sqlUpdatePassword = "UPDATE customers SET password=?, password_changed=true WHERE email=?";
                    try (PreparedStatement psUpdatePassword = connection.prepareStatement(sqlUpdatePassword)) {
                        psUpdatePassword.setString(1, newPassword);
                        psUpdatePassword.setString(2, customerEmail);

                        // Execute update
                        int result = psUpdatePassword.executeUpdate();

                        if (result > 0) {
                            // Password updated successfully
                            request.setAttribute("message", "Password updated successfully. Please login with your new password.");
                            RequestDispatcher rd = request.getRequestDispatcher("Customer1.jsp");
                            rd.forward(request, response);
                        } else {
                            // Error updating password
                            request.setAttribute("message", "Error updating password. Please try again.");
                            RequestDispatcher rd = request.getRequestDispatcher("Customer_New_Password.jsp");
                            rd.forward(request, response);
                        }
                    }
                } catch (SQLException e) {
                    // SQL Exception handling
                    e.printStackTrace();
                    request.setAttribute("message", "Error updating password: " + e.getMessage());
                    RequestDispatcher rd = request.getRequestDispatcher("Customer_New_Password.jsp");
                    rd.forward(request, response);
                }
            } catch (ClassNotFoundException e) {
                // JDBC Driver not found handling
                e.printStackTrace();
                request.setAttribute("message", "Error updating password: JDBC Driver not found");
                RequestDispatcher rd = request.getRequestDispatcher("Customer_New_Password.jsp");
                rd.forward(request, response);
            }
        } else {
            // Passwords do not match handling
            request.setAttribute("message", "Passwords do not match. Please try again.");
            RequestDispatcher rd = request.getRequestDispatcher("Customer_New_Password.jsp");
            rd.forward(request, response);
        }
    }
}
