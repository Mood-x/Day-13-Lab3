import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> mediaList;
    private List<User> users;

    public Store() {
        this.mediaList = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addMedia(Media media) {
        mediaList.add(media);
        System.out.println(media.getTitle() + " added to store.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getUsername() + " added to store.");
    }

    public void displayMedia() {
        System.out.println("Available media in store:");
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }

    public void displayUsers() {
        System.out.println("Registered users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public Media searchMediaByTitle(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}