package com.hotel_Mnagement_system.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet("/services")
public class services extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public services() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Bill bill = new Bill();
		
		bill.setName(request.getParameter("name"));
		bill.setNic(request.getParameter("nic"));
		bill.setId();
		bill.setRoomtype(request.getParameter("rm"));
		bill.setRoomcost(Double.parseDouble(request.getParameter("roomcost")));
		bill.setAddoncont(Double.parseDouble(request.getParameter("addon")));
		bill.setDiscount(Double.parseDouble(request.getParameter("discount")));
		bill.setServiceChange(Double.parseDouble(request.getParameter("servicech")));
		bill.setVat(Double.parseDouble(request.getParameter("tax")));
		bill.setFinalTotal(Double.parseDouble(request.getParameter("final")));
		
		
		
		

		
			
			
	}
	

}
