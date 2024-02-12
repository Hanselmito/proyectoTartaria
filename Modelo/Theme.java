package Modelo;

public class Theme extends Favorite{

    private String Clas;

    public Theme(String nombre, int ID, String addFav, String clas) {
        super(nombre, ID, addFav);
        this.Clas = clas;
    }

    public Theme() {
        super();
        Clas = "";
    }

    public String getClas() {
        return Clas;
    }

    public void setClas(String clas) {
        Clas = clas;
    }

    @Override
    public String toString() {
        return "Game: "+ Clas +super.toString()+".";
    }
}
