import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;

    public Music(String title, String author, String ISBN, double price, String artist) {
        super(title, author, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user) {
        user.getPurchasedMediaList().add(this);
        System.out.println("User " + user.getUsername() + " is listening to the music '" + getTitle() + "' by " + artist + ".");
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog){
        List<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getAuthor().equalsIgnoreCase(this.artist) && !music.equals(this)) {
                playlist.add(music);
            }
        }
        return playlist;
    }

    @Override
    public String toString() {
        return super.toString() + " Music " + " [ artist: " + artist + " ]";
    }

    @Override
    public String getMediaType() {
        return (getPrice() >= 10) ? "Premium Music" : "Music";
    }


}
