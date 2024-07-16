import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchasedMediaList;
    private List<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchasedMediaList(List<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
        System.out.println(media.getTitle() + " added to cart");
    }

    public void removeFromCart(Media media) {
        if(shoppingCart.remove(media)) {
            System.out.println(media.getTitle() + " removed from cart");
        }else {
            System.out.println(media.getTitle() + " not removed from cart");
        }
    }

    public void checkout() {
        for (Media media : shoppingCart) {
            media.purchase(this);
            purchasedMediaList.add(media);
        }
        shoppingCart.clear();
        System.out.println("Checked out successfully");
    }


    @Override
    public String toString() {
        return super.toString() + " [ Username: " + username + " ] [ Email: " + email + " ]";
    }
}
