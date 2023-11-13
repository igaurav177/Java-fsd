package com.product.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.dao.ProductDAO;
import com.product.pojo.Product;

/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String productName = request.getParameter("productName");
	        double productPrice = Double.parseDouble(request.getParameter("productPrice"));
	        String productId = request.getParameter("productId");

	        Product product = new Product();
	        product.setName(productName);
	        product.setPrice(productPrice);

	        // Set the product ID if provided
	        if (productId != null && !productId.isEmpty()) {
	            product.setId(Long.parseLong(productId));
	        }

	        ProductDAO productDAO = new ProductDAO();
	        productDAO.addProduct(product);

	        //response.sendRedirect("index.jsp");
	        
	        // Set attributes in the request for displaying product details
	        request.setAttribute("success", true);
	        request.setAttribute("productId", product.getId());
	        request.setAttribute("productName", product.getName());
	        request.setAttribute("productPrice", product.getPrice());
	        
	     // Retrieve all products
	        List<Product> allProducts = productDAO.getAllProducts();
	        System.out.println("Number of products retrieved: " + allProducts.size());
	        request.setAttribute("allProducts", allProducts);

	        // Forward the request to index.jsp
	        RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
	        dispatcher.forward(request, response);
	}

}