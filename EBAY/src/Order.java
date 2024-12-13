import java.math.BigDecimal;
import java.util.Date;

public class Order {

    private String orderId;
    private User buyer;
    private User seller;
    private Product product;
    private Date orderDate;
    private String deliveryAddress;
    private String status; // "Pending", "Shipped", "Delivered", "Cancelled"

    // Getters and Setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public User getBuyer() { return buyer; }
    public void setBuyer(User buyer) { this.buyer = buyer; }

    public User getSeller() { return seller; }
    public void setSeller(User seller) { this.seller = seller; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }

    public String getDeliveryAddress() { return deliveryAddress; }
    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // Main method
    public static void main(String[] args) {
        // Create users
        User buyer = new User();
        buyer.setUserId("U001");
        buyer.setName("John Doe");
        buyer.setEmail("john.doe@example.com");
        buyer.setAddress("123 Main St, City, Country");
        buyer.setUserRole("Buyer");

        User seller = new User();
        seller.setUserId("U002");
        seller.setName("Jane Smith");
        seller.setEmail("jane.smith@example.com");
        seller.setAddress("456 Market St, City, Country");
        seller.setUserRole("Seller");

        // Create a product
        Product product = new Product();
        product.setProductId("P001");
        product.setTitle("Wireless Headphones");
        product.setDescription("High-quality sound with noise cancellation.");
        product.setPrice(new BigDecimal("99.99"));
        product.setCategory("Electronics");
        product.setSeller(seller);
        product.setCondition("New");
        product.setAuction(false);

        // Create an order
        Order order = new Order();
        order.setOrderId("O001");
        order.setBuyer(buyer);
        order.setSeller(seller);
        order.setProduct(product);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("123 Main St, City, Country");
        order.setStatus("Pending");

        // Display order details
        System.out.println("Order Details:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Buyer: " + order.getBuyer().getName());
        System.out.println("Seller: " + order.getSeller().getName());
        System.out.println("Product: " + order.getProduct().getTitle());
        System.out.println("Price: $" + order.getProduct().getPrice());
        System.out.println("Status: " + order.getStatus());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        System.out.println("Order Date: " + order.getOrderDate());
    }
}
