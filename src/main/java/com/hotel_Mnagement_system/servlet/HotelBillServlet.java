package com.hotel_Mnagement_system.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HotelBillServlet")
public class HotelBillServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
       
    public HotelBillServlet() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        String name = request.getParameter("txtname");
        String NIC = request.getParameter("txtnic");
        String roomtype = request.getParameter("roomType");
        
     
        int roomofNight = Integer.parseInt(request.getParameter("txtnum_of_nigth"));
        int numofgust = Integer.parseInt(request.getParameter("txtnum_of_gust"));
        
        
        boolean b = request.getParameter("breakfast") != null;
        boolean a = request.getParameter("AirportPickup") != null;
        boolean e = request.getParameter("ExtraBed") != null;
        
       
        String customerType = request.getParameter("customerType");
        
        
        if(name == null || name.trim().isEmpty() || NIC == null || NIC.trim().isEmpty()) {
        	
            response.sendRedirect("BookingForm.jsp?error=invalid_input");
            
            return;
        }

      
        double roomCost = 0;
        if (roomtype != null) {
        	
            switch (roomtype) {
            
                case "standard": roomCost = 12000.0 * roomofNight; break;
                
                case "deluxe":   roomCost = 18000.0 * roomofNight; break;
                
                case "suite":    roomCost = 30000.0 * roomofNight; break;
                
                default: roomCost = 0; break;
            }
        }
        
       
        double breakfastCost = 0;
        double pickupCost = 0;
        double extraBedCost = 0;
        
        if(b) breakfastCost = 1500.0 * numofgust * roomofNight;
        if(a) pickupCost = 6000.0;
        if(e) extraBedCost = 3500.0 * roomofNight;
        
        double addonCost = breakfastCost + pickupCost + extraBedCost;
        
       
        double totalBeforeDiscount = roomCost + addonCost;
        double discount = 0;
        
        
        if ("Member".equals(customerType)) {
        	
            discount = 0.10 * totalBeforeDiscount;
        } 
        
        else if (roomofNight >= 5) {
        	
            discount = 0.05 * roomCost;
        }

        double discountedAmount = totalBeforeDiscount - discount;
        
        
        double serviceCharge = 0.03 * discountedAmount;
        double vat = 0.08 * (discountedAmount + serviceCharge);
        double finalTotal = discountedAmount + serviceCharge + vat;
    
        response.sendRedirect("BookingForm.jsp?roomcost=" + roomCost + 
                              "&addon=" + addonCost + 
                              "&discount=" + discount + 
                              "&servicech=" + serviceCharge + 
                              "&tax=" + vat + 
                              "&final=" + finalTotal+"&name="+name+"&nic="+NIC+"&rm="+roomtype);
    }
}