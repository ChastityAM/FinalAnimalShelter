package com.cognixia.jump.web;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognixia.jump.enums.ShelterLocation;
import com.cognixia.jump.managers.ConnectionManager;
import com.cognixia.jump.models.Animal;
import com.cognixia.jump.service.BusinessHandler;



@WebServlet("/")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 9120073354474091021L;
	private BusinessHandler businessHandler;
	
		@Override
	    public void init() {
	        businessHandler = new BusinessHandler();
	    }
	   
		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			doGet(request, response);
		}
		

		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			// depending on ending url path, will redirect our servlet to complete
			// one of the actions in the switch case below
			String action = request.getServletPath();
			
			switch (action) {
			
			case "/":
				listAnimals(request, response);
				break;
			case "/delete":
				deleteAnimal(request, response);
				break;
			case "/edit":
				goToEditAnimalForm(request, response);
				break;
			case "/update":
				editAnimal(request, response);
				break;
			case "/new":
				goToNewAnimalForm(request, response);
				break;
			case "/insert":
				addNewAnimal(request, response);
				break;

			default:  // default will just go to our index.jsp page
				response.sendRedirect("/FinalAnimalShelter");
				break;
			}
			
			
		}
		
		public void destroy() {
			try {
				ConnectionManager.getConnection().close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}


		
		
		private void listAnimals(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			        //Use DAO to get list of animals from database
			        List<Animal> allAnimals = businessHandler.getAllAvailableAnimals();
			       
			        //Store the list of animals above into a request object that can go to a JSP
			        request.setAttribute("allAnimals",  allAnimals);
			        
			        //Say where that request object above is going to go
			        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			        
			        //sendit
			        dispatcher.forward(request, response);
			    }
		
		
		private void deleteAnimal(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			if (businessHandler.deleteAnimalById(id)) {
				System.out.println("Deleted animal ID#" + id);
			};
			
			response.sendRedirect("list");
		}
		
		private void goToEditAnimalForm(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			Animal animal = businessHandler.getAnimalById(id);
			
			request.setAttribute("animal", animal);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Animal-form.jsp");
			
			dispatcher.forward(request, response);
		}
		
		private void editAnimal (HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			Animal animal = businessHandler.getAnimalById(id);
			
			if(businessHandler.updateAnimal(animal)>0) {
				System.out.println("UPDATED Animal ID#" + id + " as\n" + animal);
			};
			
			response.sendRedirect("list");
			
		}
		
		private void goToNewAnimalForm(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("animal-form.jsp");
			
			dispatcher.forward(request, response);
			
		}
		
		private void addNewAnimal(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
				
			int id = Integer.parseInt(request.getParameter("id"));
			String animalType = request.getParameter("type");
			String animalStatus = request.getParameter("status");
			Date animalDate = Date.valueOf(request.getParameter("date"));
			String animalImage = request.getParameter("animal image");
			int locId = Integer.parseInt(request.getParameter("locId"));
			
				Animal animal = new Animal(id, animalType, animalStatus, animalDate, animalImage, locId);
				
				if(businessHandler.addAnimal(animal)) {
					System.out.println("CREATED Animal" + " as\n" + animal);
				};
				
				response.sendRedirect("list");
				
			}

	}



