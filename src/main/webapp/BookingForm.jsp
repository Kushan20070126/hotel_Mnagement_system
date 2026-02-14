<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Bill Management</title>
 <link rel="stylesheet" href="lib/bootstrap.min.css">
</head>
<body>
   <div class="container">
   		<div class="row justify-content-center">
   			<div class="col-md-6">
   				<div class="card mt-5">
                    <div class="card-header">
                        <h2>Enter Guest Details</h2>
                    </div>
                    <div class="card-body">
                    <form action="HotelBillServlet" method="post">
                        <div class="mb-3">
                           <label for="name" class="form-label">Guest Name : </label>
                           <input type="text" name="txtname" id="name" class="form-control" required>
                        </div>
                        <div class="mb-3">
                           <label for="nic" class="form-label">NIC/Passport No : </label>
                           <input type="text" name="txtnic" id="nic" class="form-control" required>
                        </div>
                        
                        <div class="mb-3">
                        <label for="roomType" class="form-label">Room Type :</label>
                        <select name="roomType" id="roomType" class="form-select" required>
                            <option value="" disabled selected>Select a room type</option>
                            <option value="standard">Standard (LKR 12,000 per night)</option>
                            <option value="deluxe">Deluxe (LKR 18,000 per night)</option>
                            <option value="suite">Suite (LKR 30,000 per night)</option>
                        </select>
                    </div>
                    <div class="mb-3">
                           <label for="night" class="form-label">Number of Nights : </label>
                           <input type="number" name="txtnum_of_nigth" id="night" class="form-control" required>
                        </div>
                        <div class="mb-3">
                           <label for="guest" class="form-label">Number of Guests : </label>
                           <input type="number" name="txtnum_of_gust" id="guest" class="form-control" required>
                        </div>
                        
                        <div class="mb-3">
                            <label class="form-label">Add-on Services :</label>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="true" id="Breakfast" name="breakfast">
                                <label class="form-check-label" for="Breakfast">Breakfast</label>
                           </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="true" id="AirportPickup" name="AirportPickup">
                                <label class="form-check-label" for="AirportPickup">Airport Pickup</label>
                           </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="true" id="ExtraBed" name="ExtraBed">
                                <label class="form-check-label" for="ExtraBed">Extra Bed</label>
                           </div>
                         </div>

                       <label class="form-label">Customer Type :</label>
                        <div class="mb-3">
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="customerType" id="Member" value="Member" checked>
                                <label class="form-check-label" for="Member">Member</label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="customerType" id="nonMember" value="nonMember">
                                <label class="form-check-label" for="nonMember">Non Member</label>
                            </div>
                        </div>

                     <div class="d-flex justify-content-end">
                                    <button type="submit" id="cal" class="btn btn-primary me-3">SUBMIT</button>
                                    <button type="reset" class="btn btn-danger">RESET</button>
                     </div> 
                    </form>
                    </div>
                </div>
   			</div>
   		</div>
   </div>
   
   <div class="container mb-5">
   		<div class="row justify-content-center">
   			<div class="col-md-6">
   				<div class="card mt-5">
                    <div class="card-header">
                        <h2>Bill Summary</h2>
                    </div>
                    <div class="card-body">
                    <% 
                      
                        String addonCost = request.getParameter("addon") ;
                        String roomCost = request.getParameter("roomcost");
                        String discount = request.getParameter("discount");
                        String serviceCharge = request.getParameter("servicech");
                        String tax = request.getParameter("tax");
                        String finalTotal = request.getParameter("final");
                        
                        if(roomCost == null || addonCost == null || discount == null || serviceCharge == null ||
                        		tax == null || finalTotal == null){
                        	
                        	   addonCost = "";
                               roomCost = "";
                               discount = "";
                               serviceCharge = "";
                               tax = "";
                              finalTotal = "";
                        }
                    %>
                    <form action="services" method="post">
                    <input type="hidden" name="name" value="<%= request.getParameter("name") %>">
    				<input type="hidden" name="nic" value="<%= request.getParameter("nic") %>">
   					 <input type="hidden" name="rm" value="<%= request.getParameter("rm") %>">
                        <div class="mb-3">
                           <label class="form-label">Room Cost : </label>
                           <input type="text" class="form-control" name="roomcost" value="<%= roomCost %>" readonly >
                        </div>
                        <div class="mb-3">
                           <label class="form-label">Add-on Cost : </label>
                           <input type="text" class="form-control" name="addon" value="<%= addonCost %>" readonly>
                        </div>
                        <div class="mb-3">
                           <label class="form-label">Discount Amount : </label>
                           <input type="text" class="form-control" name="dicon" value="<%= discount %>" readonly>
                        </div>
                        <div class="mb-3">
                           <label class="form-label">Service Charge : </label>
                           <input type="text" class="form-control" name="svc_cha" value="<%= serviceCharge %>" readonly>
                        </div>
                        <div class="mb-3">
                           <label class="form-label">Tax : </label>
                           <input type="text" class="form-control" name="tax" value="<%= tax %>" readonly>
                        </div>
                        <div class="mb-3">
                           <label class="form-label">Final Total : </label>
                           <input type="text" class="form-control" name="final" value="<%= finalTotal %>" readonly>
                        </div>
                     <div class="d-flex justify-content-end">
                     	<button type="submit" class="btn btn-success me-3">SAVE</button>
                      </div> 
                    </form>
                    </div>
                </div>
   			</div>
   		</div>
   </div>
   
   <script src="lib/bootstrap.min.js"></script>
</body>
</html>