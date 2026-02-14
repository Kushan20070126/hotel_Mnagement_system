package com.hotel_Mnagement_system.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/services")
public class services extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public services() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String val = request.getParameter("roomcost");
		
		
			
	}
	
	class model{
		
		private String name;
		private String nic;
		private String roomtype;
		private double roomCost;
		private double addonCost;
		private double discount;
		private double serviceCharge;
		
	}

}
