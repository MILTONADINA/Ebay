class Rating {
    private String ratingId;
    private User ratedBy;
    private User ratedUser;
    private int ratingScore; // 1-5
    private String comments;

    // Getters and Setters
    public String getRatingId() { return ratingId; }
    public void setRatingId(String ratingId) { this.ratingId = ratingId; }

    public User getRatedBy() { return ratedBy; }
    public void setRatedBy(User ratedBy) { this.ratedBy = ratedBy; }

    public User getRatedUser() { return ratedUser; }
    public void setRatedUser(User ratedUser) { this.ratedUser = ratedUser; }

    public int getRatingScore() { return ratingScore; }
    public void setRatingScore(int ratingScore) { this.ratingScore = ratingScore; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}