# Java E-Commerce Auction Platform (Ebay-Inspired System)

A simplified e-commerce auction system implemented in Java. This project models essential features of a bidding and product-ordering platform, similar to core components of sites like eBay. It demonstrates the use of object-oriented design to build user-driven functionality such as bidding, product listings, ratings, and payment handling.

---

## 🧠 Key Skills Demonstrated

- **OOP Design Patterns:** Well-structured class architecture for `User`, `Product`, `Bid`, `Order`, etc.
- **Data Modeling:** Encapsulates core e-commerce concepts including payment methods, bidding logic, and product reviews
- **Business Process Simulation:** Represents full customer interaction flow from listing to bidding to payment
- **Extensibility:** Design allows easy addition of GUI, database, or web components
- **Code Readability:** Clear separation of concerns and entity responsibility

---

## 🧱 Tech Stack

- **Language:** Java SE
- **Structure:** Standalone object model with entity interaction
- **Execution:** CLI or IDE (Eclipse / IntelliJ)
- **Data Format:** In-memory objects (can be extended to file or DB)

---

## 🗂️ Project Structure

EBAY/
├── src/
│ ├── Bid.java → Represents a bid placed by a user on a product
│ ├── Product.java → Product details including current highest bid
│ ├── User.java → Buyer or seller with personal info and ratings
│ ├── Rating.java → Customer feedback mechanism
│ ├── PaymentMethod.java → Models user's payment preferences
│ └── Order.java → Handles post-auction transaction (shipping, payment)




---

## 🚀 How to Run

### Option 1: Using an IDE
1. Open the `src/` folder in Eclipse or IntelliJ
2. Create a `Main.java` to test interaction between objects

### Option 2: From Terminal

```bash
cd EBAY/src
javac *.java
java Main

