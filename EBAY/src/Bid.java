import java.math.BigDecimal;
import java.util.Date;

class Bid {
    private String bidId;
    private Product product;
    private User bidder;
    private BigDecimal bidAmount;
    private Date bidTime;

    // Getters and Setters
    public String getBidId() { return bidId; }
    public void setBidId(String bidId) { this.bidId = bidId; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public User getBidder() { return bidder; }
    public void setBidder(User bidder) { this.bidder = bidder; }

    public BigDecimal getBidAmount() { return bidAmount; }
    public void setBidAmount(BigDecimal bidAmount) { this.bidAmount = bidAmount; }

    public Date getBidTime() { return bidTime; }
    public void setBidTime(Date bidTime) { this.bidTime = bidTime; }
}