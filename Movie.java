import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration; // in minutes

    public Movie(String title, String author, String ISBN, double price, int duration) {
        super(title, author, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {
        user.getPurchasedMediaList().add(this);
        System.out.println("User " + user.getUsername() + " is watching the movie '" + getTitle() + "'.");
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> similarMovies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if(movie.getAuthor().equalsIgnoreCase(this.getAuthor()) && !movie.equals(this)){
                similarMovies.add(movie);
            }
        }
        return similarMovies;
    }

    @Override
    public String getMediaType() {
        return (duration >= 120) ? "Long Movie" : "Movie";
    }

    @Override
    public String toString() {
        return super.toString() + " Movie " + " [ duration: " + duration + " ]";
    }
}
