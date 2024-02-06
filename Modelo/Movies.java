package Modelo;

public class Movies {
    private String Nombre;
    private int IDmovies;
    private String Tip;

    public Movies() {
    }

    public Movies(String nombre, int IDmovies, String tip) {
        Nombre = nombre;
        this.IDmovies = IDmovies;
        Tip = tip;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIDmovies() {
        return IDmovies;
    }

    public void setIDmovies(int IDmovies) {
        this.IDmovies = IDmovies;
    }

    public String getTip() {
        return Tip;
    }

    public void setTip(String tip) {
        Tip = tip;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "Nombre='" + Nombre + '\'' +
                ", IDmovies=" + IDmovies +
                ", Tip='" + Tip + '\'' +
                '}';
    }
}
