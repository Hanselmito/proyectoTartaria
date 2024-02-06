package Modelo;

public class Favorite {
    String AddFav;

    public Favorite(String addFav) {
        AddFav = addFav;
    }

    public String getAddFav() {
        return AddFav;
    }

    public void setAddFav(String addFav) {
        AddFav = addFav;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "AddFav='" + AddFav + '\'' +
                '}';
    }
}
