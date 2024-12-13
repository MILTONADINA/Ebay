import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

class Product {
    private String productId;
    private String title;
    private String description;
    private BigDecimal price;
    private List<String> images;
    private String category;
    private User seller;
    private String condition; // "New", "Used"
    private boolean isAuction;
    private Date auctionEndDate;

    // Getters and Setters
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public List<String> getImages() { return images; }
    public void setImages(List<String> images) { this.images = images; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public User getSeller() { return seller; }
    public void setSeller(User seller) { this.seller = seller; }

    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }

    public boolean isAuction() { return isAuction; }
    public void setAuction(boolean auction) { isAuction = auction; }

    public Date getAuctionEndDate() { return auctionEndDate; }
    public void setAuctionEndDate(Date auctionEndDate) { this.auctionEndDate = auctionEndDate; }
}
