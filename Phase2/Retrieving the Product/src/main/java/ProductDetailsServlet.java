

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetailsServlet
 */
public class ProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        String productId = request.getParameter("productId");
	        
	       
	        if (productId != null && !productId.isEmpty()) {
	            
	            String jdbcUrl = "jdbc:mysql://localhost:3306/db3";
	            String username = "root";
	            String password = "root";

	            try {
	            	
	              
	                Class.forName("com.mysql.cj.jdbc.Driver");

	               
	                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

	             
	                String sql = "SELECT * FROM product WHERE pid = ?";
	                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	                    preparedStatement.setString(1, productId);
	                    ResultSet resultSet = preparedStatement.executeQuery();
	                    
	                    
	                    if (resultSet.next()) {
	                        out.println("<html><body>");
	                        out.println("<h2>Product Details</h2>");
	                        out.println("<p>ID: " + resultSet.getInt("pid") + "</p>");
	                        out.println("<p>Name: " + resultSet.getString("pname") + "</p>");
	                        out.println("<p>Price: $" + resultSet.getInt("pcost") + "</p>");
	                        out.println("</body></html>");
	                    } else {
	                        out.println("<html><body>");
	                        out.println("<h2>Product not found</h2>");
	                        out.println("</body></html>");
	                    }
	                }
	            } catch (ClassNotFoundException | SQLException e) {
	                e.printStackTrace();
	            }
	        } else {
	            out.println("<html><body>");
	            out.println("<h2>Please enter a valid product ID</h2>");
	            out.println("</body></html>");
	        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		       
		    
	}

}
