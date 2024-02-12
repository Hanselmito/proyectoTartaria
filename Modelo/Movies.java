package Modelo;

public class Movies extends Favorite{
    private String Tip;

    public Movies(String nombre, int ID, String addFav, String tip) {
        super(nombre, ID, addFav);
        this.Tip = tip;
    }

    public Movies() {
        super();
        Tip = "";
    }

    public String getTip() {
        return Tip;
    }

    public void setTip(String tip) {
        Tip = tip;
    }

    @Override
    public String toString() {
        return "Game: " + Tip +super.toString()+".";
    }
}
