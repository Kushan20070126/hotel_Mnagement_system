<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Summery</title>
 <link rel="stylesheet" href="lib/bootstrap.min.css">
</head>
<body>

<div class="container">
<div class="row justify-content-center">
<div class="col-md-6">
<div class="card mt-5">
<div class="card-header">
<h1>Summery</h1>
</div>
<div class="card-body">

	<%
	 String name = request.getParameter("name");
	 String id = request.getParameter("id");
	 String nic = request.getParameter("nic");
	 String roomtype = request.getParameter("ry");
	 String roomCost = request.getParameter("rc");
	 String addonCost = request.getParameter("ac");
	 String discount = request.getParameter("disc");
	 String serviceCharge = request.getParameter("sc");
	 String vat = request.getParameter("tex");
	 String finalTotal = request.getParameter("final");
	%>
	
	<h3>Customer Name : <%=name %></h3>
	<h3>Customer Transaction ID : <%=id %></h3>
	<h3>Customer NIC : <%=nic %>></h3>
	<h3>Customer Room Type : <%=roomtype %></h3>
	<h3> Room Cost (LKR.): <%=roomCost %></h3>
	<h3> Add-on Cost (LKR.): <%=addonCost %></h3>
	<h3> Discount : <%=discount %>%</h3>
	<h3> Service Charge (LKR.): <%=serviceCharge %></h3>
	<h3> TAX(vat) (LKR.): <%=vat %>></h3>
	<h2> Final Total (LKR.): <%=finalTotal %></h2>

</div>
</div>
</div>
</div>
</div>

 <script src="lib/bootstrap.min.js"></script>
</body>
</html>