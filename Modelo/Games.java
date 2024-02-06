package Modelo;

public class Games {
    private String Nombre;
    private int IDgames;
    private String Category;

    public Games() {
    }

    public Games(String nombre, int IDgames, String category) {
        Nombre = nombre;
        this.IDgames = IDgames;
        Category = category;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIDgames() {
        return IDgames;
    }

    public void setIDgames(int IDgames) {
        this.IDgames = IDgames;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Games{" +
                "Nombre='" + Nombre + '\'' +
                ", IDgames=" + IDgames +
                ", Category='" + Category + '\'' +
                '}';
    }
}
