package Vista;

import Ivew.Iview;
import Modelo.Favorite;
import Modelo.Games;
import Modelo.Movies;
import Modelo.Theme;

import java.util.Scanner;

public class View implements Iview {
    @Override
    public void MuestraMenuPrincipal(){
        System.out.println("***********************************");
        System.out.println("1- añadir película. ");
        System.out.println("2- añadir videojuego. ");
        System.out.println("3- añadir musica. ");
        System.out.println("4- listar librería. ");
        System.out.println("5- salir. ");
        System.out.println("***********************************");
    }
    @Override
    public void MuestraGame(Games[] g){
        System.out.println("Game");
        for (Games Game:g){
            if (Game!=null){
                MuestraGames(Game);
            }
        }
        System.out.println("*+*+*+*+*+*+*+*+*+*+*");
    }
    @Override
    public void MuestraGames(Games g){
        if (g!=null){
            System.out.println("**********");
            System.out.println(g);
            System.out.println("**********");
        }else{
            System.out.println("Library clear");
        }
    }
    @Override
    public void MuestraMovie(Movies[] m){
        System.out.println("Movie");
        for (Movies Movie:m){
            if (Movie!=null){
                MuestraMovies(Movie);
            }
        }
        System.out.println("*+*+*+*+*+*+*+*+*+*+*");
    }
    @Override
    public void MuestraMovies(Movies m){
        if (m!=null){
            System.out.println("**********");
            System.out.println(m);
            System.out.println("**********");
        }else{
            System.out.println("Library clear");
        }
    }
    @Override
    public void MuestraTheme(Theme[] t){
        System.out.println("Game");
        for (Theme Theme:t){
            if (Theme!=null){
                MuestraTheme(Theme);
            }
        }
        System.out.println("*+*+*+*+*+*+*+*+*+*+*");
    }
    @Override
    public void MuestraTheme(Theme t){
        if (t!=null){
            System.out.println("**********");
            System.out.println(t);
            System.out.println("**********");
        }else{
            System.out.println("Library clear");
        }
    }
    @Override
    public void MuestraFavorite(Favorite[] f){
        System.out.println("Favorite");
        for (Favorite Favorite:f){
            if (Favorite !=null){
                MuestraFavorite(Favorite);
            }
        }
        System.out.println("*+*+*+*+*+*+*+*+*+*+*");
    }
    @Override
    public void MuestraFavorite(Favorite f){
        if (f!=null){
            System.out.println("**********");
            System.out.println(f);
            System.out.println("**********");
        }else{
            System.out.println("Library clear");
        }
    }
    @Override
    public Favorite MuestraMenuAnadir(){
        Favorite result = null;
        System.out.println("quieres añadir? ");
        System.out.println("1. Game");
        System.out.println("2. Movie");
        System.out.println("3. Theme");
        int opcion = this.leeEntero("inserta opcion");
        switch (opcion){
            case 1:
                result=new Games();
                break;
            case 2:
                result=new Movies();
                break;
            case 3:
                result=new Theme();
                break;
        }
        if (opcion==1){
            ((Games)result).setNombre(leestring("inserte el juego. "));
        }else if (opcion==2){
            ((Movies)result).setNombre(leestring("inserte la pelicula. "));
        } else if (opcion==3) {
            ((Theme)result).setNombre(leestring("inserte la musica. "));
        }
        return result;
    }
    @Override
    public Favorite MuestraMenuQuitar() {
        String nombre = leestring("inserte la bebida que quieres quitar");
        Favorite result = new Favorite();
        result.setNombre(nombre);
        return result;
    }
    @Override
    public void MuestraResultado(String Resultado) {
        System.out.println("******************+");
        System.out.println(Resultado);
        System.out.println("******************+");
    }
    @Override
    public int leeEntero(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg+": ");
        return teclado.nextInt();
    }
    @Override
    public String leestring(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg+": ");
        return teclado.nextLine();
    }
}