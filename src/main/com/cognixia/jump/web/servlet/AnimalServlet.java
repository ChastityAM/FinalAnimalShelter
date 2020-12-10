package com.cognixia.jump.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
	    
	    @Override
	    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	        doGet(req,res);
	    }
	    
	    @Override    
	    public void destroy() {
	    }
	    
	}
	

	
	
	
	
	
	
	
	
	
	
