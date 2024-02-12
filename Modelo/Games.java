package Modelo;

public class Games extends Favorite{
    private String Category;

    public Games(String nombre, int ID, String addFav, String category) {
        super(nombre, ID, addFav);
        this.Category = category;
    }

    public Games() {
        super();
        Category = "";
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Game: "+ Category +super.toString()+".";
    }
}
