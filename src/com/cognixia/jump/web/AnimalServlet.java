package com.cognixia.jump.web.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognixia.jump.business.BusinessHandler;
import com.cognixia.jump.classes.Animal;
import com.cognixia.jump.managers.ConnectionManager;



@WebServlet("/")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 9120073354474091021L;
	private BusinessHandler businessHandler;
	
		@Override
	    public void init() {
	        businessHandler = new BusinessHandler();
	    }
	   
	    @Override
	    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	        
	        //Use DAO to get list of animals from database
	        List<Animal> allAvailableAnimalsByLocation = businessHandler.getAllAvailableAnimalsByLocation();
	        
	        //Store the list of animals above into a request object that can go to a JSP
	        req.setAttribute("allAvailableAnimalsByLocation",  allAvailableAnimalsByLocation);
	        
	        //Say where that request object above is going to go
	        RequestDispatcher dispatcher = req.getRequestDispatcher("AdoptableAnimalList.jsp");
	        
	        //sendit
	        dispatcher.forward(req, res);
	    }
	    

		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			doGet(request, response);
		}

//		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
//				throws ServletException, IOException {
//			
//			// depending on ending url path, will redirect our servlet to complete
//			// one of the actions in the switch case below
//			String action = request.getServletPath();
//			
//			switch (action) {
//			
//			case "/list":
//				listProducts(request, response);
//				break;
//			case "/delete":
//				deleteProduct(request, response);
//				break;
//			case "/edit":
//				goToEditProductForm(request, response);
//				break;
//			case "/update":
//				editProduct(request, response);
//				break;
//			case "/new":
//				goToNewProductForm(request, response);
//				break;
//			case "/insert":
//				addNewProduct(request, response);
//				break;
//
//			default:  // default will just go to our index.jsp page
//				response.sendRedirect("/CrudProject2");
//				break;
//			}
//			
//			
//		}
//		
//		public void destroy() {
//			try {
//				ConnectionManager.getConnection().close();
//				
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
//		}
//
//		private void listProducts(HttpServletRequest request, HttpServletResponse response) 
//				throws ServletException, IOException {
//			
//			List<Product> allProducts = productDao.getAllProducts();
//			System.out.println("called, allProducts = " + allProducts);
//			
//			request.setAttribute("allProducts", allProducts);
//			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("product-list.jsp");
//			
//			dispatcher.forward(request, response);
//		}
//		
//		private void deleteProduct(HttpServletRequest request, HttpServletResponse response) 
//				throws ServletException, IOException {
//			
//			int id = Integer.parseInt(request.getParameter("id"));
//			
//			if (productDao.deleteProduct(id)) {
//				System.out.println("Deleted product ID#" + id);
//			};
//			
//			response.sendRedirect("list");
//		}
//		
//		private void goToEditProductForm(HttpServletRequest request, HttpServletResponse response) 
//				throws ServletException, IOException {
//			
//			int id = Integer.parseInt(request.getParameter("id"));
//			
//			Product product = productDao.getProductById(id);
//			
//			request.setAttribute("product", product);
//			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("product-form.jsp");
//			
//			dispatcher.forward(request, response);
//		}
//		
//		private void editProduct (HttpServletRequest request, HttpServletResponse response)
//				throws ServletException, IOException {
//			
//			int id = Integer.parseInt(request.getParameter("id"));
//			String item = request.getParameter("item");
//			int qty = Integer.parseInt( request.getParameter("qty") );
//			String description = request.getParameter("description");
//			
//			Product product = new Product(id, item, qty, description);
//			
//			if(productDao.updateProduct(product)) {
//				System.out.println("UPDATED PRODUCT ID#" + id + " as\n" + product);
//			};
//			
//			response.sendRedirect("list");
//			
//		}
//		
//		private void goToNewProductForm(HttpServletRequest request, HttpServletResponse response) 
//				throws ServletException, IOException {
//			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("product-form.jsp");
//			
//			dispatcher.forward(request, response);
//			
//		}
//		
//		private void addNewProduct(HttpServletRequest request, HttpServletResponse response)
//				throws ServletException, IOException {
//				
//				String item = request.getParameter("item");
//				int qty = Integer.parseInt( request.getParameter("qty") );
//				String description = request.getParameter("description");
//				
//				Product product = new Product(0, item, qty, description);
//				
//				if(productDao.addProduct(product)) {
//					System.out.println("CREATED PRODUCT" + " as\n" + product);
//				};
//				
//				response.sendRedirect("list");
//				
//			}
	}
	

	
	
	
	
	
	
	
	
	
	
