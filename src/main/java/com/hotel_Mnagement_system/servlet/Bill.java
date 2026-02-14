package com.hotel_Mnagement_system.servlet;

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
	
	private static final String URL ="jdbc:mysql://localhost:3307/school?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    Bill(){
    	
		
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
		
		try {
			
			
		} catch (Exception e) {
			
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
	public double setFinalTotal() {
		return finalTotal;
	}

	
}
