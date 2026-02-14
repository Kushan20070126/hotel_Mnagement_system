#  Hotel Management System 

 Java Web Application designed for hotel receptionists to calculate guest stays, manage add-on services, and persist billing records to a MySQL database.

##  Features
- **Dynamic Pricing:** Calculates costs for Standard, Deluxe, and Suite rooms based on nights and guest count.
- **Add-on Management:** Automated calculation for Breakfast, Airport Pickup, and Extra Bed services.
- **Smart Discount Engine:**
    - **10% Member Discount** for registered customers.
    - **5% Long-Stay Discount** for non-members staying 5+ nights.
- **Automated Taxation:** Calculates 3% Service Charge and 8% VAT automatically.
- **Unique Transaction ID:** Generates a unique ID for every bill using the Guest's NIC and the exact system time.
- **Persistent Storage:** Full JDBC integration to save finalized bills to a MySQL database.

---

##  Technology Stack
- **Backend:** Java (Jakarta EE / Servlets)
- **Frontend:** JSP, Bootstrap 5 (Responsive UI)
- **Database:** MySQL 8.0
- **Server:** Apache Tomcat 10.x

---

##  Database Setup

1. Create a database named `hotel_db`.
2. Execute the following SQL query to create the table structure:

```sql
CREATE TABLE RoomBookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    customer_id VARCHAR(100), -- Generates as NIC / Time
    nic VARCHAR(50),
    room_type VARCHAR(100),
    room_cost DOUBLE,
    addon_cost DOUBLE,
    discount DOUBLE,
    service_charge DOUBLE,
    vat DOUBLE,
    final_total DOUBLE
);
```
3. change youer mysql port 3307 -> 3306(Default) and  password "root"
```sql
-- Bill.java file ->
	  private static final String URL ="jdbc:mysql://localhost:3307/hotel_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";
```

