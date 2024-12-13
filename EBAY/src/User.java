import java.util.List;

// User Class
class User {
    private String userId;
    private String name;
    private String email;
    private String password; // encrypted
    private String address;
    private List<PaymentMethod> paymentMethods;
    private String userRole; // "Buyer", "Seller", "Admin"
    private List<Rating> ratings;

    // Getters and Setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<PaymentMethod> getPaymentMethods() { return paymentMethods; }
    public void setPaymentMethods(List<PaymentMethod> paymentMethods) { this.paymentMethods = paymentMethods; }

    public String getUserRole() { return userRole; }
    public void setUserRole(String userRole) { this.userRole = userRole; }

    public List<Rating> getRatings() { return ratings; }
    public void setRatings(List<Rating> ratings) { this.ratings = ratings; }
}
