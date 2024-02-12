package Modelo;

public class Favorite{
    protected String Nombre;
    protected int ID;
    protected String AddFav;

    public Favorite(String nombre, int ID, String addFav) {
        Nombre = nombre;
        this.ID = ID;
        AddFav = addFav;
    }
    public Favorite(){this("",0,"");}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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