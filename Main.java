import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Music> musicCatalog = new ArrayList<>();

        Store store = new Store();

        Music music1 = new Music("Song 1", "Mood", "001", 12.99, "mood");
        musicCatalog.add(music1);

        Music music2 = new Music("Song 2", "Mood", "002", 8.99, "mood");
        musicCatalog.add(music2);

        Music music3 = new Music("Song 3", "Ahmed", "003", 9.99, "ahmed");
        musicCatalog.add(music3);

        String artistToCount = "mood";
        int count = countSongsByArtist(musicCatalog, artistToCount);

        System.out.println("Number of songs by " + artistToCount + ": " + count);

        User user1 = new User("Mohammed", "mood@email.com");
        store.addUser(user1);

        User user2 = new User("Ali", "ali@email.com");
        store.addUser(user2);

        User user3 = new User("Saleh", "saleh@gmail.com");
        store.addUser(user3);

        store.displayUsers();
        System.out.println("-----------------------------------");


        Movie movie = new Movie("Movie 1", "Mood", "009", 44.2, 120);
        store.addMedia(movie);

        Book book1 = new Book("Learn JavaScript", "Saleh", "123", 20.99, 10);
        store.addMedia(book1);

        Book book2 = new Book("Learn Java", "Mohammed", "124", 19.80, 3);
        store.addMedia(book2);

        Book book3 = new Book("Learn C++", "Ahmed", "125", 15.36, 5);
        store.addMedia(book3);

        Book book4 = new Book("Learn React", "Saleh", "126", 10.9, 17);
        store.addMedia(book4);

        store.displayMedia();
        System.out.println("-----------------------------------");

        System.out.println("-----------------------------------");
        user1.addToCart(book1);
        user1.addToCart(book2);
        user1.addToCart(movie);
        user1.addToCart(music2);
        user1.checkout();

        store.displayMedia();
        System.out.println("----------------------------------");

    }

    public static int countSongsByArtist(List<Music> musicCatalog, String artist) {
        int count = 0;
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(artist)) {
                count++;
            }
        }
        return count;

        }
}
