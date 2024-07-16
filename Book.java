import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int quantityInStock;
    private List<Review> reviews;

    public Book(String title, String author, String ISBN, double price, int quantityInStock) {
        super(title, author, ISBN, price);
        this.quantityInStock = quantityInStock;
        this.reviews = new ArrayList<>();
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0;
        }
        double totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }
        return totalRating / reviews.size();
    }

    public void purchase(User user) {
        if (quantityInStock > 0) {
            quantityInStock--;
            System.out.println("Book '" + getTitle() + "' purchased by " + user.getUsername());
        } else {
            System.out.println("Sorry, the book '" + getTitle() + "' is out of stock.");
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        quantityInStock += quantity;
        System.out.println("Book '" + getTitle() + "' restocked. New quantity: " + quantityInStock);
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return super.toString() + " Book " + " [ stock: " + quantityInStock +  " ] " + reviews;
    }
}
