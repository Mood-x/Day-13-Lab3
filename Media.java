public class Media {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Media(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getMediaType() {
        return "Media";
    }

    @Override
    public String toString() {
        return "Media [ title: " + title +  " ] [ author: " + author + " ] [ ISBN: " + ISBN + " ] [ price: " + price + " ]";
    }

    public void purchase(User user) {
    }
}
