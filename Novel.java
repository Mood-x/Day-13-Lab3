public class Novel extends Book {
    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int quantityInStock, String genre) {
        super(title, auteur, ISBN, price, quantityInStock);
        this.genre = genre;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
        return super.toString() + " [ Genre: " + genre + " ]";
    }
}
