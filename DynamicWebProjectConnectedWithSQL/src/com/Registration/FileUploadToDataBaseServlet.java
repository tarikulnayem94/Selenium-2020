package com.Registration;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)              // upload file's size up to 16MB
public class FileUploadToDataBaseServlet extends HttpServlet {

//	database connection settings
	private String databaseURL = "jdbc:mysql://localhost:3306/registrationlistdatabase";
	private String databaseUser = "root";
	private String databasePassWord = "2888";

/*	This method is called by servlet service method to handle the POST request from client. 
 	The HTTP POST method allows the client to send data of unlimited length to the Web server 
	a single time and is useful when posting information to the server.
*/	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		gets values of text fields
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String country = request.getParameter("country");

//		InputStream's are used for reading byte based data
		InputStream inputStream = null;               // input stream of the upload file

		// obtains the upload file part in this multipart request
		
		Part filePart = request.getPart("photo");
		if (filePart != null) {
// prints out some information for debugging
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());

// obtains input stream of the upload file
			inputStream = filePart.getInputStream();
		}

		Connection connection = null;     // connection to the database
		String message = null;           // message will be sent back to client

		try {
			// connects to the database
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			connection = DriverManager.getConnection(databaseURL, databaseUser, databasePassWord);

			// constructs SQL statement
			String sql = "INSERT INTO registration (first_name, last_name, phone, email, country, photo ) "
					+ "values (?, ?, ?, ?, ?, ?)";
			
//			The performance of the application will be faster if you use PreparedStatement, 
//			which gives better performance than Statement class.
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, firstName);
			statement.setString(2, lastName);
			statement.setString(3, phone);
			statement.setString(4, email);
			statement.setString(5, country);

			if (inputStream != null) {
//			bring input stream of the upload file for the blob column
				statement.setBlob(6, inputStream);
			}

//			sends the statement to the database server
			int row = statement.executeUpdate();
			if (row > 0) {
				message = "File uploaded and saved into database";
			}
		} catch (SQLException exception) {
			message = "ERROR: " + exception.getMessage();
			exception.printStackTrace();
		} finally {
			if (connection != null) {
				// closes the database connection
				try {
					connection.close();
				} catch (SQLException exception) {
					exception.printStackTrace();
				}
			}
//			sets the message in request scope
			request.setAttribute("Message", message);

//			forwards message to the page
			getServletContext().getRequestDispatcher("/Message.html").forward(request, response);
		}
		
	}
	
}


