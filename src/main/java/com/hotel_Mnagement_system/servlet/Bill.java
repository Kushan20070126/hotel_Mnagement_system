package com.hotel_Mnagement_system.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalTime;

class Bill{
	
	private String name;
	private String id;
	private String nic;
	private String roomtype;
	private double roomCost;
	private double addonCost;
	private double discount;
	private double serviceCharge;
	private double vat;
	private double finalTotal;
	private Connection con;
	
	private static final String URL ="jdbc:mysql://localhost:3307/hotel_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    Bill(){
    	
    	try {
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		 con = DriverManager.getConnection(URL, USER, PASS);
    		 
    		
		} catch (Exception e) {
			
			System.out.println("Error : " + e.getMessage());
			
		}
		
    }
	
	
	public void setName(String n) {
		this.name = n;
		
	}
	public void setNic(String nic) {
		
		this.nic = nic;
		
	}
	public void setId() {
		
		LocalTime currentTime = LocalTime.now();
		this.id =  nic + " / " + currentTime ;
		
	}

	public void setRoomtype(String rt) {
		this.roomtype = rt;
		
	}
	public void setRoomcost(double rc) {
		
		this.roomCost = rc;
		
	}
	public void setAddoncont(double ad) {
		
		this.addonCost = ad;
		
	}
	public void setDiscount(double dis) {
		
		this.discount = dis;
		
	}
	public void setServiceChange(double sc) {
		
		this.serviceCharge = sc;
		
	}
	public void setVat(double vat) {
		
		this.vat = vat;
		
	}
	public void setFinalTotal(double ft) {
		
		this.finalTotal = ft;
		
	}
	
	public void SaveData() {
	  
	    String sql = "INSERT INTO RoomBookings (name, transaction_id, nic, room_type, room_cost, addon_cost, discount, service_charge, vat, final_total) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	    try {
	        
	        PreparedStatement ps = con.prepareStatement(sql);
	        
	       
	        ps.setString(1, this.name);
	        ps.setString(2, this.id);
	        ps.setString(3, this.nic);
	        ps.setString(4, this.roomtype);
	        ps.setDouble(5, this.roomCost);
	        ps.setDouble(6, this.addonCost);
	        ps.setDouble(7, this.discount);
	        ps.setDouble(8, this.serviceCharge);
	        ps.setDouble(9, this.vat);
	        ps.setDouble(10, this.finalTotal);
	        
	       
	        int result = ps.executeUpdate();
	        
	        if (result > 0) {
	        	
	            System.out.println("Data saved successfully!");
	        }
	        
	        
	        ps.close();

	    } catch (Exception e) {
	        System.out.println("Error : " + e.getMessage());
	    }
	}
	
	
	public String getName() {
		return name;
	}
	public String getNic() {
		return nic;
	}
	public String getId() {
		return id;
		
	}
	public String getRoomType() {
		return roomtype;
		
	}
	public double getRoomCost() {
		return roomCost;
		
	}
	public double getAddonCost() {
		return addonCost;
		
	}
	public double getDiscount() {
		return discount;
		
	}
	public double getServiceChange() {
		return serviceCharge;
		
	}
	public double getVat() {
		return vat;
		
	}
	public double getFinalTotal() {
		return finalTotal;
	}

	
}
