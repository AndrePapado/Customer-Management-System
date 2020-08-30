package dom.CustDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 * Servlet implementation class DbServlet
 */
@WebServlet("/DbServlet")
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//setup connection  for database
		
		String connex = "jdbc:mysql://localhost:3306/customerdb?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String user="root";
		String pass="1234";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out= response.getWriter();
			out.println(" connection to dsatabase " + connex);
			 Class.forName(driver);
			 Connection myConn = DriverManager.getConnection(connex, user, pass);
			 
			out.println("Success!!");
			
			myConn.close();
		}
		catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
