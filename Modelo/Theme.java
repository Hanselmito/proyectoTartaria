package Modelo;

public class Theme {
    private String Nombre;
    private int IDtheme;
    private String Clas;

    public Theme() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIDtheme() {
        return IDtheme;
    }

    public void setIDtheme(int IDtheme) {
        this.IDtheme = IDtheme;
    }

    public String getClas() {
        return Clas;
    }

    public void setClas(String clas) {
        Clas = clas;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "Nombre='" + Nombre + '\'' +
                ", IDtheme=" + IDtheme +
                ", Clas='" + Clas + '\'' +
                '}';
    }
}
